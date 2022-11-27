package insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VariousClicksInSelenium {
	
	@Test
	public void CliscksSele() 
	{
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to(("https://demo.guru99.com/test/simple_context_menu.html"));
	driver.manage().window().maximize();
	// Right click
	WebElement RightClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
	Actions act = new Actions(driver);
	act.contextClick(RightClick).build().perform();
	
	// double click
	WebElement DoubleClick = driver.findElement(By.tagName("button"));
	act.doubleClick(DoubleClick).build().perform();
	
	// accepting the alert box
	driver.switchTo().alert().accept();




	}

	}
