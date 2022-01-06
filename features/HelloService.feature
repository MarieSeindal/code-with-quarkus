Feature: HelloService

  Scenario: Correct greeting
    When I call the hello service
    Then I get the answe "Hello Hi"

  Scenario: Person
    When I call the person service
    Then I get the answer "H"
