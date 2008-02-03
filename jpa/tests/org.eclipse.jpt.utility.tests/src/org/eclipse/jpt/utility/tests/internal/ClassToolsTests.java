/*******************************************************************************
 * Copyright (c) 2005, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.utility.tests.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;
import junit.framework.TestCase;
import org.eclipse.jpt.utility.internal.ClassTools;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterators.TransformationIterator;

public class ClassToolsTests extends TestCase {

	private static String testStaticField;

	public ClassToolsTests(String name) {
		super(name);
	}

	/**
	 * Return the compiler-generated class name. The Eclipse compiler generates
	 * "local" classes with names in the form "com.foo.Outer$1$Local"; while the
	 * JDK compiler generates "com.foo.Outer$1Local". There might be other
	 * differences.... ~bjv
	 */
	public static String compilerDependentClassNameFor(String className) {
		int index = className.indexOf("$1$");
		if (index == -1) {
			return className;
		}
		try {
			Class.forName(className);
		} catch (ClassNotFoundException ex) {
			return className.substring(0, index + 2) + className.substring(index + 3);
		}
		return className;
	}

	private static String munge(String className) {
		return compilerDependentClassNameFor(className);
	}

	public void testAllFields() {
		int fieldCount = 0;
		fieldCount += java.util.Vector.class.getDeclaredFields().length;
		fieldCount += java.util.AbstractList.class.getDeclaredFields().length;
		fieldCount += java.util.AbstractCollection.class.getDeclaredFields().length;
		fieldCount += java.lang.Object.class.getDeclaredFields().length;
		Field[] fields = ClassTools.allFields(java.util.Vector.class);
		assertEquals(fieldCount, fields.length);
		assertTrue(CollectionTools.contains(this.names(fields), "modCount"));
		assertTrue(CollectionTools.contains(this.names(fields), "serialVersionUID"));
		assertTrue(CollectionTools.contains(this.names(fields), "capacityIncrement"));
		assertTrue(CollectionTools.contains(this.names(fields), "elementCount"));
		assertTrue(CollectionTools.contains(this.names(fields), "elementData"));
		assertTrue(fields[0].isAccessible());
	}

	public void testAllMethods() {
		int methodCount = 0;
		methodCount += java.util.Vector.class.getDeclaredMethods().length;
		methodCount += java.util.AbstractList.class.getDeclaredMethods().length;
		methodCount += java.util.AbstractCollection.class.getDeclaredMethods().length;
		methodCount += java.lang.Object.class.getDeclaredMethods().length;
		Method[] methods = ClassTools.allMethods(java.util.Vector.class);
		assertEquals(methodCount, methods.length);
		assertTrue(CollectionTools.contains(this.names(methods), "wait"));
		assertTrue(CollectionTools.contains(this.names(methods), "addElement"));
		assertTrue(methods[0].isAccessible());
	}

	public void testNewInstanceClass() {
		Vector<?> v = ClassTools.newInstance(java.util.Vector.class);
		assertNotNull(v);
		assertEquals(0, v.size());
	}

	public void testNewInstanceClassClassObject() {
		int initialCapacity = 200;
		Vector<?> v = ClassTools.newInstance(java.util.Vector.class, int.class, new Integer(initialCapacity));
		assertNotNull(v);
		assertEquals(0, v.size());
		Object[] elementData = (Object[]) ClassTools.fieldValue(v, "elementData");
		assertEquals(initialCapacity, elementData.length);
	}

	public void testNewInstanceClassClassArrayObjectArray() {
		int initialCapacity = 200;
		Class<?>[] parmTypes = new Class[1];
		parmTypes[0] = int.class;
		Object[] parms = new Object[1];
		parms[0] = new Integer(initialCapacity);
		Vector<?> v = ClassTools.newInstance(java.util.Vector.class, parmTypes, parms);
		assertNotNull(v);
		assertEquals(0, v.size());
		Object[] elementData = (Object[]) ClassTools.fieldValue(v, "elementData");
		assertEquals(initialCapacity, elementData.length);

		parms[0] = new Integer(-1);
		boolean exCaught = false;
		try {
			v = ClassTools.newInstance(java.util.Vector.class, parmTypes, parms);
		} catch (RuntimeException ex) {
			exCaught = true;
		}
		assertTrue("RuntimeException not thrown", exCaught);

		parmTypes[0] = java.lang.String.class;
		parms[0] = "foo";
		exCaught = false;
		try {
			v = ClassTools.attemptNewInstance(java.util.Vector.class, parmTypes, parms);
		} catch (NoSuchMethodException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchMethodException not thrown", exCaught);
	}

	public void testFieldValue() {
		int initialCapacity = 200;
		Vector<?> v = new Vector<Object>(initialCapacity);
		Object[] elementData = (Object[]) ClassTools.fieldValue(v, "elementData");
		assertEquals(initialCapacity, elementData.length);

		// test inherited field
		Integer modCountInteger = (Integer) ClassTools.fieldValue(v, "modCount");
		int modCount = modCountInteger.intValue();
		assertEquals(0, modCount);

		boolean exCaught = false;
		Object bogusFieldValue = null;
		try {
			bogusFieldValue = ClassTools.attemptToGetFieldValue(v, "bogusField");
		} catch (NoSuchFieldException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchFieldException not thrown: " + bogusFieldValue, exCaught);
	}

	public void testExecuteMethodObjectString() {
		Vector<String> v = new Vector<String>();
		int size = ((Integer) ClassTools.executeMethod(v, "size")).intValue();
		assertEquals(0, size);

		v.addElement("foo");
		size = ((Integer) ClassTools.executeMethod(v, "size")).intValue();
		assertEquals(1, size);
	}

	public void testExecuteMethodObjectStringClassObject() {
		Vector<String> v = new Vector<String>();
		boolean booleanResult = ((Boolean) ClassTools.executeMethod(v, "add", Object.class, "foo")).booleanValue();
		assertTrue(booleanResult);
		assertTrue(v.contains("foo"));
		Object voidResult = ClassTools.executeMethod(v, "addElement", Object.class, "bar");
		assertNull(voidResult);
	}

	public void testExecuteMethodObjectStringClassArrayObjectArray() {
		Vector<String> v = new Vector<String>();
		Class<?>[] parmTypes = new Class[1];
		parmTypes[0] = java.lang.Object.class;
		Object[] parms = new Object[1];
		parms[0] = "foo";
		boolean booleanResult = ((Boolean) ClassTools.executeMethod(v, "add", parmTypes, parms)).booleanValue();
		assertTrue(booleanResult);
		assertTrue(v.contains("foo"));

		boolean exCaught = false;
		Object bogusMethodReturnValue = null;
		try {
			bogusMethodReturnValue = ClassTools.attemptToExecuteMethod(v, "bogusMethod", parmTypes, parms);
		} catch (NoSuchMethodException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchMethodException not thrown: " + bogusMethodReturnValue, exCaught);
	}

	public void testExecuteStaticMethodClassString() {
		Double randomObject = (Double) ClassTools.executeStaticMethod(java.lang.Math.class, "random");
		assertNotNull(randomObject);
		double random = randomObject.doubleValue();
		assertTrue(random >= 0);
		assertTrue(random < 1);
	}

	public void testExecuteStaticMethodClassStringClassObject() {
		String s = (String) ClassTools.executeStaticMethod(java.lang.String.class, "valueOf", boolean.class, Boolean.TRUE);
		assertNotNull(s);
		assertEquals("true", s);
	}

	public void testExecuteStaticMethodClassStringClassArrayObjectArray() {
		Class<?>[] parmTypes = new Class[1];
		parmTypes[0] = boolean.class;
		Object[] parms = new Object[1];
		parms[0] = Boolean.TRUE;
		String s = (String) ClassTools.executeStaticMethod(java.lang.String.class, "valueOf", parmTypes, parms);
		assertNotNull(s);
		assertEquals("true", s);

		boolean exCaught = false;
		Object bogusStaticMethodReturnValue = null;
		try {
			bogusStaticMethodReturnValue = ClassTools.attemptToExecuteStaticMethod(java.lang.String.class, "bogusStaticMethod", parmTypes, parms);
		} catch (NoSuchMethodException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchMethodException not thrown: " + bogusStaticMethodReturnValue, exCaught);

		// test non-static method
		exCaught = false;
		try {
			bogusStaticMethodReturnValue = ClassTools.attemptToExecuteStaticMethod(java.lang.String.class, "toString");
		} catch (NoSuchMethodException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchMethodException not thrown: " + bogusStaticMethodReturnValue, exCaught);
	}

	public void testSetFieldValue() {
		Vector<String> v = new Vector<String>();
		Object[] newElementData = new Object[5];
		newElementData[0] = "foo";
		ClassTools.setFieldValue(v, "elementData", newElementData);
		ClassTools.setFieldValue(v, "elementCount", new Integer(1));
		// test inherited field
		ClassTools.setFieldValue(v, "modCount", new Integer(1));
		assertTrue(v.contains("foo"));

		boolean exCaught = false;
		try {
			ClassTools.attemptToSetFieldValue(v, "bogusField", "foo");
		} catch (NoSuchFieldException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchFieldException not thrown", exCaught);
	}

	public void testSetStaticFieldValue() {
		ClassTools.setStaticFieldValue(this.getClass(), "testStaticField", "new value");
		assertEquals(testStaticField, "new value");

		boolean exCaught = false;
		try {
			ClassTools.attemptToSetStaticFieldValue(this.getClass(), "bogusStaticField", "new value");
		} catch (NoSuchFieldException ex) {
			exCaught = true;
		}
		assertTrue("NoSuchFieldException not thrown", exCaught);
	}

	public void testShortName() {
		assertEquals("Vector", ClassTools.shortClassNameForObject(new java.util.Vector<Object>()));
		assertEquals("Vector", ClassTools.shortNameFor(java.util.Vector.class));
	}

	public void testNestedName() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("foo", "bar");
		Entry<String, String> entry = map.entrySet().iterator().next();
		assertEquals("Entry", ClassTools.nestedClassNameForObject(entry));
		assertEquals("Entry", ClassTools.nestedNameFor(java.util.Map.Entry.class));
	}

	public void testPackageName() {
		assertEquals("java.util", ClassTools.packageNameFor(java.util.Vector.class));
		assertEquals("java.util", ClassTools.packageNameFor(java.util.Map.Entry.class));
	}

	public void testArrayDepthFor() {
		assertEquals(0, ClassTools.arrayDepthFor(java.util.Vector.class));
		assertEquals(0, ClassTools.arrayDepthFor(int.class));
		assertEquals(0, ClassTools.arrayDepthFor(void.class));
		assertEquals(1, ClassTools.arrayDepthFor(java.util.Vector[].class));
		assertEquals(1, ClassTools.arrayDepthFor(int[].class));
		assertEquals(3, ClassTools.arrayDepthFor(java.util.Vector[][][].class));
		assertEquals(3, ClassTools.arrayDepthFor(int[][][].class));
	}

	public void testArrayDepthForObject() {
		assertEquals(0, ClassTools.arrayDepthForObject(new java.util.Vector<Object>()));
		assertEquals(1, ClassTools.arrayDepthForObject(new java.util.Vector[0]));
		assertEquals(1, ClassTools.arrayDepthForObject(new int[0]));
		assertEquals(3, ClassTools.arrayDepthForObject(new java.util.Vector[0][0][0]));
		assertEquals(3, ClassTools.arrayDepthForObject(new int[0][0][0]));
	}

	public void testArrayDepthForClassNamed() {
		assertEquals(0, ClassTools.arrayDepthForClassNamed(java.util.Vector.class.getName()));
		assertEquals(0, ClassTools.arrayDepthForClassNamed(int.class.getName()));
		assertEquals(0, ClassTools.arrayDepthForClassNamed(void.class.getName()));
		assertEquals(1, ClassTools.arrayDepthForClassNamed(java.util.Vector[].class.getName()));
		assertEquals(1, ClassTools.arrayDepthForClassNamed(int[].class.getName()));
		assertEquals(3, ClassTools.arrayDepthForClassNamed(java.util.Vector[][][].class.getName()));
		assertEquals(3, ClassTools.arrayDepthForClassNamed(int[][][].class.getName()));
	}

	public void testElementTypeFor() {
		assertEquals(java.util.Vector.class, ClassTools.elementTypeFor(java.util.Vector.class));
		assertEquals(int.class, ClassTools.elementTypeFor(int.class));
		assertEquals(void.class, ClassTools.elementTypeFor(void.class));
		assertEquals(java.util.Vector.class, ClassTools.elementTypeFor(java.util.Vector[].class));
		assertEquals(int.class, ClassTools.elementTypeFor(int[].class));
		assertEquals(java.util.Vector.class, ClassTools.elementTypeFor(java.util.Vector[][][].class));
		assertEquals(int.class, ClassTools.elementTypeFor(int[][][].class));
	}

	public void testElementTypeForObject() {
		assertEquals(java.util.Vector.class, ClassTools.elementTypeForObject(new java.util.Vector<Object>()));
		assertEquals(java.util.Vector.class, ClassTools.elementTypeForObject(new java.util.Vector[0]));
		assertEquals(int.class, ClassTools.elementTypeForObject(new int[0]));
		assertEquals(java.util.Vector.class, ClassTools.elementTypeForObject(new java.util.Vector[0][0][0]));
		assertEquals(int.class, ClassTools.elementTypeForObject(new int[0][0][0]));
	}

	public void testElementTypeNameFor() {
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameFor(java.util.Vector.class));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameFor(int.class));
		assertEquals(void.class.getName(), ClassTools.elementTypeNameFor(void.class));
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameFor(java.util.Vector[].class));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameFor(int[].class));
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameFor(java.util.Vector[][][].class));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameFor(int[][][].class));
	}

	public void testElementTypeNameForClassNamed() {
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameForClassNamed(java.util.Vector.class.getName()));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameForClassNamed(int.class.getName()));
		assertEquals(void.class.getName(), ClassTools.elementTypeNameForClassNamed(void.class.getName()));
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameForClassNamed(java.util.Vector[].class.getName()));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameForClassNamed(int[].class.getName()));
		assertEquals(java.util.Vector.class.getName(), ClassTools.elementTypeNameForClassNamed(java.util.Vector[][][].class.getName()));
		assertEquals(int.class.getName(), ClassTools.elementTypeNameForClassNamed(int[][][].class.getName()));
	}

	public void testClassCodes() {
		assertEquals("byte", ClassTools.classNameForCode('B'));
		assertEquals("char", ClassTools.classNameForCode('C'));
		assertEquals("double", ClassTools.classNameForCode('D'));
		assertEquals("float", ClassTools.classNameForCode('F'));
		assertEquals("int", ClassTools.classNameForCode('I'));
		assertEquals("long", ClassTools.classNameForCode('J'));
		assertEquals("short", ClassTools.classNameForCode('S'));
		assertEquals("boolean", ClassTools.classNameForCode('Z'));
		assertEquals("void", ClassTools.classNameForCode('V'));

		boolean exCaught = false;
		try {
			ClassTools.classNameForCode('X');
		} catch (IllegalArgumentException ex) {
			exCaught = true;
		}
		assertTrue("IllegalArgumentException not thrown", exCaught);
	}

	public void testClassNamedIsTopLevel() throws Exception {
		assertTrue(ClassTools.classNamedIsTopLevel(java.util.Map.class.getName())); // top-level
		assertFalse(ClassTools.classNamedIsTopLevel(java.util.Map.Entry.class.getName())); // member
		assertFalse(ClassTools.classNamedIsTopLevel(Class.forName(munge(this.getClass().getName() + "$1$LocalClass")).getName())); // local
		assertFalse(ClassTools.classNamedIsTopLevel(Class.forName("java.util.Vector$1").getName())); // anonymous

		Object[] array = new java.util.Map[0]; // top-level
		assertFalse(ClassTools.classNamedIsTopLevel(array.getClass().getName()));
		array = new java.util.Map.Entry[0]; // member
		assertFalse(ClassTools.classNamedIsTopLevel(array.getClass().getName()));
		Class<?> localClass = Class.forName(munge(this.getClass().getName() + "$1$LocalClass")); // local
		array = (Object[]) Array.newInstance(localClass, 0);
		assertFalse(ClassTools.classNamedIsTopLevel(array.getClass().getName()));
		Class<?> anonClass = Class.forName("java.util.Vector$1"); // local
		array = (Object[]) Array.newInstance(anonClass, 0);
		assertFalse(ClassTools.classNamedIsTopLevel(array.getClass().getName()));
	}

	public void testClassNamedIsMember() throws Exception {
		assertFalse(ClassTools.classNamedIsMember(java.util.Map.class.getName())); // top-level
		assertTrue(ClassTools.classNamedIsMember(java.util.Map.Entry.class.getName())); // member
		assertFalse(ClassTools.classNamedIsMember(Class.forName(munge(this.getClass().getName() + "$1$LocalClass")).getName())); // local
		assertFalse(ClassTools.classNamedIsMember(Class.forName("java.util.Vector$1").getName())); // anonymous

		Object[] array = new java.util.Map[0]; // top-level
		assertFalse(ClassTools.classNamedIsMember(array.getClass().getName()));
		array = new java.util.Map.Entry[0]; // member
		assertFalse(ClassTools.classNamedIsMember(array.getClass().getName()));
		Class<?> localClass = Class.forName(munge(this.getClass().getName() + "$1$LocalClass")); // local
		array = (Object[]) Array.newInstance(localClass, 0);
		assertFalse(ClassTools.classNamedIsMember(array.getClass().getName()));
		Class<?> anonClass = Class.forName("java.util.Vector$1"); // local
		array = (Object[]) Array.newInstance(anonClass, 0);
		assertFalse(ClassTools.classNamedIsMember(array.getClass().getName()));

		// test a few edge cases
		assertTrue(ClassTools.classNamedIsMember("java.util.Map$a1"));
		assertTrue(ClassTools.classNamedIsMember("java.util.Map$a1$aaa$bbb"));
		assertFalse(ClassTools.classNamedIsMember("java.util.Map$1a1$aaa"));
		assertFalse(ClassTools.classNamedIsMember("java.util.Map$1a"));
		assertTrue(ClassTools.classNamedIsMember("java.util.Map$a12345$b12345"));
		assertFalse(ClassTools.classNamedIsMember("java.util.Map$12345a"));
		assertFalse(ClassTools.classNamedIsMember("java.util.Map$333"));
		assertFalse(ClassTools.classNamedIsMember("java.util.Map3$333"));
	}

	public void testClassNamedIsLocal() throws Exception {
		class LocalClass {
			void foo() {
				System.getProperty("foo");
			}
		}
		new LocalClass().foo();
		assertFalse(ClassTools.classNamedIsLocal(java.util.Map.class.getName())); // top-level
		assertFalse(ClassTools.classNamedIsLocal(java.util.Map.Entry.class.getName())); // member
		assertTrue(ClassTools.classNamedIsLocal(Class.forName(munge(this.getClass().getName() + "$1$LocalClass")).getName())); // local
		assertFalse(ClassTools.classNamedIsLocal(Class.forName("java.util.Vector$1").getName())); // anonymous

		Object[] array = new java.util.Map[0]; // top-level
		assertFalse(ClassTools.classNamedIsLocal(array.getClass().getName()));
		array = new java.util.Map.Entry[0]; // member
		assertFalse(ClassTools.classNamedIsLocal(array.getClass().getName()));
		Class<?> localClass = Class.forName(munge(this.getClass().getName() + "$1$LocalClass")); // local
		array = (Object[]) Array.newInstance(localClass, 0);
		assertFalse(ClassTools.classNamedIsLocal(array.getClass().getName()));
		Class<?> anonClass = Class.forName("java.util.Vector$1"); // local
		array = (Object[]) Array.newInstance(anonClass, 0);
		assertFalse(ClassTools.classNamedIsLocal(array.getClass().getName()));

		// test a few edge cases
		assertFalse(ClassTools.classNamedIsLocal("java.util.Map$a1"));
		assertFalse(ClassTools.classNamedIsLocal("java.util.Map$a1$aaa$bbb"));
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$11$aaa"));
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$1$a")); // eclipse naming convention
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$2$abc")); // eclipse naming convention
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$2$abc1")); // eclipse naming convention
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$1a")); // jdk naming convention
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$2abc")); // jdk naming convention
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$2abc1")); // jdk naming convention
		assertFalse(ClassTools.classNamedIsLocal("java.util.Map$a12345$b12345"));
		assertTrue(ClassTools.classNamedIsLocal("java.util.Map$12345$a1234"));
		assertFalse(ClassTools.classNamedIsLocal("java.util.Map$333"));
		assertFalse(ClassTools.classNamedIsLocal("java.util.Map3$333"));
	}

	public void testClassNamedIsAnonymous() throws Exception {
		assertFalse(ClassTools.classNamedIsAnonymous(java.util.Map.class.getName())); // top-level
		assertFalse(ClassTools.classNamedIsAnonymous(java.util.Map.Entry.class.getName())); // member
		assertFalse(ClassTools.classNamedIsAnonymous(Class.forName(munge(this.getClass().getName() + "$1$LocalClass")).getName())); // local
		assertTrue(ClassTools.classNamedIsAnonymous(Class.forName("java.util.Vector$1").getName())); // anonymous

		Object[] array = new java.util.Map[0]; // top-level
		assertFalse(ClassTools.classNamedIsAnonymous(array.getClass().getName()));
		array = new java.util.Map.Entry[0]; // member
		assertFalse(ClassTools.classNamedIsAnonymous(array.getClass().getName()));
		Class<?> localClass = Class.forName(munge(this.getClass().getName() + "$1$LocalClass")); // local
		array = (Object[]) Array.newInstance(localClass, 0);
		assertFalse(ClassTools.classNamedIsAnonymous(array.getClass().getName()));
		Class<?> anonClass = Class.forName("java.util.Vector$1"); // local
		array = (Object[]) Array.newInstance(anonClass, 0);
		assertFalse(ClassTools.classNamedIsAnonymous(array.getClass().getName()));

		// test a few edge cases
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$a1"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$a1$aaa$bbb"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$1a1$aaa"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$1$a"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$1a"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$a12345$b12345"));
		assertFalse(ClassTools.classNamedIsAnonymous("java.util.Map$12345$a1234"));
		assertTrue(ClassTools.classNamedIsAnonymous("java.util.Map$333"));
		assertTrue(ClassTools.classNamedIsAnonymous("java.util.Map3$333"));
	}

	public void testCodeForClass() {
		assertEquals('I', ClassTools.codeForClass(int.class));
		assertEquals('B', ClassTools.codeForClass(byte.class));
	}

	public void testCodeForClassNamed() {
		assertEquals('I', ClassTools.codeForClassNamed(int.class.getName()));
		assertEquals('I', ClassTools.codeForClassNamed("int"));
		assertEquals('B', ClassTools.codeForClassNamed(byte.class.getName()));
		assertEquals('B', ClassTools.codeForClassNamed("byte"));
	}

	public void testClassIsPrimitiveWrapperClass() {
		assertTrue(ClassTools.classIsPrimitiveWrapperClass(java.lang.Void.class));
		assertTrue(ClassTools.classIsPrimitiveWrapperClass(java.lang.Boolean.class));
		assertTrue(ClassTools.classIsPrimitiveWrapperClass(java.lang.Integer.class));
		assertTrue(ClassTools.classIsPrimitiveWrapperClass(java.lang.Float.class));

		assertFalse(ClassTools.classIsPrimitiveWrapperClass(java.lang.String.class));
		assertFalse(ClassTools.classIsPrimitiveWrapperClass(void.class));
		assertFalse(ClassTools.classIsPrimitiveWrapperClass(int.class));
	}

	public void testClassIsVariablePrimitiveWrapperClass() {
		assertFalse(ClassTools.classIsVariablePrimitiveWrapperClass(java.lang.Void.class));

		assertTrue(ClassTools.classIsVariablePrimitiveWrapperClass(java.lang.Boolean.class));
		assertTrue(ClassTools.classIsVariablePrimitiveWrapperClass(java.lang.Integer.class));
		assertTrue(ClassTools.classIsVariablePrimitiveWrapperClass(java.lang.Float.class));

		assertFalse(ClassTools.classIsVariablePrimitiveWrapperClass(java.lang.String.class));
		assertFalse(ClassTools.classIsVariablePrimitiveWrapperClass(void.class));
		assertFalse(ClassTools.classIsVariablePrimitiveWrapperClass(int.class));
	}

	public void testClassNamedIsPrimitive() {
		assertTrue(void.class.isPrimitive());

		assertTrue(ClassTools.classNamedIsPrimitive(void.class.getName()));
		assertTrue(ClassTools.classNamedIsPrimitive(int.class.getName()));
		assertTrue(ClassTools.classNamedIsPrimitive(float.class.getName()));
		assertTrue(ClassTools.classNamedIsPrimitive(boolean.class.getName()));

		assertFalse(ClassTools.classNamedIsPrimitive(java.lang.Number.class.getName()));
		assertFalse(ClassTools.classNamedIsPrimitive(java.lang.String.class.getName()));
		assertFalse(ClassTools.classNamedIsPrimitive(java.lang.Boolean.class.getName()));
		assertFalse(ClassTools.classNamedIsPrimitive(java.lang.Integer.class.getName()));
	}

	public void testClassNamedIsVariablePrimitive() {
		assertFalse(ClassTools.classNamedIsVariablePrimitive(void.class.getName()));

		assertTrue(ClassTools.classNamedIsVariablePrimitive(int.class.getName()));
		assertTrue(ClassTools.classNamedIsVariablePrimitive(float.class.getName()));
		assertTrue(ClassTools.classNamedIsVariablePrimitive(boolean.class.getName()));

		assertFalse(ClassTools.classNamedIsVariablePrimitive(java.lang.Number.class.getName()));
		assertFalse(ClassTools.classNamedIsVariablePrimitive(java.lang.String.class.getName()));
		assertFalse(ClassTools.classNamedIsVariablePrimitive(java.lang.Boolean.class.getName()));
	}

	public void testClassNamedIsVariablePrimitiveWrapperClass() {
		assertFalse(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Void.class.getName()));

		assertTrue(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Integer.class.getName()));
		assertTrue(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Float.class.getName()));
		assertTrue(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Boolean.class.getName()));

		assertFalse(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Number.class.getName()));
		assertFalse(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.String.class.getName()));
		assertFalse(ClassTools.classNamedIsVariablePrimitiveWrapperClass(java.lang.Object.class.getName()));
	}

	public void testClassForTypeDeclarationStringInt() throws Exception {
		assertEquals(int.class, ClassTools.classForTypeDeclaration("int", 0));
		assertEquals(int[].class, ClassTools.classForTypeDeclaration("int", 1));
		assertEquals(int[][][].class, ClassTools.classForTypeDeclaration("int", 3));

		assertEquals(Object.class, ClassTools.classForTypeDeclaration("java.lang.Object", 0));
		assertEquals(Object[][][].class, ClassTools.classForTypeDeclaration("java.lang.Object", 3));

		assertEquals(void.class, ClassTools.classForTypeDeclaration("void", 0));
		try {
			ClassTools.classForTypeDeclaration(void.class.getName(), 1);
			fail("should not get here...");
		} catch (ClassNotFoundException ex) {
			// expected
		}
	}

	public void testClassNameForTypeDeclarationString() throws Exception {
		assertEquals("int", ClassTools.classNameForTypeDeclaration("int"));
		assertEquals("[I", ClassTools.classNameForTypeDeclaration("int[]"));
		assertEquals("[[I", ClassTools.classNameForTypeDeclaration("int [ ] [ ]"));

		assertEquals("java.lang.Object", ClassTools.classNameForTypeDeclaration("java.lang.Object"));
		assertEquals("[Ljava.lang.Object;", ClassTools.classNameForTypeDeclaration("java.lang.Object\t[]"));
		assertEquals("[[Ljava.lang.Object;", ClassTools.classNameForTypeDeclaration("java.lang.Object\t[]\t[]"));
	}

	public void testArrayDepthForTypeDeclarationString() throws Exception {
		assertEquals(0, ClassTools.arrayDepthForTypeDeclaration("java.lang.Object"));
		assertEquals(1, ClassTools.arrayDepthForTypeDeclaration("java.lang.Object[]"));
		assertEquals(3, ClassTools.arrayDepthForTypeDeclaration("java.lang.Object[][][]"));

		assertEquals(0, ClassTools.arrayDepthForTypeDeclaration("int"));
		assertEquals(1, ClassTools.arrayDepthForTypeDeclaration("int[]"));
		assertEquals(3, ClassTools.arrayDepthForTypeDeclaration("int[][][]"));

		assertEquals(0, ClassTools.arrayDepthForTypeDeclaration("float"));
		assertEquals(1, ClassTools.arrayDepthForTypeDeclaration("float [ ]"));
		assertEquals(3, ClassTools.arrayDepthForTypeDeclaration("float[] [] []"));
	}

	public void testClassNameForTypeDeclarationStringInt() throws Exception {
		assertEquals(int.class.getName(), ClassTools.classNameForTypeDeclaration("int", 0));
		assertEquals(int[].class.getName(), ClassTools.classNameForTypeDeclaration("int", 1));
		assertEquals(int[][][].class.getName(), ClassTools.classNameForTypeDeclaration("int", 3));

		assertEquals(Object.class.getName(), ClassTools.classNameForTypeDeclaration("java.lang.Object", 0));
		assertEquals(Object[][][].class.getName(), ClassTools.classNameForTypeDeclaration("java.lang.Object", 3));

		assertEquals(void.class.getName(), ClassTools.classNameForTypeDeclaration("void", 0));
		try {
			ClassTools.classNameForTypeDeclaration(void.class.getName(), 1);
			fail("should not get here...");
		} catch (IllegalArgumentException ex) {
			// expected
		}
	}

	private Iterator<String> names(Field[] fields) {
		return new TransformationIterator<Field, String>(CollectionTools.iterator(fields)) {
			@Override
			protected String transform(Field field) {
				return field.getName();
			}
		};
	}

	private Iterator<String> names(Method[] methods) {
		return new TransformationIterator<Method, String>(CollectionTools.iterator(methods)) {
			@Override
			protected String transform(Method method) {
				return method.getName();
			}
		};
	}

}
