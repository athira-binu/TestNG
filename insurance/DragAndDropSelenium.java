package insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropSelenium {
	@Test
	public void DragAndDrop()  {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement dragBank = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement dropBank = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		act.dragAndDrop(dragBank, dropBank).perform();
		
	}

}
