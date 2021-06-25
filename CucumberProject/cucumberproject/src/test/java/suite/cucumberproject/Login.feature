Feature: Login
In order to perform successfull login
As a user
I want to enter valid user name and password


#Background:
#Given user navigates to QA portal
#When user validates Login page title

#Scenario: In order to verify Login
#Given user navigates to QA portal
#When user validates Login page title
#And user entered "valid" username
#And user entered "valid" password
#And user clicked on Sign In button
#Then user "shouldbe" succussfully logged in


#Scenario: In order to verify Login with invalid credentials
#And user entered "invalid" username
#And user entered "invalid" password
#And user clicked on Sign In button
#Then user "shouldnot" succussfully logged in


#To comment block of code, Ctrl+/

Scenario Outline: In order to verify Login
Given user navigates to QA portal
When user validates Login page title
And user entered "<username>" username
And user entered "<password>" password
And user clicked on Sign In button
And user selects age category
	|Age	|	Location|
	|Below 18	|India	|
	|Above 18	|USA|
Then user "<result>" succussfully logged in

Examples:
|username	|password	|result	|
|nkasu@frontier.com		|xeno@123		|shouldbe|
|nkasu@xtg.com	|Test@123	|shouldnot|
