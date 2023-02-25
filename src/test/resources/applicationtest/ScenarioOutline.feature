Feature: Login feature with different inputs
Scenario Outline: Login with different set of combinations
Given user is on the application login page
When user enters "<username>" in username
And user enters "<password>" in password
And user click on login button
Then user should see the error message for invalid credentials

Examples:
|username | password |
|incorrectusername |correctpassword|
|correctusername |incorrectpassword|
|incorrectusername| incorrectpassword|
|correctusername|abc123|
