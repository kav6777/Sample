package org.Tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassFb extends BaseClass1 {
	public void loginPojo() {
		PageFactory.initElements(driver,this);
}
//Email
@FindBy(name="email")
private WebElement email;
//	password
@FindBy(id="password")
private WebElement password;
@CacheLookup
//login
	@FindBy(id="submit")
private WebElement login;


public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
}
