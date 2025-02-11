package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GameCard {
	
	 @Given("^Create a new gamecard with (.+)(.+)(.+)(.+)(.+)(.+)(.+)$")
	    public void create_a_new_gamecard_with(String apikey, String locationid, String cardno, String transactionno, String isnewcard, String paymentmethod, String amount)  {
	        System.out.println("Step1");
	    }

	    @Then("^Verify the updated balance of the gamecard with (.+)(.+)(.+)(.+)(.+)(.+)(.+)$")
	    public void verify_the_updated_balance_of_the_gamecard_with(String apikey, String locationid, String cardno, String transactionno, String isnewcard, String paymentmethod, String amount)  {
	    	System.out.println("Step4");
	    }

	    @And("^Verify the balance of the gamecard with (.+)(.+)(.+)(.+)(.+)(.+)(.+)$")
	    public void verify_the_balance_of_the_gamecard_with(String apikey, String locationid, String cardno, String transactionno, String isnewcard, String paymentmethod, String amount){
	    	System.out.println("Step2");
	    }

	    @And("^Add amount to the gamecard with (.+)(.+)(.+)(.+)(.+)(.+)(.+)$")
	    public void add_amount_to_the_gamecard_with(String apikey, String locationid, String cardno, String transactionno, String isnewcard, String paymentmethod, String amount){
	    	System.out.println("Step3 :"+apikey+" :"+locationid+" :"+cardno+" :"+transactionno+" :"+isnewcard+" :"+paymentmethod+amount);
	    }

}
