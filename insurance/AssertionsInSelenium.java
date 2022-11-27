package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInSelenium {
	@Test
	public void VerifySwagLabsLoginForValidUser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement Logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		//Assertions(Hard assert and soft assert)
		//Diff b/w Hard assert and soft assert
		
		//Hard assert
		
		//Assert.assertEquals(true, true);
		//Assert.assertEquals(false, true);
		//Assert.assertTrue(Logo.isDisplayed());
		Assert.assertEquals(true, Logo.isDisplayed());
		 
		WebElement Username = driver.findElement(By.id("user-name"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		 
		Assert.assertTrue(Username.isDisplayed(), "Username Textfield is not displayed");
		Username.click();
		Username.sendKeys("standard_user");
		 
		Assert.assertTrue(Password.isDisplayed(), "Password Textfield is not displayed");
		Password.click();
		Password.sendKeys("secret_sauce");
		 
		Assert.assertTrue(LoginButton.isDisplayed(), "Login button is not displayed");
		LoginButton.click();
		
		//soft assert
		
		SoftAssert Sassert = new SoftAssert();
		Sassert.assertEquals(false, true, "Failed in SoftAssert step but will execute following lines");
		System.out.println("I am getting executed after soft assert");
		System.out.println("I am getting executed after soft assert");
		System.out.println("I am getting executed after soft assert");
		System.out.println("I am getting executed after soft assert");
		Sassert.assertAll();
		 
		 		 
	}

}
