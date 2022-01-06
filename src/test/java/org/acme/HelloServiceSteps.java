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

    @Then("I get the name {string}")
    public void i_get_the_name(String string) {
        assertEquals(result, string);
    }
    @Then("the street {string}")
    public void the_street(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
