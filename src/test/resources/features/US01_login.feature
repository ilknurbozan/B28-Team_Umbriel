@login
Feature: As a user, I should be able to log in to the with valid credentials


  @wip
  Scenario: Verify login with valid credentials

    When user use username "<username>" and passcode "<password>"

    And user click the login button

    Then verify the user should be at the home page

  @wip
  Scenario: Verify login with invalid credentials

    When user use invalid username "<username>" and passcode "<password>"

    And user click the login button

    Then  verify "Incorrect username or password" should be displayed







