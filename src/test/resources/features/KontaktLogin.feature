@smoke
Feature: Kontakt Login feature
  User Story: As a user, I should be able to login

  Background: User GrassHomapage sayfasina gider
    Given User am on the Grass GmbH Homepage
    And User click on the Cookies option
    And User click on the Kontakt menu

  Scenario: TC100 GrassKontakPage Positive Test

    And User enter name in the Name field
    And User enter Telefonnummer in the Telefonnummer field
    And User enter email in the Email field
    And User fill in a message in the Ihre Nachricht field
    And User click on the Ich stimme zu option
    And User click on the Send button
    Then User want to verify if the text Ihre Nachricht wurde versendet is displayed


  Scenario: TC200 GrassKontakPage Negative Test

    And User enter name in the Name field
    And User enter String Telefonnummer in the Telefonnummer field
    And User enter email in the Email field
    And User fill in a message in the Ihre Nachricht field
    And User click on the Ich stimme zu option
    And User click on the Send button
    And User want to verify if the text Ihre Nachricht wurde versendet is not displayed

