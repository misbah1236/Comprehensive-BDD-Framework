Feature: What'sNew Gift Automate
@whatsnew
Scenario Outline: Add What'sNew Gift to Cart
	Given Open Big Small Website "<URL>" for What'sNew page
	Then click What'sNew  Gift section 
	And  Click on "<product>" from list of products on what's new page
	And  select "<quantity>" of product you have selected from What'snew page
	Then Click on Add to Cart Button from what'snew page
	And  If cart page is Displayed Close it from what'snew page
	
Examples:
  |URL                     |product             |quantity|
  |https://www.bigsmall.in/|Travel Pocket Diary | 4      |