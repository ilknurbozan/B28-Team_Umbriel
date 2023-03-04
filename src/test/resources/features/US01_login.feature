@login
Feature: As a user, I should be able to log in to the with valid credentials

#  Background: User is already in the log in page


@wip
  Scenario: Verify login with valid credentials

  When user use username "<username>" and passcode "<password>"

  And user click the login button

  Then verify the user should be at the home page







