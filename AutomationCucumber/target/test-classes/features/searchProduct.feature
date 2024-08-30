
Feature: Search and place the order for Products

Scenario: Search Experience for product search in both home and Offers page

Given User is on Greencart landing page
When User searched with shortname "Tom" and extract actual name of product
Then User searched for "Tom" shortname in offers page 
And validate product name in offers page matches with landing page

