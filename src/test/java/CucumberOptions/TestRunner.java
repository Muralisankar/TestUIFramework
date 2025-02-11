package CucumberOptions;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinitions",
		tags = {"@TC0001"},
		plugin = {"pretty", "html:target/cucumber"},
		monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
