package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:src\\test\\java\\cucumber\\testcucumber.json"})
public class runnerintro {
	

}
