package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("Ernie is hungry")
    public void ernie_is_hungry() {
        System.out.println("It is from Given");

    }
    @When("He will eat some cucumbers")
    public void he_will_eat_some_cucumbers() {
        System.out.println("It is from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }

}
