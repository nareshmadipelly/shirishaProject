package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandleInSelenium {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");

		String parent_window=driver.getWindowHandle();
		
		System.out.println("Parent window ID is "+parent_window);
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		
		
		Set<String> listOfwindows= driver.getWindowHandles();
		 
		
		int numberOfwindows=listOfwindows.size();
		System.out.println("Number of opened windows are :"+numberOfwindows);
		
		
		for(String childWindow : listOfwindows){
			
			if(!parent_window.equals(childWindow)){
				
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("q")).sendKeys("search for window handle");
				driver.close();
			}
		}
		
		
		driver.switchTo().window(parent_window);
		String parent_window_title=driver.getTitle();
		System.out.println("parent window title is "+parent_window_title);
		driver.quit();
		
		
		
		
	}

}
