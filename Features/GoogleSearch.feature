 Feature: google search 

Scenario Outline: Single keyword search 

	Given I am on google homepage 
	When I enter the technical single "<keyword>" 
	And I enter google search button 
	Then I see relevant results 
	
	Examples: 
	|keyword	|
	|Java		|
	|Selenium	|