package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class diffwebelements {


	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement dayDropDown=driver.findElement(By.xpath("//*[@name='birthday_day']"));
		
		
		
		
		
		/*WebElement genderSelection=driver.findElement(By.xpath("//*[@id='u_0_b']"));
		
		boolean genderSelectionStatus=genderSelection.isSelected();
		
		if(genderSelectionStatus==true){
			System.out.println("female radio button is selected");
		}else{
			genderSelection.click();
		}
		
		
		
		WebElement genderSelectionMale=driver.findElement(By.xpath("//*[@id='u_0_c']"));
		
		boolean genderSelectionStatusMale=genderSelectionMale.isSelected();
		
		if(genderSelectionStatusMale==true){
			System.out.println("male radio button is selected");
		}else{
			genderSelectionMale.click();
		}*/
		
		
		
		
	}


}
