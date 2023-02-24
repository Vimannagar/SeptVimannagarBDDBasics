Feature: Orders information functionality

Background:

Given user should be at login page
When user enters the credentials
Then user should get logged in

Scenario: verify current placed order
When user clicks on placed order link
Then user should see the status of current order


Scenario: verify previous order
When user clicks on order history
Then user should be able to see the order history




