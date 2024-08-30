package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "StepDefinitonFile",
monochrome = true,  plugin = {"pretty", "html:target/cucumber.html"})
public class TestRunnerFile extends AbstractTestNGCucumberTests {

	
}
