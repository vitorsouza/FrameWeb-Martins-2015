/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frameweb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Frameweb#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.Frameweb#getConfigures <em>Configures</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrameweb()
 * @model annotation="Ecore constraints='FramewebContent'"
 *        annotation="OCL FramewebContent='(self.Compose->size()>=1 and self.Configures->size()=0) or (self.Configures->size()>=1 and self.Compose->size()=0)'"
 *        annotation="Comments FramewebContent='The Frameweb need obligatorily have a FrameworkProfile or a FramewebModel and may not both simultaneously.'"
 * @generated
 */
public interface Frameweb extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameWebModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrameweb_Compose()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameWebModel> getCompose();

	/**
	 * Returns the value of the '<em><b>Configures</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameworkProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrameweb_Configures()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameworkProfile> getConfigures();

} // Frameweb