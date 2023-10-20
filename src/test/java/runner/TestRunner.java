package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue={"steps"},
plugin={"pretty","html:tsrget/cucumber-html-report"})
public class TestRunner extends TestBase {
    //  Now I am still working to complete the cucumber
}
