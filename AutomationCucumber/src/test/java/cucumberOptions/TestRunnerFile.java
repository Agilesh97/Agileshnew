package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue ="stepDefinitionFile",
                 monochrome = true)
public class TestRunnerFile extends AbstractTestNGCucumberTests {
  
}
