package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dressPurchaseFlowCompleteTest {
	
	private String MAIN_SITE_URL = "http://automationpractice.com/index.php";

  @Test
  public void selectDressAndAddOnClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.karayev\\Documents\\chromedriver.exe");
		double SINGLE_ITEM_PRICE = 50.99;
		double Total;
		int quantity;
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d,15);
		
		
		d.get(MAIN_SITE_URL);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		d.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")).click();
		d.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")));
		d.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		
		quantity = Integer.parseInt(d.findElement(By.xpath("//*[@id=\"product_4_16_0_0\"]/td[5]/input[2]")).getAttribute("value"));
		String temp = d.findElement(By.xpath("//*[@id=\"total_product\"]")).getText().substring(1);
		Total = Double.parseDouble(temp);
		assertTrue(verifyPrice(quantity, Total, SINGLE_ITEM_PRICE));
		
		d.close();		
  }
  
  private boolean verifyPrice(int quantity, double total, double expected) {
	  if((total/quantity) == expected) {
		  return true;
	  }
	  return false;
  }
}
