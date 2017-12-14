package tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeloginTest {
	
	private String LOGINID = "***"; //Enter Valid Login
	private String PASS = "***"; //Enter Valid Pass
	
	
	@BeforeClass
	public static void preSet() {
	}
	
	@Test
	public void testValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.karayev\\Documents\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("identifierId")).sendKeys(LOGINID);
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(PASS);
		driver.findElement(By.id("passwordNext")).click();
		driver.close();
	}
	

}