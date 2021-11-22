Feature: Gift DropDown Automate
@GiftsDropdown
Scenario Outline: Add Gift to Cart
	Given Open Big Small Website "<URL>" for Gifts
	Then  Click on  Gift drop down section 
	And   Select "<item>" from dropdown from gifts menu
	And   select "<product>" of your choice from dropdown
	Then  Select "<quantity>" and add to cart for gift
	And   If cart page is Displayed Close it from gift page
	
Examples:
  |URL                     |item            | product           |quantity|
  |https://www.bigsmall.in/|Gifts For Girls | Scratch World Map | 3      | 
