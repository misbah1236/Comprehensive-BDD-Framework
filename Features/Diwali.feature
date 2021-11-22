Feature: Diwali Gift Automate
@diwali
Scenario Outline: Add Diwali Gift to Cart
	Given Open Big Small Website "<URL>" for diwali page
	Then click diwali Gift section 
	And  Click on "<product>" from list of products on diwali gift page
	And  select "<quantity>" of product you have selected from diwlai gift page
	Then Click on Add to Cart Button from diwail gift page
	And  If cart page is Displayed Close it from diwali gift page
	
Examples:
  |URL                     |product                 |quantity|
  |https://www.bigsmall.in/|Diya Curtain LED Lights | 2      |