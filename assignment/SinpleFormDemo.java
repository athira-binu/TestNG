package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SinpleFormDemo {
	@Test
	public void VerifyMessage() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement Message = driver.findElement(By.id("single-input-field"));
		Assert.assertTrue(Message.isDisplayed(), "Message is not displayed");
		Message.click();
		String name = "Athira";
		Message.sendKeys(name);
		
		WebElement ShowMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		Assert.assertTrue(ShowMessage.isDisplayed(), "Show Message is not displayed");
		ShowMessage.click();
		
		WebElement strMessage = driver.findElement(By.id("message-one"));
		String s = strMessage.getText();
		//System.out.println(s);
		//String str[] = s.split(" ");
		String message = s.replace("Your Message : ", "");
		//String message = str[3];
		Assert.assertTrue(message.equals(name));
		
		/*for(int i=3; i<str.length; i++) {
			//String sname = str[i];
			if(str[i].equals(name)) {
				
				System.out.println("yes");
				Assert.assertTrue(message.equals(name));
			}
			
		}*/
		
		WebElement ValueA = driver.findElement(By.id("value-a"));
		ValueA.click();
		ValueA.sendKeys("20");
		WebElement ValueB = driver.findElement(By.id("value-b"));
		ValueB.click();
		ValueB.sendKeys("30");
		String expectedResult = "50";
		driver.findElement(By.id("button-two")).click();
		WebElement result = driver.findElement(By.id("message-two"));
		String r = result.getText();
		String a[] = r.split(" ");
		String sum = a[5];
		Assert.assertTrue(sum.equals(expectedResult));
		
	}

}
