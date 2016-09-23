/**
 * 
 */
package com.abhi.robot.testscenario;

import static com.abhi.robot.constant.RobotConstant.MAX_CHARGE;

import org.junit.Test;

import com.abhi.robot.model.RobotBattery;
import com.abhi.robot.model.RobotPrototype;


/**
 * @author Abhinav
 *
 */
public class RobotTestScenario1{

	float distance = 3.5f;
	float weight = 0f;

	@Test
	public void testHandlePhysicalCharge(){
		RobotBattery battery = new RobotBattery(MAX_CHARGE);
		RobotPrototype robot = new RobotPrototype();

		System.out.println(robot.handlePhysicalCharge(battery, distance, weight));
	}
}
