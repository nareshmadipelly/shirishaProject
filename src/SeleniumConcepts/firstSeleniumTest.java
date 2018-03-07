package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();

			driver.get("http://www.facebook.com");
			
			String facebookTitle=driver.getTitle();
			
			System.out.println(facebookTitle);
			
			Thread.sleep(5000);
			
			driver.findElement(By.name("firstname")).sendKeys("testusername");
			
			driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("testsurname");
			
			driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
			
			WebElement submitButton=driver.findElement(By.name("websubmit"));
			  
			submitButton.click();
		
	        // Alternatively the same thing can be done like this
	        // driver.navigate().to("http://www.google.com");

	        // Find the text input element by its name
	       /* WebElement element = driver.findElement(By.name("q"));

	        // Enter something to search for
	        element.sendKeys("Cheese!");

	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();*/

	}

}
