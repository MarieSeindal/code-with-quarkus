Feature: HelloService

  Scenario: Correct greeting
    When I call the hello service
    Then I get the answer "Hello"

  Scenario: Person
    When I call the person service
    Then I get the name "Anne"
    And the street "frimestervej"
