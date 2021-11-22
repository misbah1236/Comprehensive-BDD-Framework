Feature: HomeDecor Gift Automate
@HomeDecor
Scenario Outline: Add HomeDecor Gift to Cart
	Given Open Big Small Website "<URL>" for HomeDecor
	Then Click on HomeDecor Gift section
	And  Click on Lamp item  
	And  select Quantity for lamp item
	Then Click on Add to Cart Button for lamp product
	And  If cart page is Displayed Close it from HomeDecor page
	
Examples:
  |URL                     |
  |https://www.bigsmall.in/|