Feature: Verify News Page

  @NewsPage
  Scenario: Verify User lands on NewsPage by clicking News link
    Given User is in HomePage
    When User clicks on News link
    Then User lands on News Page

  @NewsPage
  Scenario: Verify News logo and UKNews Link is displayed
    Given User is in NewsPage
    Then News Logo should be displayed
    And UK News link should be displayed

  @NewsPage
  Scenario: Verify UK News Pages loads by clicking on UK
    Given User is in NewsPage
    When User clicks on UK link
    Then UK News Page should be loaded