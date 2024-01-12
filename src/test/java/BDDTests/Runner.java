package BDDTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features/AddNewAdmin.feature"},
        glue = {"BDDTests"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class Runner extends AbstractTestNGCucumberTests{
}
