package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationresquest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.automationanywhere.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath(""))
			
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button']")).click();
			
			String currentUrl=driver.getCurrentUrl();
			
			System.out.println("CurrentUrl -"+currentUrl);
			
			Thread.sleep(2000);
			
			WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
			
			Thread.sleep(2000);
			
			FirstName.sendKeys("Rajesh");
			
			WebElement LastName=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
			
			Thread.sleep(2000);
			
			LastName.sendKeys("Bukkala");
			



	}

}
