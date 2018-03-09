package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsInSelenium {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");

		
		WebElement dayDropDown=driver.findElement(By.id("day"));
		
		Select day = new Select(dayDropDown);
		day.selectByValue("20");
		
		
		WebElement monthDropDown=driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select month = new Select(monthDropDown);
		month.selectByVisibleText("Nov");
		
		WebElement yearDropDown=driver.findElement(By.xpath("//*[@name='birthday_year']"));
		Select year = new Select(yearDropDown);
		year.selectByIndex(4);
		
		System.out.println("Selecting 20-Nov-2015");
		
		
		
		

	}

}
