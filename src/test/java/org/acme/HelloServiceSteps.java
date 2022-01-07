package org.acme;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloServiceSteps {

    String result;
    String test;
    HelloService service = new HelloService();
    PersonService personservice = new PersonService();

    @When("I call the hello service")
    public void iCallTheHelloService() {
        result = service.hello();
    }
    @Then("I get the answer {string}")
    public void iGetTheAnswer(String string) {
        assertEquals(string,result);
    }

    @When("I call the person service")
    public void i_call_the_person_service() {
        result = personservice.hello();
    }
    @When("I call the person service2")
    public void i_call_the_person_service2() {
        result = personservice.hello2();
    }

    @Then("I get the name {string}")
    public void i_get_the_name(String string) {
        assertEquals(personservice.p.getName(), string);
    }

    @Then("the address {string}")
    public void the_address(String string) {
        assertEquals(personservice.p.getAddress(), string);
    }



}
