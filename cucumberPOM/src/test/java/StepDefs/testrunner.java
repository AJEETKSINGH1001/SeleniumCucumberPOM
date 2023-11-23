package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefs"},
monochrome=true,
//plugin = {"pretty","html:target/HtmlReports.html"}
//plugin = {"pretty","json:target/JSONReports/Report.json"}
//plugin = {"pretty","junit:target/JunitReports/Report.xml"},

  plugin = {"pretty","html:target/HTMLReports/HtmlReports.html","json:target/JSONReports/Report.json","junit:target/JunitReports/Report.xml" }
 //tags="@Smoketest"
)
public class testrunner {

}
