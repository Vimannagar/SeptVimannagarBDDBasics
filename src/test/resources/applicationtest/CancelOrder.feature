Feature: Cancel order functionality

@recentlycancelled
Scenario: To cancel the recently ordered product
Given User is at orders page
When User click on cancel order
Then Order should get cancelled

@alreadydispatched
Scenario: To cancel the dispatched ordered product
Given User is at orders page
When User click cancel for dispatched order
Then Order should get cancelled for dispatched product

@history @alreadydispatched
Scenario: To check the cancelled history
Given User is at orders page
When User click on history button
Then user should see the ordered product history
 

