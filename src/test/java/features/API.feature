#Author : Muralisankar
@APITest1
Feature: API Automation

  @TC0001
  Scenario: TC0001 Validate a gamecard
    Given Create a new gamecard
    And Verify the balance of the gamecard
    And Add amount to the gamecard
    Then Verify the updated balance of the gamecard
    