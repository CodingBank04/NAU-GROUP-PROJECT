Feature: User will see the menu on the left side bar in the Academics page
  Scenario: Search for menu on the left side bar
    Given User will navigate to the  website
    When User clicks "Academics"
    Then The web page will navigate to http://web2.na.edu/academics/

  Scenario: Search for menu on the left side bar
    Given User will navigate to the  website
    When User clicks "Course Schedule"
    Then The web page will navigate to http://web2.na.edu/academics/course-schedule/

  Scenario: Search for menu on the left side bar
    Given User will navigate to the  website
    When User clicks "Finals Schedule"
    Then The web page will navigate to http://web2.na.edu/academics/finals-schedule/

  Scenario: Search for menu on the left side bar
    Given User will navigate to the  website
    When User clicks "Degree Programs"
    Then The web page will navigate to http://web2.na.edu/degree-programs/


