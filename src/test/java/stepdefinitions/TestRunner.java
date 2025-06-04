package stepdefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"stepdefinitions"},
monochrome = true,
        tags = "@smoke and @regression",
      plugin =  {"pretty","html:targetHtmlReports/report.html"}
)
public class TestRunner {
}
