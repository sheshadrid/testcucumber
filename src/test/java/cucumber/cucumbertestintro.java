package cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbertestintro {
	@Given("I enter 50 in the calculator")
	public void cal() {
		System.out.println("I have entered 50 in the calculator");
	}
	@And("I enter add")
	public void calc1() {
		System.out.println("I entered add");
	}
	@And("I enter 30 in the calculator")
	public void calc2() {
		System.out.println("I entered 30 in the calculator");	
	}
	@When("I press equal symbol")
	public void calc3() {
		System.out.println("I have pressed equal");
	}
	@Then("The 80 should be as the result on the screen")
	public void calc4() {
		System.out.println("I have received 80 as result in thr calculator");
	}
}

