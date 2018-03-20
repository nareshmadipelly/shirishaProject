package SeleniumConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngAnnotations {
	
	@BeforeClass()
	public void beforeclass(){
		System.out.println("beforeClass");
	}
	
	@BeforeMethod()
	public void beforemethod(){
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test1(){
		System.out.println("Test1");
	}
	@Test
	public void test2(){
		System.out.println("Test2");
	}
	
	@AfterMethod()
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
	
	@AfterClass()
	public void afterclass(){
		System.out.println("afterclass");
	}

}
