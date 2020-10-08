package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		tags= {"@smoketest2 or @smoketest"},
		glue = "stepDefinitions",
		stepNotifications=true,
		dryRun = false,
		monochrome=true,
		plugin= {//"pretty",
				//	"html:target/cucumber-html-report",
					"json:target/cucumber.json"
				//	"junit:target/cucumberxml.xml"
						}
		)
public class TestRunner {

}
