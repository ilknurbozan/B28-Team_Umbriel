@US11_Orhan
Feature:BleuCrm app Access the Time and Reports Page.
  Agile story:As a user, I want to access the Time and Reports page.

  Scenario:Verify time and reports page functionality
    Given user is already on the home page
    And  user clicks to time and reports module
    Then user should see five options are displayed below
      | Absence Chart         |
      | Worktime              |
      | Bitrix24.Time         |
      | Work Reports          |
      | Meetings and Briefings |