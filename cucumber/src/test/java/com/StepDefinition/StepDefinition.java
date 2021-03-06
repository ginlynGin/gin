package com.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.file.FileReadManager;
import com.pom.PageObjectManager;
import com.runnerFile.Runner_File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  extends Base {
	
	public static WebDriver driver = Base.browser_Launch("chrome");
	
//	public static WebDriver driver =Runner_File.driver;
	
	
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	@Given("user is launch the application")
	public void user_is_launch_the_application() throws Throwable {
		
		String url = FileReadManager.getInstanceFRM().getinstanceCRM().get_url();
		System.out.println(url);
		launch_Url(url);
		
	   
	}

	@When("user is enter the user name in user field")
	public void user_is_enter_the_user_name_in_user_field() throws Throwable {
		
		user_Input(pom.getLogin_Page().getUsername(),FileReadManager.getInstanceFRM().getinstanceCRM().get_username());
	 
	}

	@When("user is enter the password in password field")
	public void user_is_enter_the_password_in_password_field() throws Throwable {
		user_Input(pom.getLogin_Page().getPassword(),FileReadManager.getInstanceFRM().getinstanceCRM().get_Password());
		
		
	} 

	@Then("user is click on the submit Button")
	public void user_is_click_on_the_submit_button() {
		clickOnButton(pom.getLogin_Page().getLogin()); 
	}

}