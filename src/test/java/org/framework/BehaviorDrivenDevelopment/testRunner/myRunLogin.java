package org.framework.BehaviorDrivenDevelopment.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\demos\\test-engine\\org.framework.BehaviorDrivenDevelopment\\Features\\Login.feature",
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class myRunLogin {

}