/*******************************************************************************
 * Copyright (c) 2007, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java.source;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jpt.core.internal.jpa2.resource.java.GeneratedAnnotationDefinition;
import org.eclipse.jpt.core.internal.jpa2.resource.java.StaticMetamodelAnnotationDefinition;
import org.eclipse.jpt.core.internal.utility.jdt.ASTTools;
import org.eclipse.jpt.core.internal.utility.jdt.JDTType;
import org.eclipse.jpt.core.jpa2.resource.java.GeneratedAnnotation;
import org.eclipse.jpt.core.jpa2.resource.java.JavaResourcePersistentType2_0;
import org.eclipse.jpt.core.jpa2.resource.java.StaticMetamodelAnnotation;
import org.eclipse.jpt.core.resource.java.AccessType;
import org.eclipse.jpt.core.resource.java.Annotation;
import org.eclipse.jpt.core.resource.java.JavaResourceCompilationUnit;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.utility.jdt.Type;
import org.eclipse.jpt.utility.MethodSignature;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.SimpleIntReference;
import org.eclipse.jpt.utility.internal.StringTools;
import org.eclipse.jpt.utility.internal.iterables.LiveCloneIterable;
import org.eclipse.jpt.utility.internal.iterators.CompositeIterator;
import org.eclipse.jpt.utility.internal.iterators.FilteringIterator;
import org.eclipse.jpt.utility.internal.iterators.TreeIterator;

/**
 * Java source persistent type
 */
