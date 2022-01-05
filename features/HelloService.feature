Feature: HelloService

  Scenario: Correct greeting
    When I call the hello service
    Then I get the answer "Hello RESTEasy"
