
Feature: Application Login

Background:
Given Setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@MobileTest @NetBanking
Scenario: Admin page default login
Given user is on netbanking landing page
When user login into application with username "username" and password "1234"
Then Home page is displayed
And cards displayed

@SmokeTest @RegressionTest
Scenario Outline: user page default login

Given user is on netbanking landing page
When user login into application with username "<username>" and password "password" combination
Then Home page is displayed
And cards displayed

Examples:

|username|password|
|debituser|password|
|credituser|password|

@SmokeTest @RegressionTest @Mortgage
#Datadriven Testing
Scenario: user page default login

Given user is in the practice landing page
When user signin into application 
| rahul |
| shetty |
|contact@email.com|
|5467654|
Then Home page is displayed
And cards displayed
