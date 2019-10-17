package com.fannie.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreSteps {
	@Given("^Employee has a credit score$")
	public void employee_has_a_credit_score() {
		System.out.println("Employee has a credit score>>>");
	}
	
	@And("^the score is more than 567$")
	public void the_score_is_more_than_567() {
		System.out.println("the score is more than 567>>>");
	}
	
	@When("^the employee is full time working$")
	public void the_employee_is_full_time_working() {
		System.out.println("the employee is full time working>>>>");
	}
	
	@And("^in govt office$")
	public void in_govt_office(){
		System.out.println("in govt office>>>");
	}
	
	@Then("^sanction loan$")
	public void sanction_loan() {
		System.out.println("sanction loan>>>");
	}
	
	@But("^should repay within 5 years$")
	public void should_repay_within_5_years() {
		System.out.println("should repay within 5 years>>>");
	}
}
