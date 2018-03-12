package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frames {
	
	@Test
	public void  framesDemo() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("file:///C:/Users/WINDOWS%208/Desktop/sampleFrame.html");
		
		
		//int numberOfFrames=driver.findElements(By.tagName("iframe")).size();
		//System.out.println("total number of frames are .. "+numberOfFrames);
		
		
		driver.switchTo().frame(driver.findElement(By.id("selenium")));

		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='http://google.com']")).click();
		
		Thread.sleep(2000);
		
		
		driver.quit();
	
	}

}
