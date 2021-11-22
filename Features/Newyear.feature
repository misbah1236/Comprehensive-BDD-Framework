Feature: Newyear Gift Automate
@newyear
Scenario Outline: Add newyear Gift to Cart
	Given Open Big Small Website "<URL>" for newyear page
	Then click newyear Gift section 
	And  Click on "<product>" from list of products on newyear gift page
	And  select "<quantity>" of product you have selected from newyear gift page
	Then Click on Add to Cart Button from newyear gift page
	And  If cart page is Displayed Close it from newyear gift page
	
Examples:
  |URL                     |product           |quantity|
  |https://www.bigsmall.in/|Golf Coffee Mug   | 2      |