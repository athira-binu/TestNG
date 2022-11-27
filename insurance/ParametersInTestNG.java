package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersInTestNG {
		@Parameters({"Username","Password"})
		@Test
		
		public void UsingDataProviderForLogin(String Uname, String pword) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(Uname);
		System.out.println(pword);
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Uname);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.id("login-button")).click();
		}

}
