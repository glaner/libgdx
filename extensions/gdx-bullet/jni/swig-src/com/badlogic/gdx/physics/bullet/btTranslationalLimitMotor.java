/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTranslationalLimitMotor extends BulletBase {
	private long swigCPtr;
	
	protected btTranslationalLimitMotor(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btTranslationalLimitMotor(long cPtr, boolean cMemoryOwn) {
		this("btTranslationalLimitMotor", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTranslationalLimitMotor obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTranslationalLimitMotor(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLowerLimit(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_lowerLimit_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLowerLimit() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_lowerLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setUpperLimit(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_upperLimit_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getUpperLimit() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_upperLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setAccumulatedImpulse(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_accumulatedImpulse_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getAccumulatedImpulse() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_accumulatedImpulse_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLimitSoftness(float value) {
    gdxBulletJNI.btTranslationalLimitMotor_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return gdxBulletJNI.btTranslationalLimitMotor_limitSoftness_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    gdxBulletJNI.btTranslationalLimitMotor_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return gdxBulletJNI.btTranslationalLimitMotor_damping_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    gdxBulletJNI.btTranslationalLimitMotor_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return gdxBulletJNI.btTranslationalLimitMotor_restitution_get(swigCPtr, this);
  }

  public void setNormalCFM(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_normalCFM_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getNormalCFM() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_normalCFM_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setStopERP(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_stopERP_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getStopERP() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_stopERP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setStopCFM(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_stopCFM_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getStopCFM() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_stopCFM_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setEnableMotor(boolean[] value) {
    gdxBulletJNI.btTranslationalLimitMotor_enableMotor_set(swigCPtr, this, value);
  }

  public boolean[] getEnableMotor() {
    return gdxBulletJNI.btTranslationalLimitMotor_enableMotor_get(swigCPtr, this);
}

  public void setTargetVelocity(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_targetVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getTargetVelocity() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_targetVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMaxMotorForce(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_maxMotorForce_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMaxMotorForce() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_maxMotorForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLimitError(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_currentLimitError_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCurrentLimitError() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_currentLimitError_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLinearDiff(btVector3 value) {
    gdxBulletJNI.btTranslationalLimitMotor_currentLinearDiff_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCurrentLinearDiff() {
    long cPtr = gdxBulletJNI.btTranslationalLimitMotor_currentLinearDiff_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLimit(int[] value) {
    gdxBulletJNI.btTranslationalLimitMotor_currentLimit_set(swigCPtr, this, value);
  }

  public int[] getCurrentLimit() {
    return gdxBulletJNI.btTranslationalLimitMotor_currentLimit_get(swigCPtr, this);
}

  public btTranslationalLimitMotor() {
    this(gdxBulletJNI.new_btTranslationalLimitMotor__SWIG_0(), true);
  }

  public btTranslationalLimitMotor(btTranslationalLimitMotor other) {
    this(gdxBulletJNI.new_btTranslationalLimitMotor__SWIG_1(btTranslationalLimitMotor.getCPtr(other), other), true);
  }

  public boolean isLimited(int limitIndex) {
    return gdxBulletJNI.btTranslationalLimitMotor_isLimited(swigCPtr, this, limitIndex);
  }

  public boolean needApplyForce(int limitIndex) {
    return gdxBulletJNI.btTranslationalLimitMotor_needApplyForce(swigCPtr, this, limitIndex);
  }

  public int testLimitValue(int limitIndex, float test_value) {
    return gdxBulletJNI.btTranslationalLimitMotor_testLimitValue(swigCPtr, this, limitIndex, test_value);
  }

  public float solveLinearAxis(float timeStep, float jacDiagABInv, btRigidBody body1, Vector3 pointInA, btRigidBody body2, Vector3 pointInB, int limit_index, Vector3 axis_normal_on_a, Vector3 anchorPos) {
    return gdxBulletJNI.btTranslationalLimitMotor_solveLinearAxis(swigCPtr, this, timeStep, jacDiagABInv, btRigidBody.getCPtr(body1), body1, pointInA, btRigidBody.getCPtr(body2), body2, pointInB, limit_index, axis_normal_on_a, anchorPos);
  }

}
