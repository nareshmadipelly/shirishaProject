package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionsDemo {
	@Test
	public void flipkartDemo() throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
	
		driver.get("https://www.flipkart.com/");
		
		WebElement electronics=driver.findElement(By.xpath("//a[@title='Electronics']"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Apple']")).click();
		
		//driver.quit();
	}

}
