package insurance;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeInsurance {
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After class");
	}
	@BeforeSuite
	public void BeforeTestSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void AfterTestSuite() {
		System.out.println("After Suite");
		
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("I am going to test before test case");
	}
	
	@Test(groups={"SMK"})
	public void MobileLogin() {
		System.out.println("Home insurance Mobile login");
		Assert.assertEquals(false, true);
	}
	@Test
	public void MobileLogout() {
		System.out.println("Home insurance Mobile logout");
	}
	@Test(groups= {"SMK"})
	public void WebLogin() {
		System.out.println("Home insurance Web login");
	}
	@Test
	public void WebLogout() {
		System.out.println("Home insurance Web logout");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("------------I am going to run before each Test method");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("***********I am going to run after each Test method");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("I am going to test after test case");
	}

}
