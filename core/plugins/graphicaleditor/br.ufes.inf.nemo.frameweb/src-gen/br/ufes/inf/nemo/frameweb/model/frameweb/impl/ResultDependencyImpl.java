/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultConstraint;
import br.ufes.inf.nemo.frameweb.model.frameweb.ResultDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultDependencyImpl#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultDependencyImpl#getResultDependencyConstraint <em>Result Dependency Constraint</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.ResultDependencyImpl#getHttpStatus <em>Http Status</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ResultDependencyImpl extends NavigationDependencyImpl implements ResultDependency
{
	/**
	 * The cached value of the '{@link #getResultMethod() <em>Result Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod resultMethod;

	/**
	 * The cached value of the '{@link #getResultDependencyConstraint() <em>Result Dependency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDependencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected ResultConstraint resultDependencyConstraint;

	/**
	 * The default value of the '{@link #getHttpStatus() <em>Http Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpStatus() <em>Http Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpStatus()
	 * @generated
	 * @ordered
	 */
	protected String httpStatus = HTTP_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultDependencyImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FramewebPackage.Literals.RESULT_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrontControllerMethod getResultMethod()
	{
		if (resultMethod != null && resultMethod.eIsProxy())
		{
			InternalEObject oldResultMethod = (InternalEObject) resultMethod;
			resultMethod = (FrontControllerMethod) eResolveProxy(oldResultMethod);
			if (resultMethod != oldResultMethod)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD, oldResultMethod, resultMethod));
			}
		}
		return resultMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetResultMethod()
	{
		return resultMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultMethod(FrontControllerMethod newResultMethod)
	{
		FrontControllerMethod oldResultMethod = resultMethod;
		resultMethod = newResultMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD,
					oldResultMethod, resultMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultConstraint getResultDependencyConstraint()
	{
		return resultDependencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultDependencyConstraint(ResultConstraint newResultDependencyConstraint,
			NotificationChain msgs)
	{
		ResultConstraint oldResultDependencyConstraint = resultDependencyConstraint;
		resultDependencyConstraint = newResultDependencyConstraint;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT, oldResultDependencyConstraint,
					newResultDependencyConstraint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDependencyConstraint(ResultConstraint newResultDependencyConstraint)
	{
		if (newResultDependencyConstraint != resultDependencyConstraint)
		{
			NotificationChain msgs = null;
			if (resultDependencyConstraint != null)
				msgs = ((InternalEObject) resultDependencyConstraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT, null,
						msgs);
			if (newResultDependencyConstraint != null)
				msgs = ((InternalEObject) newResultDependencyConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT, null,
						msgs);
			msgs = basicSetResultDependencyConstraint(newResultDependencyConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT, newResultDependencyConstraint,
					newResultDependencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpStatus()
	{
		return httpStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpStatus(String newHttpStatus)
	{
		String oldHttpStatus = httpStatus;
		httpStatus = newHttpStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__HTTP_STATUS,
					oldHttpStatus, httpStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT:
			return basicSetResultDependencyConstraint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
			if (resolve)
				return getResultMethod();
			return basicGetResultMethod();
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT:
			return getResultDependencyConstraint();
		case FramewebPackage.RESULT_DEPENDENCY__HTTP_STATUS:
			return getHttpStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
			setResultMethod((FrontControllerMethod) newValue);
			return;
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT:
			setResultDependencyConstraint((ResultConstraint) newValue);
			return;
		case FramewebPackage.RESULT_DEPENDENCY__HTTP_STATUS:
			setHttpStatus((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
			setResultMethod((FrontControllerMethod) null);
			return;
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT:
			setResultDependencyConstraint((ResultConstraint) null);
			return;
		case FramewebPackage.RESULT_DEPENDENCY__HTTP_STATUS:
			setHttpStatus(HTTP_STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_METHOD:
			return resultMethod != null;
		case FramewebPackage.RESULT_DEPENDENCY__RESULT_DEPENDENCY_CONSTRAINT:
			return resultDependencyConstraint != null;
		case FramewebPackage.RESULT_DEPENDENCY__HTTP_STATUS:
			return HTTP_STATUS_EDEFAULT == null ? httpStatus != null : !HTTP_STATUS_EDEFAULT.equals(httpStatus);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (httpStatus: ");
		result.append(httpStatus);
		result.append(')');
		return result.toString();
	}

} //ResultDependencyImpl
