package org.Tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClassAdactin3 extends BaseClass1 {
	public PojoClassAdactin3() {
		PageFactory.initElements(driver,this); 	
	}
//	select radio button
	@FindBys({
@FindBy(xpath="//input[@name='radiobutton_0']"),
@FindBy(xpath="//input[@id='radiobutton_0']"),
})
	private WebElement btnradio;
	
//	continue button
	@FindAll({
@FindBy(xpath="//input[@name='continue']"),
@FindBy(xpath="//input[@id='continue'] ")
	})
private WebElement btncontinue;

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
}

	
	