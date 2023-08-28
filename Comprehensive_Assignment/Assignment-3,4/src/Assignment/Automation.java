package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.automationanywhere.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
		
		WebElement any =driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(any).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[1]/div/div/div/div/div[3]/ul/li[1]/ul/li/a")).click();
		
		String currentUrl=driver.getCurrentUrl();
		
		System.out.println("CurrentUrl -"+currentUrl);


	}

}
