@anil
Feature:   As a user, I should be able to access the Chat and Calls module.

  Scenario Outline: Verify the users view all options in the Chat and Calls module

    Examples:

    Given users are on the homepage
    When users click the CHAT and Calls module
    Then verify the users see flowing 4 options:


      | Message       |
      | Notifications |
      | Settings      |
      | Active Stream |