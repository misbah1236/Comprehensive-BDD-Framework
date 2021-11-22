Feature: Rakhi Gift Automate
@rakhi
Scenario Outline: Add rakhi Gift to Cart
	Given Open Big Small Website "<URL>" for rakhi page
	Then click rakhi Gift section 
	And  Click on "<product>" from list of products on rakhi gift page
	And  select "<quantity>" of product you have selected from rakhi gift page
	Then Click on Add to Cart Button from rakhi gift page
	And  If cart page is Displayed Close it from rakhi gift page
	
Examples:
  |URL                     |product             |quantity|
  |https://www.bigsmall.in/|Bhaiya Ciao Rakhi   | 2      |