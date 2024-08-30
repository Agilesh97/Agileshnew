
Feature: Ebv Application Login

Scenario: Login with valid Email ID and Password
Given user is on loginpage and click Username Textbox
Then user clicks the password field
And user clicks signin icon
Then user click signout and user signed out from the application


#Scenario: user login with invalid Email ID and password
#
#Given User login with Invalid username
#Then pass Invalid password 
#And Click Signin