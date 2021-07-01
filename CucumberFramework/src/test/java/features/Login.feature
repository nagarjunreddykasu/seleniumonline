@login @sanity	@regression
Feature: Login
  In order to verify Login page validations
  As a user
  I want to enter user name and password

 
  Scenario Outline: In order to verify Login validations
    Given user navigates to QA portal
    When user validates Login page title 
    	|title|
    	|Circulus - Login|
    And user entered "<username>" username
    And user entered "<password>" password
    And user clicked on Sign In button
    Then validation message "<result>" should be displayed for "<flag>"

		@datadriven
    Examples: 
      | username           | password  |flag			| result    |
      |										 |					 |blank 		|Please enter Username / Email Address.:Please enter Password.|
      | nkasu@frontier.com | xeno@123$ |invpwd		|Invalid Username / Email Address or Password.|
      | nkasu@gmail.com    | Test@123  |invuser		|Invalid Username / Email Address or Password.|
      | nagarjun					 | Abc@321	 |invEmail	|Please enter a valid Username / Email Address.|
      