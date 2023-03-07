@logout

Feature: BleuCRM app logout functionality

  Agile story: As a user I should be able to log out and navigate back to the login page

  Scenario: Verify BlueCRM app logout functionality
    Given user is already on homepage
    And user clicks the user profile from the homepage
    And user click the logout option
    Then user should be able to navigate back to the login page and see title as Authorization