package insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterInSelenium {
	@Test
	public void JavaScriptExecuter()  {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("persistent"));
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("alert('hello this is an alert')");
		
		driver.switchTo().alert().accept();
		Js.executeScript("arguments[0].click();", ele);
		
		
	}

}
