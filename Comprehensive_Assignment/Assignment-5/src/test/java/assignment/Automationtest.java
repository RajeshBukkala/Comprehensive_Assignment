package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationtest {
	
	WebDriver driver =new ChromeDriver();
	
	@BeforeTest
	
	public void TestScenario1() throws InterruptedException {
		
		driver.get("https://www.automationanywhere.com/");
		
		driver.manage().window().maximize();
	}
		
		@Test
		
		
		public void TestScenario2() throws InterruptedException { 
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
		
		WebElement any =driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(any).perform();
		
		Thread.sleep(2000);
		
		}
		@Test
		
		public void TestScenario3() {
			
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[1]/div/div/div/div/div[3]/ul/li[1]/ul/li/a")).click();
		
		String expectedUrl= "https://www.automationanywhere.com/products/process-discovery";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Verifyed with Expected Result");
		driver.quit();

	}

}
