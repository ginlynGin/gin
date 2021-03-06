package com.adactin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.base.Base;
import com.book.Book_Hotel;
import com.filemanager.FileReadManager;
import com.pom.PageObjectModel;

public class Adactin extends Base {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser_Launch("chrome");

		launch_Url(FileReadManager.getInstanceFRM().getinstanceCRM().get_url());
		sleep (10);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageObjectModel pom=new PageObjectModel(driver);
		//Select_Hotel sh = new Select_Hotel(driver);
		Book_Hotel bh = new Book_Hotel(driver);
		user_Input(pom.getLogin_Page().getUsername(),FileReadManager.getInstanceFRM().getinstanceCRM().get_username());
			//pom.getLogin_Page().getUsername(),"raja1994");
		user_Input(pom.getLogin_Page().getPassword(),FileReadManager.getInstanceFRM().getinstanceCRM().get_Password());
				//pom.getLogin_Page().getPassword(),"ayya123");
		clickOnButton(pom.getLogin_Page().getLogin()); 

		dropDown(pom.getSearch_Page().getLocation(), "byindex", "3");

		dropDown(pom.getSearch_Page().getHotels(), "By index", "2");

		dropDown(pom.getSearch_Page().getRoom_type(), "By index", "1");

		dropDown(pom.getSearch_Page().getRoom_nos(), "By index", "1");

		user_Input(pom.getSearch_Page().getDatepickin(), "02/06/2022");

		user_Input(pom.getSearch_Page().getDatepickout(), "02/07/2022");

		dropDown(pom.getSearch_Page().getAdult(), "By index", "1");

		clickOnButton(pom.getSearch_Page().getSubmit());
		clickOnButton(pom.getSelect_Hotel().getRadio());
		clickOnButton(pom.getSelect_Hotel().getCont());
		user_Input(pom.getBook_Hotel().getFname(), "ginlyn");
		user_Input(pom.getBook_Hotel().getLname(), "martin");
		user_Input(pom.getBook_Hotel().getAddress(), "kanyakumari");
		user_Input(pom.getBook_Hotel().getCcnum(), "4441 2765 3090 1264");

		clickOnButton(pom.getBook_Hotel().getCctype());
		dropDown(pom.getBook_Hotel().getCctype(), "By index", "1");

		clickOnButton(pom.getBook_Hotel().getExpmonth());
		dropDown(pom.getBook_Hotel().getExpmonth(), "By index", "1");

		clickOnButton(pom.getBook_Hotel().getExpyear());
		dropDown(pom.getBook_Hotel().getExpyear(), "By index", "12");
		clickOnButton(pom.getBook_Hotel().getBooknow());

		System.out.println("succesfully launching");
		driver.close();

	}

}
