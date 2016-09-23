/**
 * 
 */
package com.abhi.robot.model;

import static com.abhi.robot.constant.RobotConstant.*;

import com.abhi.robot.service.impl.RobotScanner;

/**
 * @author Abhinav
 *
 */
public class RobotPrototype {

	/**
	 * @param battery
	 * @param distance
	 * @param weight
	 * @return
	 */
	private RobotBattery powerOperated(RobotBattery battery, float distance,
			float weight) {

		if (weight < 0) {
			weight = 0;
		}

		if(distance < 0){
			distance = 0;
		}
		
		float chargeConsumed = (distance * MAX_CHARGE/WALK_PER_CHARGE) + (CHARGE_PER_KG * weight);
		float chargeRemains = battery.getCharge() - chargeConsumed;

		if (chargeRemains < 0) {
			chargeRemains = 0;
		}
		battery.setCharge(chargeRemains);

		return battery;
	}

	/**
	 * @param battery
	 * @param distance
	 * @param weight
	 * @return
	 */
	public String handlePhysicalCharge(RobotBattery battery, float distance,
			float weight) {

		String result = BLANK;

		if (weight > MAX_WEIGHT) {
			result = OVERWEIGHT;
		} else {
			if (battery != null && battery.getCharge() >= MIN_CHARGE) {
				battery = powerOperated(battery, distance, weight);
				if (battery.getCharge() >= MIN_CHARGE) {
					result = Float.toString(battery.getCharge()) + PERCENTAGE;
				} else {
					result = LOW_BATTERY;
				}
			} else {
				result = LOW_BATTERY;
			}
		}

		return result;
	}

	/**
	 * @param scanner
	 * @return
	 */
	public String scanner(RobotScanner scanner){
		
		return scanner.getRawdata();
	}
}
