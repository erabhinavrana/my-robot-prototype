/**
 * 
 */
package com.abhi.robot.testrunner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.abhi.robot.testsuite.RobotTestSuites;
/**
 * @author Abhinav
 *
 */
public class RobotTestRunner {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(RobotTestSuites.class);
		
	      List<Failure> failureList = result.getFailures();
	      failureList.forEach(failure->System.out.println(failure.toString()));
			
	      System.out.println("Robot Test Suites success :: " + result.wasSuccessful());
	   }
}
