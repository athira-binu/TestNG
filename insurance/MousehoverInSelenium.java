package insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousehoverInSelenium {
	@Test
	public void ActionClassMousehover() throws InterruptedException {
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Electronics']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
	act.moveToElement(ele1).perform();
	WebElement ele2 = driver.findElement(By.linkText("Soundbars"));
	//WebElement ele2 = driver.findElement(By.xpath("//a[text()='Soundbars']"));
	act.moveToElement(ele2).click().perform();
	Thread.sleep(3000);
	}

}
