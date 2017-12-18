package eComerceTests.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	//final private String MAIN_SITE_URL = "http://automationpractice.com/index.php";
	final private String SIGN_IN_XPATH = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
	final private String CONTACT_US_XPATH = "//*[@id=\"contact-link\"]/a";
	private WebDriver driver;
	

	public void setDriver(WebDriver d) {
		driver = d;
	}
	
	public void clickSignIn(){
		driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
	}
	
	public String ContactUsXPath() {
		return CONTACT_US_XPATH;
	}
	
	



}
