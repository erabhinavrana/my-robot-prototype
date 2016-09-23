/**
 * 
 */
package com.abhi.robot.main;

import com.abhi.robot.model.RobotBattery;
import com.abhi.robot.model.RobotPrototype;
import com.abhi.robot.service.impl.RobotScanner;

import static com.abhi.robot.constant.RobotConstant.*;
/**
 * @author Abhinav
 *
 */
public class RobotMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RobotBattery battery = new RobotBattery(MAX_CHARGE);
		RobotScanner scanner = new RobotScanner(RAW_DATA);
		
		float distance = 3.5f;
		float weight = 12f;
		
		RobotPrototype robot = new RobotPrototype();
		
		System.out.println(robot.handlePhysicalCharge(battery, distance, weight));
		System.out.println(robot.scanner(scanner));
	}

}
