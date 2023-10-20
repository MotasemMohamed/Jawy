Feature: Check package price and currency
  I want to check the currency and price for each package

  Scenario: : CheckCurrencyIraq
    Given User Choose Iraq nationality
    When  check the currency in the dashboard
    And check the currency in the Classic package