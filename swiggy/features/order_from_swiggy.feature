Feature: Order From Swiggy

Scenario: A user must be able to order a food on Swiggy
Given a user is on the landing page of Swiggy
When he type the deliver location Hyderabad and selects the first location
And he clicks on the first restaurant shown under Top restaurants shown in Hyderabad
And he clicks on Add button corresponding to first listed dish
And he hovers the pointer over the cart
And he clicks on Checkout button in the sub menu
Then he must be able to order the food successfully and he must see the message - "To place your order now, log in to your existing account or sign up."
