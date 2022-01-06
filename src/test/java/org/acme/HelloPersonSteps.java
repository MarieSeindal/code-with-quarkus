package org.acme;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HelloPersonSteps {

    Person result;
    Person person;
    HelloPersonService service = new HelloPersonService();
    @When("I call the hello service with name")
    public void iCallTheHelloService(String string) {
        result = service.helloPerson();
    }
    @Then("I get the answer {string}")
    public void iGetTheAnswer(String string) {
        assertEquals(string,result);
    }

    @When("I call the hello service to get person for Json")
    public void iCallTheHelloServiceToGetPersonViaXml() {
        person = service.helloPerson();
    }

    @Then("I get a person with name {string} and address {string}")
    public void iGetAPersonWithNameAndAddress(String name, String address) {
        Assertions.assertEquals(name, person.getName());
        Assertions.assertEquals(address, person.getAddress());
    }
}