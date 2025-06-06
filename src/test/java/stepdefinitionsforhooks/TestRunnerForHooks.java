package stepdefinitionsforhooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/hooksdemo/HooksDemo.feature",
        glue={"stepdefinitionsforhooks"},
        plugin =  {"pretty","html:targetHtmlReports/reportforHooks.html"}
)
public class TestRunnerForHooks {
}
