@hasan
Feature: As a user, I should be able to see all the options under the user profile.

  #  Background: User is already logged in

  Scenario: Verify the users view all options under the profile

    Given users are on th homepage
    When users click the profile name
    Then verify the users see flowing five options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Logout                  |