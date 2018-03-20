package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLogin {
	
	WebDriver driver;
	
	public AmazonLogin(WebDriver driver){
		this.driver=driver;
	}
	
	
	By email= By.id("ap_email");
	By signin=By.id("continue");
	By Password=By.id("ap_password");

	
	public void singingIn(){
		
		driver.findElement(email).sendKeys("testemail@gmail.com");
		driver.findElement(signin).click();
		driver.findElement(Password).sendKeys("testpassword");
	}
}
