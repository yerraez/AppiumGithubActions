package runner;

import PageObjects.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/CreateTaskExample.feature"
,glue = {"steps"}
,plugin = {"pretty", "html:target/cucumber-html-report-html"})

public class TestRunner extends TestBase {
}
