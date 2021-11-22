Feature: Secret Santa Gift Automate
@SecretSanta
Scenario Outline: Add Secret Santa Gift to Cart
	Given Open Big Small Website "<URL>" for secret santa
	Then Click on Secret Santa Gift section
	And  Click on Tissue Box product
	And  select Quantity of tissue box product
	Then Click on Add to Cart Button from tissue box page
	And  If cart page is Displayed Close it from secret santa page
	
Examples:
  |URL                     |
  |https://www.bigsmall.in/|