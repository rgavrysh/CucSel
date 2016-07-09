package annotation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\outline.feature",
        tags = {"@LoginForm", "~@SmokeTest"},
//        format = {"pretty", "html:target/cucumber"},
        format = {"json:target/Destination/cucumber.json"})
public class CucumberTest {}
