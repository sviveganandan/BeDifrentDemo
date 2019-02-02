Feature: Verify the Home Page links

  @HomePage
  Scenario Outline: Verify "<link>" is displayed on banner in the HomePage
    Given User is in HomePage
    Then "<link>" should be displayed
    Examples:
    | link |
    | News |
    | Sport |
    | Weather |
    | iPlayer |
    | Sounds   |
    | More     |

  @HomePage
  Scenario Outline: Verify "<hiddenLink>" is displayed under More in the HomePage
    Given User is in HomePage
    When User clicks the More link
    Then "<hiddenLink>" should be displayed under More
    Examples:
      | hiddenLink |
      | Taster |
      | TV     |
      | Radio  |
      | Food   |
      | Bitesize |
      | Earth    |
      | Arts     |
      | Local    |
      | Make It Digital |
      | CBeebies        |

