Feature: F01_Going from main movies list screen to the movie details screen and vs

  Scenario: user checks the movies list and go to the movie details screen

    Given user go to movies list screen
    When  user select movie item "Emily the Criminal"
    And   user should be navigated to movie screen successfully
    And   user scroll in movie details screen and expand last review item "MSB"
    And   user clicks navigate up button to go back to movies list screen
    And   user select first movie in movies list "Emily the Criminal"
    And   user swipe Trailers
    Then  user go back to movies list screen



