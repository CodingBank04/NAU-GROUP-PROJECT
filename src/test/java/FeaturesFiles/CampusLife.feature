Feature: User will see Campus Life drop-down menu at the NAU Home Page, under the NAU Logo
  Scenario: Search for Campus Life drop-down menu
    Given User will navigate to the NAU website
    When User hovers on "Campus Life"
    Then Three sections on Student Services, Residential Life and Parking & Security are displayed on screen

  Scenario: Student Services will be highlighted
    Given User will navigate to the NAU website
    When User hovers on "Campus Life"
    Then Sub-section on Student Services will be highlighted when user hovers over it

  Scenario:Residential Life will be highlighted
    Given User will navigate to the NAU website
    When User hovers on "Campus Life"
    Then Sub-section on Residential Life will be highlighted when user hovers over it

  Scenario:Parking & Security will be highlighted
    Given User will navigate to the NAU website
    When User hovers on "Campus Life"
    Then Sub-section on Parking & Security will be highlighted when user hovers over it

