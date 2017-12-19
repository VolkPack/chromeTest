package eComerceTests.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import support.Wireframe;

public class SignUpPage extends Wireframe {
	
	final private String CUST_FNAME = "customer_firstname";
	final private String CUST_LNAME = "customer_lastname";
	final private String EMAIL= "email";
	final private String PASS = "passwd";
	final private String DOB_DAY = "//*[@id=\"days\"]/option[8]";
	final private String DOB_MONTH = "//*[@id=\"months\"]/option[7]";
	final private String DOB_YEAR = "//*[@id=\"years\"]/option[32]";
	final private String NEWSLETTER = "newsletter";
	final private String OPT_IN = "optin";
	final private String FNAME = "firstname";
	final private String LNAME = "lastname";
	private WebDriver driver;	

	public SignUpPage(WebDriver d) {
		super();
		this.driver = d;
		setDriver(driver);
	}

	public String getCUST_FNAME() {
		return CUST_FNAME;
	}

	public String getCUST_LNAME() {
		return CUST_LNAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public String getPASS() {
		return PASS;
	}

	public String getDOB_DAY() {
		return DOB_DAY;
	}

	public String getDOB_MONTH() {
		return DOB_MONTH;
	}

	public String getDOB_YEAR() {
		return DOB_YEAR;
	}

	public String getNEWSLETTER() {
		return NEWSLETTER;
	}

	public String getOPT_IN() {
		return OPT_IN;
	}

	public String getFNAME() {
		return FNAME;
	}

	public String getLNAME() {
		return LNAME;
	}

	public WebDriver getDriver() {
		return driver;
	}

	
	public void send_custfname(String fname) {
		driver.findElement(By.id(CUST_FNAME)).sendKeys(fname);;
		
	}
	
	public void send_custlname(String lname) {
		driver.findElement(By.id(CUST_LNAME)).sendKeys(lname);
	}
	
	
	
}
