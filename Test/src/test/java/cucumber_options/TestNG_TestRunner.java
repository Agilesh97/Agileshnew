package cucumber_options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/featurefile", glue = "Stepdef",
                  monochrome = true, tags = "@SmokeTest and @RegressionTest",
                  plugin = {"pretty", "html:target/cucumber.html"})
public class TestNG_TestRunner extends AbstractTestNGCucumberTests{
	
	

}




