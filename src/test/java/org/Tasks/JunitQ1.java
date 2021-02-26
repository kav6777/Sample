//https://www.facebook.com/
//Enter username & password & verify whether input data correct or not by using junit framework.
package org.Tasks;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JunitQ1 extends BaseClass1{
	@BeforeClass
	public static void launchBrowser(){
		launchBrowser();
	}
	@Before
	public void start() {
		System.out.println("Start Testing tc");
}
	@After
	private void done() {
		System.out.println("Testing tc done");
}
	@Test
	public void tc1() {
	loadUrl("https://www.facebook.com/");
}
	
	@Test
	public void tc2() {
		maxWindow();
}
	@Test
	public void tc3() {
		PojoClassFb fb=new PojoClassFb();
		
fill(fb.getEmail(),"Project@gmail.com");
fill(fb.getPassword(),"project123");
btnLogin(fb.getLogin());

}
}



