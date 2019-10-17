Feature: To sanction loans for the customer.


# This is my comment

Scenario: To issue loan for customer who is full-time employee in govt sector.

# one after another

Given Employee has a credit score
And the score is more than 567
When the employee is full time working
And in govt office
Then sanction loan
But should repay within 5 years

