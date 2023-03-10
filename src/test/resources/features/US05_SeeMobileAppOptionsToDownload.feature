@kwesi
Feature: Mobile app options
  Agile story: As a user, I want to see mobile app options to download.

  Background: User is already logged in
    Given user is on the homepage


  Scenario: Verify users can see mobile app options
    Then verify the user sees following mobile app options:
      |  APP STORE  |
      | GOOGLE PLAY |

