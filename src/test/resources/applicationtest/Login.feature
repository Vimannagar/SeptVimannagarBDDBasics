Feature: Login functionality
Scenario: Login to application with valid credentials
Given User is at the login screen
When User enters the username
And User enters the password
And User clicks on login button
Then User should get redirect to the home page