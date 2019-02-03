Feature: This is to setup Test

  @TestSetup
  Scenario Outline: Test Setup
    Given User provides the browser as "<browser>"
    And Initiate and set the Driver in BaseClass

    Examples:
      | browser |
#      | firefox |
      | chrome  |
#      | IE |