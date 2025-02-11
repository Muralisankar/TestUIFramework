package Cucumber.Automation;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.Assert;

import gherkin.formatter.model.Result;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Unit test for simple App.
 */
public class APIFunctions {
	
	public static void createGameCard() {
		RestAssured.baseURI = "https://apicardconnect.amusementconnect.com/api/CardTransactions";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams =  new JSONObject();
		
		requestParams.put("apiKey", "e316a249-b5bd-4ad1-a229-d2b49620ca55");
		requestParams.put("locationId", "c242396a-0307-4648-beea-c393188160ec");
		requestParams.put("cardNo", "5123456789");
		requestParams.put("transactionNo", "210901135112981");
		requestParams.put("isNewCard", true);
		requestParams.put("paymentMethod", "Cash");
		requestParams.put("amount", 10.0);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/CreateCard");
		String responseBody = response.getBody().asString();
		Object rbObj = JSONValue.parse(responseBody);
		JSONObject jsonObject = (JSONObject) rbObj;   
		
		String success = jsonObject.get("success").toString(); 
		String message =  jsonObject.get("message").toString();
		System.out.println("response body is :"+responseBody);
		System.out.println("success is :"+success);
		System.out.println("message is :"+message);
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is :" + statusCode);
		
		if(statusCode==200 && success.equalsIgnoreCase("true")&&message.equalsIgnoreCase("Success")) {
			System.out.println("Pass");
			//Assert.assertTrue(true);
		}else
		{
			System.out.println("fail : Something went wrong!");
			//Assert.assertTrue(false);
		
		}
	}
	
	public static void verifyGameCardBalance() {
		RestAssured.baseURI = "https://apicardconnect.amusementconnect.com/api/CardTransactions";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams =  new JSONObject();
		
		requestParams.put("apiKey", "e316a249-b5bd-4ad1-a229-d2b49620ca55");
		requestParams.put("locationId", "c242396a-0307-4648-beea-c393188160ec");
		requestParams.put("cardNo", "5123456789");
		requestParams.put("IsNewCard", false);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/GetCardBalance");
		String responseBody = response.getBody().asString();
		//Map responseBody = response.getBody().
		
		Object rbObj = JSONValue.parse(responseBody);
		JSONObject jsonObject = (JSONObject) rbObj;   
		
		String success = jsonObject.get("success").toString(); 
		String message =  jsonObject.get("message").toString();
		System.out.println("response body is :"+responseBody);
		System.out.println("success is :"+success);
		System.out.println("message is :"+message);
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is :"+statusCode);
		
		if(statusCode==200 && success.equalsIgnoreCase("true")&&message.equalsIgnoreCase("Success")) {
			System.out.println("Pass");
			//Assert.assertTrue(true);
		}else
		{
			System.out.println("fail : Something went wrong!");
			//Assert.assertTrue(false);
			//Assert.assertEquals(success, "false");
			//Assert.assertEquals(message, "Duplicate transaction #");
		}
		
		//String ExpectedResult = "{\"success\":true,\"message\":\"Success\",\"developerErrorMessage\":null,\"balanceCredits\":10.00,\"balanceAmount\":10.000,\"balanceTickets\":0.0,\"balanceAmountByTickets\":0.000}";
		//Assert.assertEquals(ExpectedResult, responseBody);
		//String successCode = response.jsonPath().get("successCode");
		//System.out.println("successCode is :"+successCode);
		
	}
	
	
	public static void addAmountToGameCard() {
		RestAssured.baseURI = "https://apicardconnect.amusementconnect.com/api/CardTransactions";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams =  new JSONObject();
		
		requestParams.put("apiKey", "e316a249-b5bd-4ad1-a229-d2b49620ca55");
		requestParams.put("locationId", "c242396a-0307-4648-beea-c393188160ec");
		requestParams.put("cardNo", "5123456789");
		requestParams.put("transactionNo", "210901135112982");
		requestParams.put("isNewCard", false);
		requestParams.put("paymentMethod", "Cash");
		requestParams.put("amount", 10.0);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/CreateCard");
		String responseBody = response.getBody().asString();
		Object rbObj = JSONValue.parse(responseBody);
		JSONObject jsonObject = (JSONObject) rbObj;   
		
		String success = jsonObject.get("success").toString(); 
		String message =  jsonObject.get("message").toString();
		System.out.println("response body is :"+responseBody);
		System.out.println("success is :"+success);
		System.out.println("message is :"+message);
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is :" + statusCode);
		
		if(statusCode==200 && success.equalsIgnoreCase("true")&&message.equalsIgnoreCase("Success")) {
			System.out.println("Pass");
			//Assert.assertTrue(true);
		}else
		{
			System.out.println("fail : Something went wrong!");
			//Assert.assertTrue(false);
			Assert.assertEquals(success, "false");
			Assert.assertEquals(message, "Duplicate transaction #");
		}
		//String successCode = response.jsonPath().get("successCode");
		//System.out.println("successCode is :"+successCode);
	}
	
	public static void verifyUpdatedBalanceGameCard() {
		RestAssured.baseURI = "https://apicardconnect.amusementconnect.com/api/CardTransactions";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams =  new JSONObject();
		
		requestParams.put("apiKey", "e316a249-b5bd-4ad1-a229-d2b49620ca55");
		requestParams.put("locationId", "c242396a-0307-4648-beea-c393188160ec");
		requestParams.put("cardNo", "5123456789");
		requestParams.put("IsNewCard", false);
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/GetCardBalance");
		String responseBody = response.getBody().asString();
		Object rbObj = JSONValue.parse(responseBody);
		JSONObject jsonObject = (JSONObject) rbObj;   
		
		String success = jsonObject.get("success").toString(); 
		String message =  jsonObject.get("message").toString();
		System.out.println("response body is :"+responseBody);
		System.out.println("success is :"+success);
		System.out.println("message is :"+message);
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is :"+statusCode);
		
		if(statusCode==200 && success.equalsIgnoreCase("true")&&message.equalsIgnoreCase("Success")) {
			System.out.println("Pass");
			//Assert.assertTrue(true);
		}else
		{
			System.out.println("fail : Something went wrong!");
			//Assert.assertTrue(false);
			//Assert.assertEquals(success, "false");
			//Assert.assertEquals(message, "Duplicate transaction #");
		}
		//String ExpectedResult = "{\"success\":true,\"message\":\"Success\",\"developerErrorMessage\":null,\"balanceCredits\":10.00,\"balanceAmount\":20.000,\"balanceTickets\":0.0,\"balanceAmountByTickets\":0.000}";
		//Assert.assertEquals(ExpectedResult, responseBody);
		//String successCode = response.jsonPath().get("successCode");
		//System.out.println("successCode is :"+successCode);
	}
    
}
