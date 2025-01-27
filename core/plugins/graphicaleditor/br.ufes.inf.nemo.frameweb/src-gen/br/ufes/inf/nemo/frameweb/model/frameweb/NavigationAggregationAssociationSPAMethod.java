/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Aggregation Association SPA Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod#getMethod <em>Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociationSPAMethod()
 * @model
 * @generated
 */
public interface NavigationAggregationAssociationSPAMethod extends EObject
{
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(FrontControllerMethod)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociationSPAMethod_Method()
	 * @model
	 * @generated
	 */
	FrontControllerMethod getMethod();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage#getNavigationAggregationAssociationSPAMethod_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAggregationAssociationSPAMethod#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // NavigationAggregationAssociationSPAMethod
