package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.book.Book_Hotel;
import com.hotel.Select_Hotel;
import com.login.Login_Page;
import com.search.Search_page;

public class PageObjectModel {
public static WebDriver driver;

private Login_Page lp;
private Search_page sp;
private Select_Hotel sh;
private Book_Hotel bh;






	public PageObjectModel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Login_Page getLogin_Page() {
		
		lp = new Login_Page(driver);
		return lp;
	}
	
	public Search_page getSearch_Page(){
		sp = new Search_page(driver);
		return sp;
	}
	
	public Select_Hotel getSelect_Hotel() {
	sh = new Select_Hotel(driver);
	return sh;
	
	}
	
	
	public  Book_Hotel getBook_Hotel() {
		bh = new Book_Hotel(driver);
		return bh;
	}
	
	
	
	
	
	
	
	

}
