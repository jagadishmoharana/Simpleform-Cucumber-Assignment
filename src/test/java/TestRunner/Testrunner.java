package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepdefinitions",
        dryRun = false, 
        plugin = {
            "pretty",
            "html:target/cucumber-reports/cucumber.html", // path for HTML report
            "json:target/cucumber-reports/cucumber.json"  // path for JSON report
        },
        monochrome = true,
        publish = true
)
public class Testrunner extends AbstractTestNGCucumberTests{

}
