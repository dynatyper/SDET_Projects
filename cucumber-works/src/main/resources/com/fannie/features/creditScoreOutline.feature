#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
  Feature: To sanction loans for the customer.
  
  Background:
  Given hey before all the statements


# This is my comment

Scenario Outline: To issue loan for customer who is full-time employee in govt sector.

# one after another

Given Employee has a credit score
And the score is more than "<creditScore>"
When the employee is "<workTime>" time working
And in "<officeType>" office
Then sanction loan
But should repay within "<noOfYears>" years

Examples:
|creditScore		|workTime		|officeType		|noOfYears		|
|666						|full				|govt					|6						|
|765						|parttime		|private			|12						|
|500						|full				|govt					|11						|