package org.Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

public class PojoExeClassAdactin extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException {
	launchChromeBrowser();
	launchUrl("https://adactinhotelapp.com/");
	maxWindow();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	PojoClassAdactin1 adac=new PojoClassAdactin1();
	WebElement txtusername = adac.getTxtusername();
fill(txtusername,"Kavitha123");
WebElement txtpassword = adac.getTxtpassword();
fill(txtpassword, "kavitha");

List<WebElement> login = adac.getLogin();
//change to List of webelement to webelement
WebElement log = login.get(0);
log.click();

System.out.println("Done");

	}

	
	

}
