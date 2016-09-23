/**
 * 
 */
package com.abhi.robot.model;

/**
 * @author Abhinav
 *
 */
public class RobotBattery{

	private float charge;

	/**
	 * 
	 */
	public RobotBattery(float charge) {
		this.charge = charge;
	}
	/**
	 * @return the charge
	 */
	public float getCharge() {
		return charge;
	}

	/**
	 * @param charge the charge to set
	 */
	public void setCharge(float charge) {
		this.charge = charge;
	}

}
