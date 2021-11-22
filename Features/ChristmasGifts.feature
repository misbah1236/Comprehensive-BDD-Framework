Feature: Christmas Gifts Automate
@Christmas
Scenario Outline: Add Christmas Gift to Cart
	Given Open Big Small Website "<URL>" for Christmas Gifts
	Then Click on Christmas Gift section
	And  Click on Socks items 
	And  select Quantity for socks
	Then Click on Add to Cart Button for socks
	And  If cart page is Displayed Close it for christmas gifts
	
Examples:
   |URL|
   |https://www.bigsmall.in/|	