package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		tags="@smoketest",
		glue = "stepDefinitions",
		stepNotifications=true,
		dryRun = false,
		plugin= {"html:target/cucumber-html-report",
				"json:target/json/cucumber.json",
				  "junit:target/cucumberxml.xml"
				}
		)
public class TestRunner {

}
