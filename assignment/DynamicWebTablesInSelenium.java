package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTablesInSelenium {
	@Test
	public void DynamicTable() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://money.rediff.com/indices");
		driver.manage().window().maximize();
		driver.findElement(By.id("showMoreLess")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr"));
		int rowSize=rows.size();
		System.out.println("The no of rows are: "+rowSize);
		List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td"));
		int columnSize=column.size();
		System.out.println("The no of columns are: "+columnSize);
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=columnSize;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		WebElement table= driver.findElement(By.tagName("table"));
		//to find the second row of the table
		WebElement tablerow=table.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[2]"));
		String rowvalue=tablerow.getText();
		System.out.println("Second row is "+rowvalue);
		
		//to print column
		WebElement tablecol=tablerow.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[3]/td[2]"));
		String colvalue=tablecol.getText();
		System.out.println("Column value is "+colvalue);
	}

}
