@US09_Orhan
Feature:BleuCrm app Access My-profile Page
  Agile story:As a user, I want to access my profile page.

  Scenario:Verify my profile page functionality
    Given user is already on the home page
    Then  user clicks to username block
    And  user clicks to my profile section
    Then user should see five options are displayed
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |





