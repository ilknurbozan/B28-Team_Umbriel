@anil
Feature:   As a user, I should be able to access the Chat and Calls module.

   #  Background: User is already logged in


  Scenario: Verify the users view all options in the Chat and Calls module
    Given users are on the homepage
    When users click the CHAT and Calls module
    Then the user see the below options:
      | Message         |
      | Activity Stream |
      | Settings        |
      | Notifications   |
