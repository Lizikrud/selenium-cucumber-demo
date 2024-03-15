package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources/features",
        glue={"stepDefinitions"},
        dryRun = false,
        tags="@regression",
        plugin = {"pretty","html:target/cucumber","html:target/cucumber-html-report",
                "json:target/cucumber.json"},
        monochrome = false
)
public class UITestRunner {
}
