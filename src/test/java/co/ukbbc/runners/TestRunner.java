package co.ukbbc.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/ukbbc/features"},
        glue = {"co/ukbbc/hooks","co/ukbbc/stepDefinitions"},
        plugin = {"pretty","json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}

)
public class TestRunner {
}
