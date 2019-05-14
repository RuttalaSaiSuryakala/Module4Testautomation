Feature: Conference Registration
Scenario: Registration checking
Given user is registering
When title of page is conference registration
Then user enters first name
Then user enters last name
Then user enters email
Then user enters contact number
Then user selects no of people
Then user enters building name and room no
Then user enters area name
Then user selects city
Then user selects state
Then user selects conference access
Then click on next
Then title of page is payment details
Then user enters card holder name
Then user enters debit card number
Then user enters cvv number
Then user enters card expiration month
Then user enters card expiration year
Then click on make payment
Then close the terminal