Feature: Test GDI GitHub site function to select 'vip' in User Table Page
  Scenario: Select function in User Table Page Test
    Given I open JDI GitHub site
    And I login as user "Roman Iovlev"
    And I click on "Service" button in Header
    And I click on "User Table" button in Service dropdown
    When I select 'vip' checkbox for 'Sergey Ivan'
    Then I log row has "Vip: condition changed to true" text in log section
