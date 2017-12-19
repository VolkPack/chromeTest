package eComerceTests.PageObjects;


import org.openqa.selenium.WebDriver;

import support.Wireframe;

public class MainPage extends Wireframe{
	
	//final private String MAIN_SITE_URL = "http://automationpractice.com/index.php";
	final private String SIGN_IN_XPATH = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
	final private String CONTACT_US_XPATH = "//*[@id=\"contact-link\"]/a";
	//private WebDriver driver;
	

	
	
	public MainPage(WebDriver d) {
		super();
		//this.driver = d;
		setDriver(d);
	}

	
	public void clickSignIn(){
		clickByXPath(SIGN_IN_XPATH);
	}
	
	public void clickContactUs(){
		clickByXPath(CONTACT_US_XPATH);
	}
	
}
