package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonTestCases {
	
	@Test
	public void logFunctionality(){
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WINDOWS 8\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
	
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=S1FA28SEWV46SR22Q4EW&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=eyJjaXBoZXIiOiJZa0hWMGl3S1NLc0VJNk02TWNDRkRMR0dGR1hkQ21YckpJS1Y5dGpCZUVRPSIsIklWIjoibk9oR2p6UEJKK2ZDdDg2bWVqdCtyUT09IiwidmVyc2lvbiI6MX0%3D&failedSignInCount=1&custId=AQXPDJ592FEF1&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
		AmazonLogin loginToAmazon = new AmazonLogin(driver);
		
		loginToAmazon.singingIn();
		
	}

}
