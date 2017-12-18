package eComerceTests.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import eComerceTests.PageObjects.MainPage;

public class MainPageTests {

	MainPage mainPage = new MainPage();
	final private String MAIN_SITE_URL = "http://automationpractice.com/index.php";
	
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.karayev\\Documents\\chromedriver.exe");
	}
	
	@Test
	public void test() {
		WebDriver d = new ChromeDriver();
		mainPage.setDriver(d);
		
		d.get(MAIN_SITE_URL);
		mainPage.clickSignIn();
		d.close();
	}
}
