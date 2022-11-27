package utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false,
        publish = true,
        //tags = "@Test",
        features = "src/main/java/features",
        glue = "stepDefinitions"
)

public class Runner extends AbstractTestNGCucumberTests {
}