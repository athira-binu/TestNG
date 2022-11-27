package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsDemo {
	@Test
	public void VerifyRadioButton() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.id("button-one")).click();
		WebElement m = driver.findElement(By.id("message-one"));
		String expectedMessage = m.getText();
		//System.out.println(expectedMessage);
		Assert.assertTrue(expectedMessage.equals("Radio button 'Male' is checked"));
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.id("button-one")).click();
		WebElement f = driver.findElement(By.id("message-one"));
		String newMessage = f.getText();
		Assert.assertTrue(newMessage.equals("Radio button 'Female' is checked"));		
		driver.findElement(By.id("inlineRadio11")).click();
		driver.findElement(By.id("inlineRadio22")).click();
		driver.findElement(By.id("button-two")).click();
		WebElement p1 = driver.findElement(By.id("message-two"));
		String expectedP1 = p1.getText();
		System.out.println(expectedP1);
		//Assert.assertTrue(expectedP1.equals("Gender : Male Age group: 1 to 18"));
		/*String a[] = expectedP1.split(" ");
		String a1 = a[2];
		System.out.println(a1);
		String a2[] = a1.split("Age");
		String a3 = a2[0];
		System.out.println(a3);*/
		
		
		
		
	}

}
