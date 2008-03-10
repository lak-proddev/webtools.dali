package org.eclipse.jpt.core.internal.resource.orm.translators;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.wst.common.internal.emf.resource.Translator;

public class EventMethodTranslator extends Translator 
	implements OrmXmlMapper
{
	private Translator[] children;	
	
	
	public EventMethodTranslator(String domNameAndPath, EStructuralFeature aFeature) {
		super(domNameAndPath, aFeature, END_TAG_NO_INDENT);
	}
	
	@Override
	public Translator[] getChildren(Object target, int versionID) {
		if (this.children == null) {
			this.children = createChildren();
		}
		return this.children;
	}
	
	private Translator[] createChildren() {
		return new Translator[] {
			createMethodNameTranslator()
		};
	}
	
	private Translator createMethodNameTranslator() {
		return new Translator(METHOD_NAME, ORM_PKG.getEventMethod_MethodName(), DOM_ATTRIBUTE);
	}
}
