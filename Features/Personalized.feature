Feature: Personalized Gift Automate
@Personalized
Scenario Outline: Add Personalized Gift to Cart
	Given Open Big Small Website "<URL>" for personalized gifts
	Then Click on Peronalized Gift section
	And  Click on Personalized Name Glass Bottle
	And  select "<Quantity>" and add customised Name 
	Then Click on Add to Cart Button from glass bottle page
	And  If cart page is Displayed Close it from personalized gifts
	
Examples:
  |URL                     |Quantity|
  |https://www.bigsmall.in/|3       |