package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Wireframe {
	private WebDriver driver;
	
	public void setDriver(WebDriver d) {
		driver = d;
	}
	
	public void clickByXPath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clickById(String id) {
		driver.findElement(By.id(id)).click();
	}
}

//https://github.com/rubinshteyn89/Selenium_Java_01/blob/master/DriverUtils.java
