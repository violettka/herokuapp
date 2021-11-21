Feature: Login Page
  In order to access to Secure Area
  As an existing user
  I want to login

  Background:
    Given I am on the Login page

  Scenario: Positive login
    When I login with existing credentials
    And I click Login button
    Then I observe the successful login message

  Scenario Outline: Negative login
    When I login with <credentials_type> credentials
    And I click Login button
    Then I observe the <message_type> login message

    Examples:

      | credentials_type | message_type           |
      | wrong.username   | wrong.username.message |
      | wrong.password   | wrong.password.message |