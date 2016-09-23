/**
 * 
 */
package com.abhi.robot.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.abhi.robot.testscenario.RobotTestScenario1;
import com.abhi.robot.testscenario.RobotTestScenario2;
import com.abhi.robot.testscenario.RobotTestScenario3;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   RobotTestScenario1.class ,RobotTestScenario2.class, RobotTestScenario3.class
})
/**
 * @author Abhinav
 *
 */
public class RobotTestSuites {

}