final class SourcePersistentType
	extends SourcePersistentMember<Type>
	implements JavaResourcePersistentType2_0
{
	private String name;

	private String qualifiedName;

	private String packageName;

	private String superclassQualifiedName;

	private String declaringTypeName;

	private boolean abstract_;  // 'abstract' is a reserved word

	private boolean static_;  // 'static' is a reserved word

	private boolean memberType;

	private boolean hasPrivateNoArgConstructor;

	private boolean hasNoArgConstructor;

	private final Vector<JavaResourcePersistentType> types = new Vector<JavaResourcePersistentType>();

	private final Vector<JavaResourcePersistentAttribute> fields = new Vector<JavaResourcePersistentAttribute>();

	private final Vector<JavaResourcePersistentAttribute> methods = new Vector<JavaResourcePersistentAttribute>();

	private StaticMetamodelAnnotation staticMetamodelAnnotation;
		//TODO move to interface after maintenance
		public static final String STATIC_METAMODEL_ANNOTATION_PROPERTY = "staticMetamodelAnnotation"; //$NON-NLS-1$

	private GeneratedAnnotation generatedAnnotation;
		//TODO move to interface after maintenance
		public static final String GENERATED_ANNOTATION_PROPERTY = "generatedAnnotation"; //$NON-NLS-1$


	private static final StaticMetamodelAnnotationDefinition STATIC_METAMODEL_ANNOTATION_DEFINITION = StaticMetamodelAnnotationDefinition.instance();
	private static final GeneratedAnnotationDefinition GENERATED_ANNOTATION_DEFINITION = GeneratedAnnotationDefinition.instance();


	// ********** construction/initialization **********

	/**
	 * build top-level persistent type
	 */
	static JavaResourcePersistentType newInstance(
			JavaResourceCompilationUnit javaResourceCompilationUnit,
			TypeDeclaration typeDeclaration,
			CompilationUnit astRoot) {
		Type type = new JDTType(
				typeDeclaration,
				javaResourceCompilationUnit.getCompilationUnit(),
				javaResourceCompilationUnit.getModifySharedDocumentCommandExecutor(),
				javaResourceCompilationUnit.getAnnotationEditFormatter());
		JavaResourcePersistentType jrpt = new SourcePersistentType(javaResourceCompilationUnit, type);
		jrpt.initialize(astRoot);
		return jrpt;
	}

	/**
	 * build nested persistent type
	 */
	private static JavaResourcePersistentType newInstance(
			JavaResourceCompilationUnit javaResourceCompilationUnit,
			Type declaringType,
			TypeDeclaration typeDeclaration,
			int occurrence,
			CompilationUnit astRoot) {
		Type type = new JDTType(
				declaringType,
				typeDeclaration,
				occurrence,
				javaResourceCompilationUnit.getCompilationUnit(),
				javaResourceCompilationUnit.getModifySharedDocumentCommandExecutor(),
				javaResourceCompilationUnit.getAnnotationEditFormatter());
		JavaResourcePersistentType jrpt = new SourcePersistentType(javaResourceCompilationUnit, type);
		jrpt.initialize(astRoot);
		return jrpt;
	}

	private SourcePersistentType(JavaResourceCompilationUnit javaResourceCompilationUnit, Type type) {
		super(javaResourceCompilationUnit, type);
	}

	@Override
	public void initialize(CompilationUnit astRoot) {
		super.initialize(astRoot);
		ITypeBinding binding = this.annotatedElement.getBinding(astRoot);
		this.name = this.buildName(binding);
		this.qualifiedName = this.buildQualifiedName(binding);
		this.packageName = this.buildPackageName(binding);
		this.superclassQualifiedName = this.buildSuperclassQualifiedName(binding);
		this.declaringTypeName = this.buildDeclaringTypeName(binding);
		this.abstract_ = this.buildAbstract(binding);
		this.static_ = this.buildStatic(binding);
		this.memberType = this.buildMemberType(binding);
		this.hasNoArgConstructor = this.buildHasNoArgConstructor(binding);
		this.hasPrivateNoArgConstructor = this.buildHasPrivateNoArgConstructor(binding);
		this.initializeTypes(astRoot);
		this.initializeFields(astRoot);
		this.initializeMethods(astRoot);
	}

	/**
	 * Handle the <code>StaticMetamodel</code> and <code>Generated</code>
	 * annotations differently, since they are not really JPA "mapping"
	 * annotations....
	 */
	@Override
	void addInitialAnnotation(String astAnnotationName, CompilationUnit astRoot) {
		if (astAnnotationName.equals(STATIC_METAMODEL_ANNOTATION_DEFINITION.getAnnotationName())) {
			this.addInitialStaticMetamodelAnnotation(astRoot);
		} else if (astAnnotationName.equals(GENERATED_ANNOTATION_DEFINITION.getAnnotationName())) {
			this.addInitialGeneratedAnnotation(astRoot);
		} else {
			super.addInitialAnnotation(astAnnotationName, astRoot);
		}
	}


	// ********** update **********

	@Override
	public void synchronizeWith(CompilationUnit astRoot) {
		super.synchronizeWith(astRoot);
		ITypeBinding binding = this.annotatedElement.getBinding(astRoot);
		this.syncName(this.buildName(binding));
		this.syncQualifiedName(this.buildQualifiedName(binding));
		this.syncPackageName(this.buildPackageName(binding));
		this.syncSuperclassQualifiedName(this.buildSuperclassQualifiedName(binding));
		this.syncDeclaringTypeName(this.buildDeclaringTypeName(binding));
		this.syncAbstract(this.buildAbstract(binding));
		this.syncStatic(this.buildStatic(binding));
		this.syncMemberType(this.buildMemberType(binding));
		this.syncHasNoArgConstructor(this.buildHasNoArgConstructor(binding));
		this.syncHasPrivateNoArgConstructor(this.buildHasPrivateNoArgConstructor(binding));
		this.syncTypes(astRoot);
		this.syncFields(astRoot);
		this.syncMethods(astRoot);
		this.syncMetamodelAnnotations(astRoot);
	}

	/**
	 * Handle the <code>StaticMetamodel</code> and <code>Generated</code>
	 * annotations differently, since they are not really JPA "mapping"
	 * annotations. We aren't overriding {@link #addOrSyncAnnotation(String, CompilationUnit, java.util.Set)}
	 * because we also have to handle removing these annotations separately.
	 */
	private void syncMetamodelAnnotations(CompilationUnit astRoot) {
		ITypeBinding binding = this.annotatedElement.getBinding(astRoot);
		if (binding != null) {
			this.syncStaticMetamodelAnnotation(astRoot, binding);
			this.syncGeneratedAnnotation(astRoot, binding);
		}
	}


	// ********** SourcePersistentMember implementation **********

	@Override
	Iterator<String> validAnnotationNames() {
		return this.getAnnotationProvider().typeAnnotationNames();
	}

	@Override
	Annotation buildAnnotation(String annotationName) {
		return this.getAnnotationProvider().buildTypeAnnotation(this, this.annotatedElement, annotationName);
	}

	@Override
	Annotation buildNullAnnotation(String annotationName) {
		return this.getAnnotationProvider().buildNullTypeAnnotation(this, annotationName);
	}

	@Override
	public void resolveTypes(CompilationUnit astRoot) {
		super.resolveTypes(astRoot);

		this.syncSuperclassQualifiedName(this.buildSuperclassQualifiedName(this.annotatedElement.getBinding(astRoot)));

		for (JavaResourcePersistentAttribute field : this.getFields()) {
			field.resolveTypes(astRoot);
		}

		// a new type can trigger a method parameter type to be a resolved,
		// fully-qualified name, so we need to rebuild our list of methods:
		//     "setFoo(Foo)" is not the same as "setFoo(com.bar.Foo)"
		// and, vice-versa, a removed type can "unresolve" a parameter type
		this.syncMethods(astRoot);

		for (JavaResourcePersistentAttribute method : this.getMethods()) {
			method.resolveTypes(astRoot);
		}
		for (JavaResourcePersistentType type : this.getTypes()) {
			type.resolveTypes(astRoot);
		}
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append(this.name);
	}


	// ******** JavaResourcePersistentType implementation ********

	// ***** name
	public String getName() {
		return this.name;
	}

	private void syncName(String astName) {
		String old = this.name;
		this.name = astName;
		this.firePropertyChanged(NAME_PROPERTY, old, astName);
	}

	private String buildName(ITypeBinding binding) {
		return (binding == null) ? null : binding.getName();
	}

	// ***** qualified name
	public String getQualifiedName() {
		return this.qualifiedName;
	}

	private void syncQualifiedName(String astQualifiedName) {
		String old = this.qualifiedName;
		this.qualifiedName = astQualifiedName;
		this.firePropertyChanged(QUALIFIED_NAME_PROPERTY, old, astQualifiedName);
	}

	private String buildQualifiedName(ITypeBinding binding) {
		return (binding == null) ? null : binding.getQualifiedName();
	}

	// ***** package name
	public String getPackageName() {
		return this.packageName;
	}

	private void syncPackageName(String astPackageName) {
		String old = this.packageName;
		this.packageName = astPackageName;
		this.firePropertyChanged(PACKAGE_NAME_PROPERTY, old, astPackageName);
	}

	private String buildPackageName(ITypeBinding binding) {
		return (binding == null) ? null : binding.getPackage().getName();
	}

	// ***** superclass qualified name
	public String getSuperclassQualifiedName() {
		return this.superclassQualifiedName;
	}

	private void syncSuperclassQualifiedName(String astSuperclassQualifiedName) {
		String old = this.superclassQualifiedName;
		this.superclassQualifiedName = astSuperclassQualifiedName;
		this.firePropertyChanged(SUPERCLASS_QUALIFIED_NAME_PROPERTY, old, astSuperclassQualifiedName);
	}

	private String buildSuperclassQualifiedName(ITypeBinding binding) {
		if (binding == null) {
			return null;
		}
		ITypeBinding superclass = binding.getSuperclass();
		return (superclass == null) ? null : superclass.getTypeDeclaration().getQualifiedName();
	}

	// ***** package
	public boolean isIn(IPackageFragment packageFragment) {
		return StringTools.stringsAreEqual(packageFragment.getElementName(), this.packageName);
	}

	// ***** declaring type name
	public String getDeclaringTypeName() {
		return this.declaringTypeName;
	}

	private void syncDeclaringTypeName(String astDeclaringTypeName) {
		String old = this.declaringTypeName;
		this.declaringTypeName = astDeclaringTypeName;
		this.firePropertyChanged(DECLARING_TYPE_NAME_PROPERTY, old, astDeclaringTypeName);
	}

	private String buildDeclaringTypeName(ITypeBinding binding) {
		if (binding == null) {
			return null;
		}
		ITypeBinding declaringClass = binding.getDeclaringClass();
		return (declaringClass == null) ? null : declaringClass.getTypeDeclaration().getQualifiedName();
	}

	// ***** abstract
	public boolean isAbstract() {
		return this.abstract_;
	}

	private void syncAbstract(boolean astAbstract) {
		boolean old = this.abstract_;
		this.abstract_ = astAbstract;
		this.firePropertyChanged(ABSTRACT_PROPERTY, old, astAbstract);
	}

	private boolean buildAbstract(ITypeBinding binding) {
		return (binding == null) ? false : Modifier.isAbstract(binding.getModifiers());
	}

	// ***** static
	public boolean isStatic() {
		return this.static_;
	}

	private void syncStatic(boolean astStatic_) {
		boolean old = this.static_;
		this.static_ = astStatic_;
		this.firePropertyChanged(STATIC_PROPERTY, old, astStatic_);
	}

	private boolean buildStatic(ITypeBinding binding) {
		return (binding == null) ? false : Modifier.isStatic(binding.getModifiers());
	}

	// ***** member type
	public boolean isMemberType() {
		return this.memberType;
	}

	private void syncMemberType(boolean astMemberType) {
		boolean old = this.memberType;
		this.memberType = astMemberType;
		this.firePropertyChanged(MEMBER_TYPE_PROPERTY, old, astMemberType);
	}

	private boolean buildMemberType(ITypeBinding binding) {
		return (binding == null) ? false : binding.isMember();
	}

	// ***** no-arg constructor
	public boolean hasNoArgConstructor() {
		return this.hasNoArgConstructor;
	}

	private void syncHasNoArgConstructor(boolean astHasNoArgConstructor) {
		boolean old = this.hasNoArgConstructor;
		this.hasNoArgConstructor = astHasNoArgConstructor;
		this.firePropertyChanged(NO_ARG_CONSTRUCTOR_PROPERTY, old, astHasNoArgConstructor);
	}

	private boolean buildHasNoArgConstructor(ITypeBinding binding) {
		return (binding == null) ? false : typeHasNoArgConstructor(binding);
	}

	protected static boolean typeHasNoArgConstructor(ITypeBinding binding) {
		return findNoArgConstructor(binding) != null;
	}

	protected static IMethodBinding findNoArgConstructor(ITypeBinding binding) {
		for (IMethodBinding method : binding.getDeclaredMethods()) {
			if (method.isConstructor()) {
				if (method.getParameterTypes().length == 0) {
					return method;
				}
			}
		}
		return null;
	}

	// ***** private no-arg constructor
	public boolean hasPrivateNoArgConstructor() {
		return this.hasPrivateNoArgConstructor;
	}

	private void syncHasPrivateNoArgConstructor(boolean astHasPrivateNoArgConstructor) {
		boolean old = this.hasPrivateNoArgConstructor;
		this.hasPrivateNoArgConstructor = astHasPrivateNoArgConstructor;
		this.firePropertyChanged(PRIVATE_NO_ARG_CONSTRUCTOR_PROPERTY, old, astHasPrivateNoArgConstructor);
	}

	private boolean buildHasPrivateNoArgConstructor(ITypeBinding binding) {
		return (binding == null) ? false : typeHasPrivateNoArgConstructor(binding);
	}

	protected static boolean typeHasPrivateNoArgConstructor(ITypeBinding binding) {
		IMethodBinding method = findNoArgConstructor(binding);
		return (method != null) && Modifier.isPrivate(method.getModifiers());
	}


	// ********** misc **********

	public boolean isMapped() {
		for (Annotation each : this.getAnnotations()) {
			if (this.annotationIsMappingAnnotation(each)) {
				return true;
			}
		}
		return false;
	}

	private boolean annotationIsMappingAnnotation(Annotation annotation) {
		return CollectionTools.contains(this.mappingAnnotationNames(), annotation.getAnnotationName());
	}

	private Iterator<String> mappingAnnotationNames() {
		return this.getAnnotationProvider().typeMappingAnnotationNames();
	}

	/**
	 * check only persistable attributes
	 */
	public boolean hasAnyAnnotatedAttributes() {
		for (Iterator<JavaResourcePersistentAttribute> stream = this.persistableAttributes(); stream.hasNext(); ) {
			if (stream.next().isAnnotated()) {
				return true;
			}
		}
		return false;
	}


	// ********** types **********

	public Iterator<JavaResourcePersistentType> types() {
		return this.getTypes().iterator();
	}

	private Iterable<JavaResourcePersistentType> getTypes() {
		return new LiveCloneIterable<JavaResourcePersistentType>(this.types);  // read-only
	}

	public Iterator<JavaResourcePersistentType> allTypes() {
		return new TreeIterator<JavaResourcePersistentType>(this) {
			@Override
			protected Iterator<? extends JavaResourcePersistentType> children(JavaResourcePersistentType type) {
				return type.types();
			}
		};
	}

	public Iterator<JavaResourcePersistentType> persistableTypes() {
		return this.persistableMembers(this.types());
	}

	private JavaResourcePersistentType getType(String typeName, int occurrence) {
		for (JavaResourcePersistentType type : this.getTypes()) {
			if (type.isFor(typeName, occurrence)) {
				return type;
			}
		}
		return null;
	}

	private void addType(JavaResourcePersistentType type) {
		this.addItemToCollection(type, this.types, TYPES_COLLECTION);
	}

	private void removeTypes(Collection<JavaResourcePersistentType> remove) {
		this.removeItemsFromCollection(remove, this.types, TYPES_COLLECTION);
	}

	private void initializeTypes(CompilationUnit astRoot) {
		TypeDeclaration[] typeDeclarations = this.annotatedElement.getTypes(astRoot);
		CounterMap counters = new CounterMap(typeDeclarations.length);
		for (TypeDeclaration td : typeDeclarations) {
			String tdName = td.getName().getFullyQualifiedName();
			int occurrence = counters.increment(tdName);
			this.types.add(this.buildType(td, occurrence, astRoot));
		}
	}

	private void syncTypes(CompilationUnit astRoot) {
		TypeDeclaration[] typeDeclarations = this.annotatedElement.getTypes(astRoot);
		CounterMap counters = new CounterMap(typeDeclarations.length);
		HashSet<JavaResourcePersistentType> typesToRemove = new HashSet<JavaResourcePersistentType>(this.types);
		for (TypeDeclaration typeDeclaration : typeDeclarations) {
			String tdName = typeDeclaration.getName().getFullyQualifiedName();
			int occurrence = counters.increment(tdName);

			JavaResourcePersistentType type = this.getType(tdName, occurrence);
			if (type == null) {
				this.addType(this.buildType(typeDeclaration, occurrence, astRoot));
			} else {
				typesToRemove.remove(type);
				type.synchronizeWith(astRoot);
			}
		}
		this.removeTypes(typesToRemove);
	}

	private JavaResourcePersistentType buildType(TypeDeclaration nestedTypeDeclaration, int occurrence, CompilationUnit astRoot) {
		return newInstance(this.getJavaResourceCompilationUnit(), this.annotatedElement, nestedTypeDeclaration, occurrence, astRoot);
	}


	// ********** fields **********

	public Iterator<JavaResourcePersistentAttribute> fields() {
		return this.getFields().iterator();
	}

	private Iterable<JavaResourcePersistentAttribute> getFields() {
		return new LiveCloneIterable<JavaResourcePersistentAttribute>(this.fields);
	}

	public Iterator<JavaResourcePersistentAttribute> persistableFields() {
		return this.persistableMembers(this.fields());
	}

	public Iterator<JavaResourcePersistentAttribute> persistableFieldsWithSpecifiedFieldAccess() {
		return new FilteringIterator<JavaResourcePersistentAttribute>(
				this.persistableFields(),
				FIELD_ACCESS_TYPE_FILTER
			);
	}

	private void addField(JavaResourcePersistentAttribute field) {
		this.addItemToCollection(field, this.fields, FIELDS_COLLECTION);
	}

	private JavaResourcePersistentAttribute getField(String fieldName, int occurrence) {
		for (JavaResourcePersistentAttribute field : this.getFields()) {
			if (field.isFor(fieldName, occurrence)) {
				return field;
			}
		}
		return null;
	}

	private void removeFields(Collection<JavaResourcePersistentAttribute> remove) {
		this.removeItemsFromCollection(remove, this.fields, FIELDS_COLLECTION);
	}

	private void initializeFields(CompilationUnit astRoot) {
		FieldDeclaration[] fieldDeclarations = this.annotatedElement.getFields(astRoot);
		CounterMap counters = new CounterMap(fieldDeclarations.length);
		for (FieldDeclaration fieldDeclaration : fieldDeclarations) {
			for (VariableDeclarationFragment fragment : fragments(fieldDeclaration)) {
				String fieldName = fragment.getName().getFullyQualifiedName();
				int occurrence = counters.increment(fieldName);
				this.fields.add(this.buildField(fieldName, occurrence, astRoot));
			}
		}
	}

	private void syncFields(CompilationUnit astRoot) {
		FieldDeclaration[] fieldDeclarations = this.annotatedElement.getFields(astRoot);
		CounterMap counters = new CounterMap(fieldDeclarations.length);
		HashSet<JavaResourcePersistentAttribute> fieldsToRemove = new HashSet<JavaResourcePersistentAttribute>(this.fields);
		for (FieldDeclaration fieldDeclaration : fieldDeclarations) {
			for (VariableDeclarationFragment fragment : fragments(fieldDeclaration)) {
				String fieldName = fragment.getName().getFullyQualifiedName();
				int occurrence = counters.increment(fieldName);

				JavaResourcePersistentAttribute field = this.getField(fieldName, occurrence);
				if (field == null) {
					this.addField(this.buildField(fieldName, occurrence, astRoot));
				} else {
					fieldsToRemove.remove(field);
					field.synchronizeWith(astRoot);
				}
			}
		}
		this.removeFields(fieldsToRemove);
	}

	private JavaResourcePersistentAttribute buildField(String fieldName, int occurrence, CompilationUnit astRoot) {
		return SourcePersistentAttribute.newInstance(this, this.annotatedElement, fieldName, occurrence, this.getJavaResourceCompilationUnit(), astRoot);
	}

	// minimize scope of suppressed warnings
	@SuppressWarnings("unchecked")
	private static List<VariableDeclarationFragment> fragments(FieldDeclaration fd) {
		return fd.fragments();
	}


	// ********** methods **********

	public Iterator<JavaResourcePersistentAttribute> methods() {
		return this.getMethods().iterator();
	}

	private Iterable<JavaResourcePersistentAttribute> getMethods() {
		return new LiveCloneIterable<JavaResourcePersistentAttribute>(this.methods);
	}

	public Iterator<JavaResourcePersistentAttribute> persistableProperties() {
		return this.persistableMembers(this.methods());
	}

	public Iterator<JavaResourcePersistentAttribute> persistablePropertiesWithSpecifiedPropertyAccess() {
		return new FilteringIterator<JavaResourcePersistentAttribute>(
				this.persistableProperties(),
				PROPERTY_ACCESS_TYPE_FILTER
			);
	}

	private JavaResourcePersistentAttribute getMethod(MethodSignature signature, int occurrence) {
		for (JavaResourcePersistentAttribute method : this.getMethods()) {
			if (method.isFor(signature, occurrence)) {
				return method;
			}
		}
		return null;
	}

	private void addMethod(JavaResourcePersistentAttribute method) {
		this.addItemToCollection(method, this.methods, METHODS_COLLECTION);
	}

	private void removeMethods(Collection<JavaResourcePersistentAttribute> remove) {
		this.removeItemsFromCollection(remove, this.methods, METHODS_COLLECTION);
	}

	private void initializeMethods(CompilationUnit astRoot) {
		MethodDeclaration[] methodDeclarations = this.annotatedElement.getMethods(astRoot);
		CounterMap counters = new CounterMap(methodDeclarations.length);
		for (MethodDeclaration methodDeclaration : methodDeclarations) {
			MethodSignature signature = ASTTools.buildMethodSignature(methodDeclaration);
			int occurrence = counters.increment(signature);
			this.methods.add(this.buildMethod(signature, occurrence, astRoot));
		}
	}

	private void syncMethods(CompilationUnit astRoot) {
		MethodDeclaration[] methodDeclarations = this.annotatedElement.getMethods(astRoot);
		CounterMap counters = new CounterMap(methodDeclarations.length);
		HashSet<JavaResourcePersistentAttribute> methodsToRemove = new HashSet<JavaResourcePersistentAttribute>(this.methods);
		for (MethodDeclaration methodDeclaration : methodDeclarations) {
			MethodSignature signature = ASTTools.buildMethodSignature(methodDeclaration);
			int occurrence = counters.increment(signature);

			JavaResourcePersistentAttribute method = this.getMethod(signature, occurrence);
			if (method == null) {
				this.addMethod(this.buildMethod(signature, occurrence, astRoot));
			} else {
				methodsToRemove.remove(method);
				method.synchronizeWith(astRoot);
			}
		}
		this.removeMethods(methodsToRemove);
	}

	private JavaResourcePersistentAttribute buildMethod(MethodSignature signature, int occurrence, CompilationUnit astRoot) {
		return SourcePersistentAttribute.newInstance(this, this.annotatedElement, signature, occurrence, this.getJavaResourceCompilationUnit(), astRoot);
	}


	// ********** attributes **********

	@SuppressWarnings("unchecked")
	public Iterator<JavaResourcePersistentAttribute> persistableAttributes() {
		return new CompositeIterator<JavaResourcePersistentAttribute>(
				this.persistableFields(),
				this.persistableProperties()
			);
	}

	public Iterator<JavaResourcePersistentAttribute> persistableAttributes(AccessType specifiedAccess) {
		switch (specifiedAccess) {
			case FIELD :
				return this.persistableAttributesForFieldAccessType();
			case PROPERTY :
				return this.persistableAttributesForPropertyAccessType();
			default :
				throw new IllegalArgumentException("unknown access: " + specifiedAccess); //$NON-NLS-1$
		}
	}

	@SuppressWarnings("unchecked")
	private Iterator<JavaResourcePersistentAttribute> persistableAttributesForFieldAccessType() {
		return new CompositeIterator<JavaResourcePersistentAttribute>(
				this.persistableFields(),
				this.persistablePropertiesWithSpecifiedPropertyAccess()
			);
	}

	@SuppressWarnings("unchecked")
	private Iterator<JavaResourcePersistentAttribute> persistableAttributesForPropertyAccessType() {
		return new CompositeIterator<JavaResourcePersistentAttribute>(
				this.persistableProperties(),
				this.persistableFieldsWithSpecifiedFieldAccess()
			);
	}


	// ********** metamodel **********

	// ***** StaticMetamodel
	private void setStaticMetamodelAnnotation(StaticMetamodelAnnotation staticMetamodelAnnotation) {
		StaticMetamodelAnnotation old = this.staticMetamodelAnnotation;
		this.staticMetamodelAnnotation = staticMetamodelAnnotation;
		this.firePropertyChanged(STATIC_METAMODEL_ANNOTATION_PROPERTY, old, this.staticMetamodelAnnotation);
	}

	private void addInitialStaticMetamodelAnnotation(CompilationUnit astRoot) {
		if (this.staticMetamodelAnnotation == null) { // ignore duplicates
			this.staticMetamodelAnnotation = this.buildStaticMetamodelAnnotation(astRoot);
		}
	}

	private StaticMetamodelAnnotation buildStaticMetamodelAnnotation(CompilationUnit astRoot) {
		StaticMetamodelAnnotation annotation = STATIC_METAMODEL_ANNOTATION_DEFINITION.buildAnnotation(this, this.annotatedElement);
		annotation.initialize(astRoot);
		return annotation;
	}

	private void syncStaticMetamodelAnnotation(CompilationUnit astRoot, ITypeBinding binding) {
		if (this.bindingContainsStaticMetamodelAnnotation(binding)) {
			if (this.staticMetamodelAnnotation != null) {
				this.staticMetamodelAnnotation.synchronizeWith(astRoot);
			} else {
				this.setStaticMetamodelAnnotation(this.buildStaticMetamodelAnnotation(astRoot));
			}
		} else {
			this.setStaticMetamodelAnnotation(null);
		}
	}

	private boolean bindingContainsStaticMetamodelAnnotation(ITypeBinding binding) {
		return this.bindingContainsAnnotation(binding, STATIC_METAMODEL_ANNOTATION_DEFINITION.getAnnotationName());
	}

	// ***** Generated
	public GeneratedAnnotation getGeneratedAnnotation() {
		return this.generatedAnnotation;
	}

	private void setGeneratedAnnotation(GeneratedAnnotation generatedAnnotation) {
		GeneratedAnnotation old = this.generatedAnnotation;
		this.generatedAnnotation = generatedAnnotation;
		this.firePropertyChanged(GENERATED_ANNOTATION_PROPERTY, old, this.generatedAnnotation);
	}

	private void addInitialGeneratedAnnotation(CompilationUnit astRoot) {
		if (this.generatedAnnotation == null) { // ignore duplicates
			this.generatedAnnotation = this.buildGeneratedAnnotation(astRoot);
		}
	}

	private GeneratedAnnotation buildGeneratedAnnotation(CompilationUnit astRoot) {
		GeneratedAnnotation annotation = GENERATED_ANNOTATION_DEFINITION.buildAnnotation(this, this.annotatedElement);
		annotation.initialize(astRoot);
		return annotation;
	}

	private void syncGeneratedAnnotation(CompilationUnit astRoot, ITypeBinding binding) {
		if (this.bindingContainsGeneratedAnnotation(binding)) {
			if (this.generatedAnnotation != null) {
				this.generatedAnnotation.synchronizeWith(astRoot);
			} else {
				this.setGeneratedAnnotation(this.buildGeneratedAnnotation(astRoot));
			}
		} else {
			this.setGeneratedAnnotation(null);
		}
	}

	private boolean bindingContainsGeneratedAnnotation(ITypeBinding binding) {
		return this.bindingContainsAnnotation(binding, GENERATED_ANNOTATION_DEFINITION.getAnnotationName());
	}

	private boolean bindingContainsAnnotation(ITypeBinding binding, String annotationName) {
		for (IAnnotationBinding annotationBinding : binding.getAnnotations()) {
			ITypeBinding annotationTypeBinding = annotationBinding.getAnnotationType();
			if ((annotationTypeBinding != null) && annotationTypeBinding.getQualifiedName().equals(annotationName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * The type must be:<ul>
	 * <li>in the specified source folder
	 * <li>a top-level type
	 * <li>annotated with <code>&#64;javax.annotation.Generated</code> with
	 *     the appropriate <code>value</code> and <code>date</code>
	 * <li>either itself or one of its nested types annotated with
	 *     <code>&#64;javax.persistence.metamodel.StaticMetamodel</code>
	 * </ul>
	 */
	public boolean isGeneratedMetamodelTopLevelType(IPackageFragmentRoot sourceFolder) {
		if ( ! this.getSourceFolder().equals(sourceFolder)) {
			return false;
		}
		return this.isGeneratedMetamodelTopLevelType();
	}

	/**
	 * The type must be:<ul>
	 * <li>a top-level type
	 * <li>annotated with <code>&#64;javax.annotation.Generated</code> with
	 *     the appropriate <code>value</code> and <code>date</code>
	 * <li>either itself or one of its nested types annotated with
	 *     <code>&#64;javax.persistence.metamodel.StaticMetamodel</code>
	 * </ul>
	 */
	public boolean isGeneratedMetamodelTopLevelType() {
		if ( ! this.isGenerated()) {
			return false;
		}
		// if we get here we know we have a top-level type, since only top-level
		// types are annotated @Generated; now see if anything is a metamodel
		for (Iterator<JavaResourcePersistentType> stream = this.allTypes(); stream.hasNext(); ) {
			JavaResourcePersistentType2_0 type = (JavaResourcePersistentType2_0) stream.next();
			if (type.isMetamodel()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * The type must be annotated with
	 * <code>&#64;javax.annotation.Generated</code> with the appropriate
	 * <code>value</code> and <code>date</code>.
	 */
	private boolean isGenerated() {
		if (this.generatedAnnotation == null) {
			return false;
		}
		if (this.generatedAnnotation.valuesSize() != 1) {
			return false;
		}
		if ( ! this.generatedAnnotation.getValue(0).equals(METAMODEL_GENERATED_ANNOTATION_VALUE)) {
			return false;
		}
		if (StringTools.stringIsEmpty(this.generatedAnnotation.getDate())) {
			return false;
		}
		return true;
	}

	/**
	 * The type must be annotated with
	 * <code>&#64;javax.persistence.metamodel.StaticMetamodel</code>.
	 */
	public boolean isMetamodel() {
		return this.staticMetamodelAnnotation != null;
	}

	private IPackageFragmentRoot getSourceFolder() {
		return (IPackageFragmentRoot) this.getJavaResourceCompilationUnit().getCompilationUnit().getAncestor(IJavaElement.PACKAGE_FRAGMENT_ROOT);
	}


	// ********** CounterMap **********

	private static class CounterMap {
		private final HashMap<Object, SimpleIntReference> counters;

		protected CounterMap(int initialCapacity) {
			super();
			this.counters = new HashMap<Object, SimpleIntReference>(initialCapacity);
		}

		/**
		 * Return the incremented count for the specified object.
		 */
		int increment(Object o) {
			SimpleIntReference counter = this.counters.get(o);
			if (counter == null) {
				counter = new SimpleIntReference();
				this.counters.put(o, counter);
			}
			counter.increment();
			return counter.getValue();
		}
	}
}
