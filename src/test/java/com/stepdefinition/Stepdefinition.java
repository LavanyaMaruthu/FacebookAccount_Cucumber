package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testcucumber.App;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends App {
	
	@Given("^user launch the facebook url$")
	public void user_launch_the_facebook_url() throws Throwable {
	    getBrowser();
	   
	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws Throwable {
	   
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	    
	}


}
