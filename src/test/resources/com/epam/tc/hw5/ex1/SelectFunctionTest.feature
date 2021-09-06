Feature: Test on Different Page function for select elements
  Scenario: Select checkbox, radio and element on dropdown list test
    Given I open JDI GitHub site
    And I login as user 'Roman Iovlev'
    And I open through the header menu Service -> Different Elements Page
    When I select checkbox 'Water'
    And I select checkbox 'Wind'
    And I select radio 'Selen'
    And I select 'Yellow' from dropdown list
    Then for checkbox 'Water' there is an individual log row and value is corresponded to the status of checkbox
    And for checkbox 'Wind' there is an individual log row and value is corresponded to the status of checkbox
    And for radio button there is a log row and value is corresponded to the status of radio button
    And for dropdown there is a log row and value is corresponded to the selected value