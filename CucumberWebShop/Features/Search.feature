Feature: Search for the product

@TC_102 @search_product
Scenario: A user must be able to search for the product
Given: a user is on the landing page of Demo Web Shop
When a user must should click on Login button
And user enters the username and password
And user clicks on the Log in button
And user enters the required product name in search box
Then user must verify a text "Smartphone" from the product page