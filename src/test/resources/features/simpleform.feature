Feature: simple form
Scenario: Validate form functionality
	Given User navigate to the page "https://v1.training-support.net/selenium/simple-form"
	When User enter first name "Jagadish" in the firstname field
	And User enter last name "Moharana" in the lastname field
	And User enter email "jagadish@gmail.com" in the email field
	And User enter contact number "1234567899" in the contact number field
	And User enter message "Hii i am a Tester" in the message field
	And User click on the submit button
	Then User should receive "Thank You for reaching out to us" alert message