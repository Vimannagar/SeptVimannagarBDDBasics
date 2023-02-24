Feature: Search functionality
Scenario: Validate search feature
Given User should be at the home
When user enters text in search field as "samsung mobile"
And user clicks on search button
Then user should see the list of mobile
