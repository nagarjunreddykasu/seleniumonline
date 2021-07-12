package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},plugin = {"pretty", "html:target/cucumber.html"},monochrome=true,tags="@regression")
public class JUnitRunner {

}