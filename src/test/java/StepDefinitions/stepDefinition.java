package StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Cucumber.Automation.APIFunctions;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class stepDefinition {
	

    @Given("^Create a new gamecard$")
    public void create_a_new_gamecard() throws Throwable {
    	
    	APIFunctions.createGameCard(); 
    }

    @Then("^Verify the updated balance of the gamecard$")
    public void verify_the_updated_balance_of_the_gamecard() throws Throwable {
        APIFunctions.verifyUpdatedBalanceGameCard();
    }

    @And("^Verify the balance of the gamecard$")
    public void verify_the_balance_of_the_gamecard() throws Throwable {
      APIFunctions.verifyGameCardBalance();
    }
    
    @And("^Add amount to the gamecard$")
    public void add_amount_to_the_gamecard() throws Throwable {
        APIFunctions.addAmountToGameCard();
    }

}