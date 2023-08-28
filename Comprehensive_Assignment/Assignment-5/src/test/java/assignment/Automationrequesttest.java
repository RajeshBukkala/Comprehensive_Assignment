package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationrequesttest {
	
	WebDriver driver =new ChromeDriver();
	@BeforeTest
	
	public void TestScenario1() throws InterruptedException {
		
		driver.get("https://www.automationanywhere.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(""))
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
		
		Thread.sleep(2000);
		
	}
	@Test
	public void TestScenario2() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button']")).click();
		
		String expectedUrl= "https://www.automationanywhere.com/lp/gartner-magic-quadrant";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Verifyed with Expected Result");
		

		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void TestScenario3() throws InterruptedException {
		
		
		WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		
		Thread.sleep(2000);
		
		FirstName.sendKeys("Rajesh");
		
		WebElement LastName=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		
		Thread.sleep(2000);
		
		LastName.sendKeys("Bukkala");
		
		driver.quit();
		

	}

}
