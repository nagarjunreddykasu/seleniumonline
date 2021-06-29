package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},plugin={"pretty","html:target/cucumber-report.html"},monochrome=true,tags="@sanity or @signup1") 
public class JunitRunner {

}
