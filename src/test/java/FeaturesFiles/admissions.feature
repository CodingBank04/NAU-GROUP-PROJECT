Feature: Checking some functionality of Admissions pape
  Scenario: Verifying functioanlity of APPLY NOW from drop down menu of Admissions.
    Given user navigates to the website
    When  user cliks on APPLY NOW
    Then the page will navigate to "https://apply.na.edu/admission"
    And the page will apper



    Scenario: Verifying functionality of APPLY NOW page for APPLY NAU button
      Given user navigates to the website
      When user mouse over on APPLY NAU
      Then  APPLY NAU should be underlined
