package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="src/test/resources/ui_features",
        glue={"StepDefinitions"},
        dryRun = false,
        tags="@run",
        plugin = {"pretty","html:target/cucumber",
                "json:target/cucumber.json"},
        monochrome = false
)
public class UITestRunner {
}
