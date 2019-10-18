package com.fannie.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreSteps {
	
	
	@Given("^hey before all the statements$")
	public void hey_before_all_the_statements() throws Throwable {
		System.out.println("This comes before the statements");
	}
	
	
	@Given("^Employee has a credit score$")
	public void employee_has_a_credit_score() {
		System.out.println("Employee has a credit score");
	}

	@And("^the score is more than \"(\\d{1,})\"$")
	public void the_score_is_more_than(int creditScore) {
		System.out.println("the score is more than " + creditScore);
	}

	@When("^the employee is \"([a-zA-Z]{1,})\" time working$")
	public void the_employee_is_full_time_working(String workTime) {
		System.out.println("the employee is " + workTime + " time working");
	}

	@And("^in \"([a-zA-Z]{1,})\" office$")
	public void in_govt_office(String officeType) {
		System.out.println("in " + officeType + "office");
	}

	@Then("^sanction loan$")
	public void sanction_loan() {
		System.out.println("sanction loan>>>");
	}

	@But("^should repay within \"(\\d{1,})\" years$")
	public void should_repay_within_5_years(int noOfYears) {
		System.out.println("should repay within " + noOfYears + " years");
	}
}
