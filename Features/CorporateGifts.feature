Feature: Corporate Gift Automate
@Corporate
Scenario Outline: Add Corporate Gift to Cart
	Given Open Big Small Website "<URL>" for corporate Gifts
	Then Click on Corporate Gift section
	And  Add "<FullName>" "<phone>" "<email id>" in the form 
	And  click on Submit Button 
	
Examples:
  |URL                     |FullName |phone      |email id|
  |https://www.bigsmall.in/|Misbah   | 7207786956|dummy@gmail.com| 