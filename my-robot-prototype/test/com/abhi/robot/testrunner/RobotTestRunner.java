/**
 * 
 */
package com.abhi.robot.testrunner;

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
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Robot Test Suites success :: " + result.wasSuccessful());
	   }
}
