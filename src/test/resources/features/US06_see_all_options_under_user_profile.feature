@hasan
Feature: As a user, I should be able to see all the options under the user profile.

  Background: User is already logged in
    Given users are already on the homepage

  Scenario: Verify the users view all options under the profile
    When users click the profile name
    Then verify the users see flowing five options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |