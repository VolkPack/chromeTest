package eComerceTests.PageObjects;


public class MainPage {
	
	final private String MAIN_SITE_URL = "http://automationpractice.com/index.php";
	final private String SIGN_IN_XPATH = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
	final private String CONTACT_US_XPATH = "//*[@id=\"contact-link\"]/a";
	
	public String getMainSiteURL() {
		return MAIN_SITE_URL;
	}
	
	public String getSignInXPath() {
		return SIGN_IN_XPATH;
	}
	
	public String getContactUsXPath() {
		return CONTACT_US_XPATH;
	}
	
	



}
