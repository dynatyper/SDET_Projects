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
@tag
Feature: Login Validation
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Check if user has valid credentials
    #Given the users web application is up and running
    #When the user gives valid user name
    #And valid password
    #Then take user to home page

  Scenario: Check if user has valid credentials
    Given the users web application is up and running
    When the user gives valid user name
    # datatable
    |username|password 	 |
    |tom		 |Jerry@123	 |
    |carrie  |ILoveProm2!|
    |harry   |P0tsAreduM |
    
    And valid password
    Then take user to home page
    
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
