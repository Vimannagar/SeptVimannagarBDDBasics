Feature: Profile functionality
Scenario: Add profile for user
Given User is at add profile page
When user enters the information
Then Profile should get added

Scenario: Edit profile for user
Given User is at profile page
When user click on edit
Then profile should get edit

Scenario: delete profile of user
Given User is at profile details page
When user click on delete
Then profile should get deleted
