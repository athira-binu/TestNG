package insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium {
	@Test
	public void Alert() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.findElement(By.id("runbtn")).click();
		
		//iframe in selenium
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		//try it button
		driver.findElement(By.tagName("button")).click();
		
		//accepting the alert box
		driver.switchTo().alert().accept();
		
		//IFRAME (switching outside the IFRAME)
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title ='Change Theme'])[1]")).click();
		
		//going inside IFRAME again
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		//try it button
		driver.findElement(By.xpath("//button[@onclick ='myFunction()']")).click();
		
		//accepting the alert box
		driver.switchTo().alert().accept();
		
		
	}

}
