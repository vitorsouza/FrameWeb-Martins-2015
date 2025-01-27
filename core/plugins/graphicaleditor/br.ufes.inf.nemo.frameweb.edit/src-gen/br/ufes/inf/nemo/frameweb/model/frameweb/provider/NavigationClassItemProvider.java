/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationClassItemProvider extends ClassItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationClassItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage()
	{
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((NavigationClass) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NavigationClass_type")
				: getString("_UI_NavigationClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createPageConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createResultConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createMethodConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createChainingConstraint()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createDomainConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.NAMESPACE__OWNED_RULE,
				FramewebFactory.eINSTANCE.createVocabularyConstraints()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createNavigationGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				FramewebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainAuthAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAuthUserName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAuthPassword()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAuthRoleName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createAuthPermName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationAggregationTarget()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE,
				FramewebFactory.eINSTANCE.createNavigationAggregationSource()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				FramewebFactory.eINSTANCE.createDAORealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				FramewebFactory.eINSTANCE.createServiceRealization()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createAuthProcessingMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createDomainMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createServiceMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createAuthServiceMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createDAOMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				FramewebFactory.eINSTANCE.createRestControllerMethod()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDomainAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createPage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthPage()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDAOInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDAOClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createFrontControllerClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createNavigationAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createServiceClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthServiceClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthServiceInterface()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createServiceControllerAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDomainClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthUser()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthRole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthPermission()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDAOServiceAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createUIComponent()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAuthForm()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createResultType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createTag()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createClassMapping()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAttributeMapping()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createController()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAxiom()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createVocabularyAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createVocabularyDataType()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createVocabularyClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createDomainVocabularyAssociation()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createRestControllerClass()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createPartial()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				FramewebFactory.eINSTANCE.createNavigationAggregationAssociation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
				|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION
				|| childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE
				|| childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER
				|| childFeature == UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE
				|| childFeature == UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT
				|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR
				|| childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify)
		{
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return FramewebEditPlugin.INSTANCE;
	}

}
