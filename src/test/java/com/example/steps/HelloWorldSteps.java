package com.example.steps;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.example.HelloWorld;

/**
 * This class defines the steps for the Cucumber HelloWorld feature set.
 *
 * @author Felicity Hughes
 * @since 10
 */
public class HelloWorldSteps {
    /**
     * Instance of the class under test.
     */
    private HelloWorld greeter = new HelloWorld();

    /**
     * 'Then' step, which asserts the output of
     * {@link HelloWorld#printGreeting()} equals the supplied value.
     *
     * @param greeting The expected greeting from the {@link HelloWorld} class.
     */
    @Then("should result in $greeting")
    public void checkGreeting(@Named("greeting") String greeting) {
        assertEquals(greeter.printGreeting(), greeting);
    }

    /**
     * 'Given' step, which asserts the {@link HelloWorld#setName(String)}
     * method properly saves the supplied name.
     *
     * @param name The name to set in the {@link HelloWorld} class.
     */
    @Given("the name $name")
    public void setName(@Named("name") String name) {
        greeter.setName(name);
        assertEquals(greeter.getName(), name);
    }

    /**
     * 'When' step, which asserts the {@link HelloWorld#setSalutation(String)}
     * method properly saves the supplied salutation.
     *
     * @param salutation The salutation to set in the {@link HelloWorld} class.
     */
    @When("combined with $salutation")
    public void setSalutation(@Named("salutation") String salutation) {
        greeter.setSalutation(salutation);
        assertEquals(greeter.getSalutation(), salutation);
    }
}
