package eComerceTests.PageObjects;

import org.openqa.selenium.WebDriver;

import support.Wireframe;

public class SignUpPage extends Wireframe {
	
	final private String CUST_FNAME = "customer_firstname";
	final private String CUST_LNAME = "customer_lastname";
	final private String EMAIL= "email";
	final private String PASS = "passwd";
	final private String DOB_DAY_XPATH = "//*[@id=\"days\"]/option[8]";
	final private String DOB_MONTH_XPATH = "//*[@id=\"months\"]/option[7]";
	final private String DOB_YEAR_XPATH = "//*[@id=\"years\"]/option[32]";
	final private String NEWSLETTER = "newsletter";
	final private String OPT_IN = "optin";
	final private String FNAME = "firstname";
	final private String LNAME = "lastname";

	/**
	 * Constructor, Sets WebDriver
	 * @param d WebDriver
	 */
	public SignUpPage(WebDriver d) {
		super();
		setDriver(d);
	}	
	/**
	 * @return the cUST_FNAME
	 */
	public String getCUST_FNAME() {
		return CUST_FNAME;
	}
	/**
	 * @return the cUST_LNAME
	 */
	public String getCUST_LNAME() {
		return CUST_LNAME;
	}
	/**
	 * @return the eMAIL
	 */
	public String getEMAIL() {
		return EMAIL;
	}
	/**
	 * @return the pASS
	 */
	public String getPASS() {
		return PASS;
	}
	/**
	 * @return the dOB_DAY_XPATH
	 */
	public String getDOB_DAY_XPATH() {
		return DOB_DAY_XPATH;
	}
	/**
	 * @return the dOB_MONTH_XPATH
	 */
	public String getDOB_MONTH_XPATH() {
		return DOB_MONTH_XPATH;
	}
	/**
	 * @return the dOB_YEAR_XPATH
	 */
	public String getDOB_YEAR_XPATH() {
		return DOB_YEAR_XPATH;
	}
	/**
	 * @return the nEWSLETTER
	 */
	public String getNEWSLETTER() {
		return NEWSLETTER;
	}
	/**
	 * @return the oPT_IN
	 */
	public String getOPT_IN() {
		return OPT_IN;
	}
	/**
	 * @return the fNAME
	 */
	public String getFNAME() {
		return FNAME;
	}
	/**
	 * @return the lNAME
	 */
	public String getLNAME() {
		return LNAME;
	}

	public void send_custfname(String fname) {
		//TODO Add Method
		
	}
	
	public void send_custlname(String lname) {
		//TODO Add Method
	}
	
	
	
}
