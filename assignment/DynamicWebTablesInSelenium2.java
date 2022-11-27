package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTablesInSelenium2 {
	@Test
	public void DynamicTable() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowSize=rows.size();
		System.out.println("The no of rows are: "+rowSize);
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/td"));
		int columnSize=column.size();
		System.out.println("The no of columns are: "+columnSize);
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=columnSize;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
