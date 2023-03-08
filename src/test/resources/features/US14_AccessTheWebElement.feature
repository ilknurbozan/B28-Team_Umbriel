@mehmet2
Feature: Access to the Company page functionality

  Agile story: As a user I should be able to access to the Company page

  Scenario: Verify users see the 7 modules in the Company page shown as design
    Given user is already on homepage
    And user clicks the Company page
    Then users should see seven modules in the Company page
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Business News(RSS)   |
      | Career               |


