package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorsInSelenium {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		List<WebElement> genderSelection=driver.findElements(By.xpath("//*[@class='inputtext _58mg _5dba _2ph-']"));
		
		
		
		for(int i =0; i<genderSelection.size();i++){
			
			String gender=genderSelection.get(i).getAttribute("name");
			
			switch(gender)
			{
			case "firstname":
				genderSelection.get(i).sendKeys("Naresh");
				break;
			case "lastname":
				genderSelection.get(i).sendKeys("Madipelly");
				break;
			
			}
			
			/*if(gender.equalsIgnoreCase("lastname")){
				genderSelection.get(i).sendKeys("Madipelly");
			}
			else if(gender.equalsIgnoreCase("firstname")){
				genderSelection.get(i).sendKeys("Naresh");
			}*/
			
			
			System.out.println("Name is : "+gender);
		}
		
		
		
		/*
		
		WebElement FemaleSelection=driver.findElement(By.id("u_0_b"));
		boolean genderStatus=FemaleSelection.isSelected();
		String genderType=FemaleSelection.getText();
		
		if(genderStatus==true){
			//click on create account
		}else if(genderType.equalsIgnoreCase("MALE")){
		
			//
			FemaleSelection.click();
			
			///create account
		}else{
			
		}
*/

	}

}
