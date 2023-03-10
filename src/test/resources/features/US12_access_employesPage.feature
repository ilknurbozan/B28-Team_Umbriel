@mila
Feature: As a user, I want to access the Employees page.
 # Background: User is already in the log in page


  Scenario: Verify the users view all modules in the T Employees page

    Given users are on the homepage
    When users click the Employees module
    Then verify the users see flowing 6 options:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |


