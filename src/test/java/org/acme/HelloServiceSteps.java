package org.acme;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloServiceSteps {


    String result;
    String name;
    String street;
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
        name = personservice.p1.name;
        assertEquals(string,name);
    }

    @Then("the street {string}")
    public void the_street(String string) {
        street = personservice.p1.street;
        assertEquals(string, street);
    }


}
