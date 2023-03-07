@anil
Feature:   As a user, I should be able to access the Chat and Calls module.

  Background: users are on the homepage
    Given users are on the homepage

  Scenario: Verify the users view all options in the Chat and Calls module
    When users click the CHAT and Calls module
    Then the user see the below options:
      | Message(s)       |
      | Activity Stream  |
      | Settings        |
      | Notifications   |
