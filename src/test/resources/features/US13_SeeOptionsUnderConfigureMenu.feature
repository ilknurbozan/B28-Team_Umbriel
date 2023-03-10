@hasan2
Feature: As a user , I should be able to configure the menu

  Background: User is already logged in
    Given users are already on the homepage

  Scenario: Verify users can access to six options under the configure menu
    When user click the configure menu option
    Then verify the users see  flowing six options:
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |


