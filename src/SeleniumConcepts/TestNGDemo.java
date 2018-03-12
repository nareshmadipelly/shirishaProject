package SeleniumConcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	
	@Test
	public void launchApp(){
		System.out.println("this is test1");
	}
	
	@Test
	public void terminateAPplication(){
		System.out.println("this is test2");
	}
	
	@BeforeTest
	public void openBrowser(){
		System.out.println("this is before test");
	}
	
	@AfterTest
	public void quit(){
		System.out.println("this is after test");
	}

}
