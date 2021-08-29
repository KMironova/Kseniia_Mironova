Feature: Different Page select elements

  Scenario: Select checkbox, radio and element on dropdown list
    Given I open Home Page
    And I perform login with 'username' and 'password'
    And I open through the header menu  Service -> Different Elements Page
    When I select checkbox with name 'Water'
    And I select checkbox with name 'Wind'
    And I select radio with name 'Selen'
    And I select element from dropdown list with name 'Yellow'
    Then all selected items should be selected
    And should be visible log information for every selected action