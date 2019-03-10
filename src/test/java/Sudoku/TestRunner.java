package Sudoku;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue={"stepDefinition"},
        plugin = { "pretty", "json:Reports/Cucumber.json",
        "junit:Reports/Cucumber.xml",
        "html:Reports"},
        monochrome = true
)

public class TestRunner {


}
