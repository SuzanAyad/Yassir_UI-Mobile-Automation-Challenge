Feature: F01_Going from main movies list screen to the movie details screen

  Scenario: user checks the movies list and go to the movie details screen

    Given user go to movies list screen
    When  user select movie item "Emily the Criminal"
    Then  user should be navigated to movie screen successfully


