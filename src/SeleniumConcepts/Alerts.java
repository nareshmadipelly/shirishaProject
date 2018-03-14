package SeleniumConcepts;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public void handleAlerts() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver(); 
	
		driver.get("https://www.ksrtc.in/oprs-web/");
		takeScreenShot(driver,"homePage");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Thread.sleep(2000);
		takeScreenShot(driver,"alertScreenShot");
		
		Alert alert=driver.switchTo().alert();
		
		String actualAlertText=alert.getText();
		
		String expectedAlertText ="Please select start place.";
		
		System.out.println("Alert text is :"+actualAlertText);
		
		assertEquals(actualAlertText, expectedAlertText);
		
		alert.accept();
		
		driver.quit();
	}
	
	
	public void takeScreenShot(WebDriver driverobject,String fileName) throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot)driverobject;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\WINDOWS 8\\Desktop\\ScreenShot\\"+fileName+".png"));
	}
	
	
}
