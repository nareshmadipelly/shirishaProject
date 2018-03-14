package SeleniumConcepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT {
	
	@Test
	public void handleWindowsPopups() throws InterruptedException, IOException{
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chrom\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.get(System.getProperty("user.dir")+"\\Files\\fileupload.html");
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Files\\fileuploadMarch.exe");
		
		//Runtime.getRuntime().exec("C:\\Users\\WINDOWS 8\\Desktop\\AutoIT\\ArjunFileDemo.exe");
		
	
		
	}

}
