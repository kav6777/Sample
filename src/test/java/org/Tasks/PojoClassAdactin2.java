package org.Tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClassAdactin2 extends BaseClass1{
	public PojoClassAdactin2() {
		PageFactory.initElements(driver,this); 	
	}
	//Location
	
	@FindBys({
		@FindBy(xpath="//Select[@id='location']"),
		@FindBy(xpath="//select[@name='location']")
		})
	private WebElement locate;
//	Hotels
	
	@FindAll({
		@FindBy(xpath="//Select[@id='hotels']"),
		@FindBy(xpath="//select[@name='hotels']")
	})
	private WebElement hotel;
//	Room Type
	@FindBys({
	@FindBy(xpath="//select[@id='room_type']"),
	@FindBy(xpath="//select[@name='room_type']")
	})
	
//No. of rooms
	@FindAll({
	@FindBy(xpath="//select[@id='room_nos']"),
	@FindBy(xpath="//select[@name='room_nos']")
	})
	private WebElement roomType;
	
	//Check in Date	
	@FindAll({
	@FindBy(xpath="//input[@id='datepick_in']"),
	@FindBy(xpath="//input[@class='date_pick']")
	})
	private WebElement checkin;
	
	//Check out Date
	@FindBys({
	@FindBy(xpath="//input[@id='datepick_out']"),
	@FindBy(xpath="//input[@class='date_pick']")
	})
	private WebElement checkout;
	
//	Adult Room
	@FindBys({
	@FindBy(xpath="//select[@id='adult_room']"),
	@FindBy(xpath="//select[@name='adult_room']")
	})
	private WebElement adultRoom;
	
//	Children room
	@FindAll({
	@FindBy(xpath="//select[@id='child_room']"),
	@FindBy(xpath="//select[@name='child_room']")
	})
	private WebElement childroom;
	
//	search
	@FindBys({
	@FindBy(xpath="//input[@id='Submit']"),
	@FindBy(xpath="//input[@id='submit']")
})
	private WebElement search;

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}
}
