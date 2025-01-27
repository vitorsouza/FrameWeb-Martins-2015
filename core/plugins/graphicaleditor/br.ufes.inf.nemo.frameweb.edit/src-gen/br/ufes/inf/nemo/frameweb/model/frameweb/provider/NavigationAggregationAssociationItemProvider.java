/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.provider;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebFactory;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;

/**
 * This is the item provider adapter for a {@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationAggregationAssociationItemProvider extends AssociationItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAggregationAssociationItemProvider(AdapterFactory adapterFactory)
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS);
			childrenFeatures.add(FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NavigationAggregationAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NavigationAggregationAssociation"));
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
		String label = ((NavigationAggregationAssociation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NavigationAggregationAssociation_type")
				: getString("_UI_NavigationAggregationAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(NavigationAggregationAssociation.class))
		{
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS:
		case FramewebPackage.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDomainVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDomainAuthAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAuthUserName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAuthPassword()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAuthRoleName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createAuthPermName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationAggregationTarget()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationAggregationSource()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createUIComponentField()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationCompositionPart()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationCompositionWhole()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createTagProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createResultProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createClassMappingPropery()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAttributeMappingProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createIRI()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAnonymousIndividual()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDomainVocabularyProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDomainAuthAttribute()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAuthUserName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAuthPassword()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAuthRoleName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createAuthPermName()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createDomainProperty()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationAggregationTarget()));

		newChildDescriptors.add(createChildParameter(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				FramewebFactory.eINSTANCE.createNavigationAggregationSource()));

		newChildDescriptors
				.add(createChildParameter(FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_METHODS,
						FramewebFactory.eINSTANCE.createNavigationAggregationAssociationSPAMethod()));

		newChildDescriptors
				.add(createChildParameter(FramewebPackage.Literals.NAVIGATION_AGGREGATION_ASSOCIATION__SPA_ATTRIBUTES,
						FramewebFactory.eINSTANCE.createNavigationAggregationAssociationSPAAttribute()));
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
				|| childFeature == UMLPackage.Literals.ASSOCIATION__OWNED_END
				|| childFeature == UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END;

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
