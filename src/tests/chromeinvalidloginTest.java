package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeinvalidloginTest {
	
	private String LOGINID = "****"; //Enter inValid Login
	private String PASS = "****"; //Enter inValid Pass
	
	@Test
	public void testInvalid() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.karayev\\Documents\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("identifierId")).sendKeys(LOGINID);
		driver.findElement(By.id("identifierNext")).click();

		driver.close();
	}

}