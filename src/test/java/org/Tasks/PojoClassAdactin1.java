package org.Tasks;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClassAdactin1 extends BaseClass1{
	public void PojoClassAdactin1() {
		PageFactory.initElements(driver,this);
}
//	Username
//	AND operator
	@FindBys({
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']")
		})
	private WebElement txtusername;
	

//Password
//OR operator
	@FindAll({
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtpassword;
	
	@CacheLookup
//	like refreshing,makes it fast
	
//Button Login
//	AND operator
	@FindBys({
		@FindBy(xpath="//input[@id='login']"),	
		@FindBy(xpath="//input[@value='Login']")
	})
	
private List<WebElement>login;

	

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public List<WebElement> getLogin() {
		return login;
	}
}

	
	
	
	
	