Feature: Official Merchandise DropDown Automate
@officialmerch
Scenario Outline: Add Official Merchandise Gift to Cart
	Given Open Big Small Website "<URL>" for Official Merch
	Then  Click on  Official Merchandise drop down section
	And   Select "<item>" from dropdown from Official merch
	And   select "<product>" of your choice from selected item
	Then  Select "<quantity>" and add to cart from official merch page
	And   If cart page is Displayed Close it from official merch page
	
Examples:
  |URL                     |item                       | product      |quantity|
  |https://www.bigsmall.in/|Official Marvel Merchandise|Star Wars Mug | 2      |
  
