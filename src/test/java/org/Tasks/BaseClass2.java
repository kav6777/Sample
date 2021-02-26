//resuable method-call-screenshot
package orgtask;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshot {
static WebDriver driver;

public static void driver() {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
} 
public static void launchUrl() {
	driver.get("\"https://www.amazon.in/\"");SS
}
public static void Maaxwindow() {
driver.manage().window().maximize();

}

public static void takeScreenshot() {
ts=(TakesScreenshot)driver;
}


//File source = ts.getScreenshotAs(OutputType.FILE);
//File destination= new File("C:\\Users\\svc-note\\Desktop\\Screenshot\\Amazon.png");
//FileUtils.copyFile(source, destination);
}

}
package org.Tasks;

public class BaseClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
