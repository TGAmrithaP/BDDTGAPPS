Feature: Testing the Login Feature of TGAPPS Application

  Background: 
    # it is used to perform repeated Action and to removed the redundant code for faster execution
    #precondition itself
    Given The brower is launched
    And The Apllication is loaded

  Scenario: Testing the login feature with valid data
    #precondition itself
    #Given The brower is launched
    #And  The Apllication is loaded
    #Representing  the Action of Test cases
    When The user Enters the valid user name
    And The user Enter the valid password
    And The user Click on Login button
    #Representating previous Action
    Then Dashbord will Display
    When user Click on Open menu application
    And User Click on My activity Link
    And User Click on My DSR Link
    And User Click on TS ID
		And User Click on PullBiometric 
		And User Click on OKButton
		And User Click on TsDetails
		And User Click on Location
		And User Click on Select Office
		And User Click on Task
		And User Click on SubmitButton
		And User Click on OK1
	  And User Click on OK2
				
