Feature: Login functionality
Scenario: Login page title
Given user is at the landing page
When user gets the title of page
Then page title should contains "Shopping"

Scenario: verify cart icon is displaying
Given user is at the landing page
Then cart icon should get display

Scenario: Login to application
Given user is at the landing page
When user enters the username as "8176867662"
And user enters the password as "123456"
And user confirm signin