Feature: As a user, I should be able to see all the options under the MORE tab on the homepage.

@Fatima
Scenario: Verify the users view all options under the MORE tab

  Given users are on the homepage

  When users click the MORE tab

  Then verify the users see flowing four options:

    | File         |
    | Appreciation |
    | Announcement |
    | Workflow     |