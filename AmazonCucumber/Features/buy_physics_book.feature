Feature: Buy Physics Book

@TC_103 @book_purchase
Scenario: A user must be able to purchase physics book on Amazon
Given a user is on the landing page of Amazon
When he enters Physics book in the search bar and selects third option
And he selects the rating four star and above from the left side bar
And he clicks on the first available book
And he switch focus on the new tab
And he clicks on the Add cart button
And he verifies the text Added to Cart is displayed
And he clicks on proceed to buy button
Then he must verify that user is on the Sign in page.
