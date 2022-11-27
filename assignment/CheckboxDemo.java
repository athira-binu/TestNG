package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {
	@Test
	public void VerifyCheckboxDemo() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.className("form-check-label")).click();
		WebElement check = driver.findElement(By.id("message-one"));
		String verifyCheck = check.getText();
		Assert.assertTrue(verifyCheck.equals("Success - Check box is checked"));
		
		/*driver.findElement(By.id("check-box-one")).click();
		driver.findElement(By.id("check-box-two")).click();
		driver.findElement(By.id("check-box-three")).click();
		driver.findElement(By.id("check-box-four")).click();*/
		WebElement selectBox = driver.findElement(By.id("button-two"));
		selectBox.click();
		String value = selectBox.getAttribute("value");
		//System.out.println(value);
		Assert.assertTrue(value.equals("Unselect All"));
		selectBox.click();
		String newValue = selectBox.getAttribute("value");
		Assert.assertTrue(newValue.equals("Select All"));
		
		
		
		
		
	}

}
