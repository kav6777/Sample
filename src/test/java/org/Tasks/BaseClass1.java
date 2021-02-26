package org.Tasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import java.awt.Desktop.Action;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass1 {
static WebDriver driver;
static String url;
static Actions a;
static Workbook book;
static Row row;
static Cell cell;
static Sheet sheet;
static File f;
static FileOutputStream fo;
static WebElement element;
public static void launchChromeBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}
public static void closebrowser() {
	driver.close();

}
public static void launchUrl(String Url)	{
driver.get(Url);
}
public static  void maxWindow() {
driver.manage().window().maximize();
}
public static String webPageTitle() {
String title=driver.getTitle();
return title; 
}
public static String pageurl() {
String url = driver.getCurrentUrl();
return url;
}
public static void fill(Object object, String text) {
element.sendKeys(text);
}
public static void btnLogin(WebElement element) {
element.click();
}
public void waittime(long millis) throws InterruptedException {
Thread.sleep(millis);
}
public static Actions action() {
a=new Actions(driver);
return a;
}
public static String excelRead(int rowNo,int cellNo)throws IOException{
File f=new File("C:\\Selenium Workspace\\Sample\\Test Datas\\Adactin Data.xlsx");
//To read date from excel sheet
FileInputStream fin=new FileInputStream(f);
Workbook book=new XSSFWorkbook(fin);
Sheet sheet=book.getSheet("Sheet1");
Row row=sheet.getRow(rowNo);
Cell cell=row.getCell(cellNo);
int cellType=cell.getCellType();
String value="";
if(cellType==1) {
value=cell.getStringCellValue();
}else if(DateUtil.isCellDateFormatted(cell)) {
Date d=cell.getDateCellValue();
SimpleDateFormat s=new SimpleDateFormat("dd-MM-YYYY");
value=s.format(d);
}else {
double d=cell.getNumericCellValue();
//typecasting-downcasting
long l=(long)d;
value=String.valueOf(l);
}
return value;
}
public void excelwrite() throws IOException {
fo=new FileOutputStream(f);
}
}
































