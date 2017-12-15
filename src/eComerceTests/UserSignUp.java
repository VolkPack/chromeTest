package eComerceTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.fail;

import java.util.Random;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSignUp {
	private String MAIN_SITE_URL = "http://automationpractice.com/index.php";	
	private String VALID_EMAIL = "autotester123@gmail.com";
	private String VALID_FNAME = "Tony";
	private String VALID_LNAME = "Stark";
	private String VALID_PASS = "AvengersAssemble777";
	private Log log;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.karayev\\Documents\\chromedriver.exe");
	}
	
	@Test
	public void validSignUpMainPageFull() throws InterruptedException, Throwable {
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d,15);
		String genderid = randomizeGender(); //Randomly Generates gender Id 
			
		try {
			d.get(MAIN_SITE_URL); //navigate to Main Page
			d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click(); //Click Sign In Button
			//TODO Intentional Error For Debugging -->> "email_create"
			d.findElement(By.id("email_creat")).sendKeys(VALID_EMAIL); //Input valid email
			d.findElement(By.id("SubmitCreate")).click(); //Click "Create account"
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(genderid))); //Waits till Page loads
			d.findElement(By.id(genderid)).click(); //Tick Marks Radio Button for Randomly Selected Gender
			d.findElement(By.id("customer_firstname")).sendKeys(VALID_FNAME);
			d.findElement(By.id("customer_lastname")).sendKeys(VALID_LNAME);
			
			if(d.findElement(By.id("email")).getAttribute("value") == null) {
				d.findElement(By.id("email")).sendKeys(VALID_EMAIL);
			}
			d.findElement(By.id("passwd")).sendKeys(VALID_PASS);
			d.findElement(By.xpath("//*[@id=\"days\"]/option[8]")).click();
			d.findElement(By.xpath("//*[@id=\"months\"]/option[7]")).click();
			d.findElement(By.xpath("//*[@id=\"years\"]/option[32]")).click();
			d.findElement(By.id("newsletter")).click();
			d.findElement(By.id("optin")).click();
			
			if(d.findElement(By.id("firstname")).getAttribute("value") == null) {
				d.findElement(By.id("firstname")).sendKeys(VALID_FNAME);
			}
			
			if(d.findElement(By.id("lastname")).getAttribute("value") == null) {
				d.findElement(By.id("lastname")).sendKeys(VALID_LNAME);
			}
		}catch(Exception e){
			d.close();
			e.printStackTrace(System.out);	
			fail("Error Exception Thrown");
			
		}	
		
		
		d.close(); //TODO Uncomment after Testing
	}
	
	@Test
	public void testTest() throws InterruptedException {
		WebDriver d1 = new ChromeDriver();
		d1.get(MAIN_SITE_URL);
		d1.close();
	}
	
	private String randomizeGender() {
		Random rand = new Random();
		int  n = rand.nextInt(2) + 1;
		String genderId = "id_gender" + Integer.toString(n);
		
		return genderId;
		
	}

}
