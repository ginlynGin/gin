package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.login.Login_Page;

public class PageObjectManager {

	public static WebDriver driver;

	private Login_Page lp;
	
	
	public PageObjectManager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
public Login_Page getLogin_Page() {
		
		lp = new Login_Page(driver);
		return lp;
	}
	
}
