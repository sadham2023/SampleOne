package com.app.stepdefinition;

import com.app.pageexe.LoginPage_PageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageExe extends LoginPage_PageExe{
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	   browserlaunch("https://www.facebook.com");
	}
	@Given("Enter the URL")
	public void enter_the_url() {
	   System.out.println("URL");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    username(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	   passeword(pass);
	}
	@When("Enter the loginbutton")
	public void enter_the_loginbutton() {
	    System.out.println("loginbutton");
	}
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	    System.out.println("HOmepage");
	}
}