Feature: HelloService

  Scenario: Correct greeting
    When I call the hello service
    Then I get the answer "Hello Hi"

  Scenario: Person
    When I call the person service
    Then I get the name "Alice"
    And the address "RockyRoad"

  Scenario: Person2
    When I call the person service2
    Then I get the name "Mario"
    And the address "RainbowRoad"
