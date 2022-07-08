

package com.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="room_no")
	private WebElement roomno;
	
	@FindBy(id="Submit")
	private WebElement submit;
	

	
	public Search_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}




	public WebElement getRoom_type() {
		return room_type;
	}




	public WebElement getRoom_nos() {
		return room_nos;
	}




	public WebElement getDatepickin() {
		return datepickin;
	}




	public WebElement getDatepickout() {
		return datepickout;
	}




	public WebElement getAdult() {
		return adult;
	}




	public WebElement getRoomno() {
		return roomno;
	}




	public WebElement getSubmit() {
		return submit;
	}
	
	
	

}
