package assignment;


	import java.util.List;

//package TestNG;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Sample {
	
		@Test
		public void VerifyFlights() throws InterruptedException {
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.get("https://www.booking.com/");
			driver.manage().window().maximize();
			WebElement flight = driver.findElement(By.xpath("//a[@class ='bui-tab__link']"));
			String Flightext = "Flights";
			Assert.assertTrue(flight.isDisplayed(), "Flights is not displayed");
			System.out.println(Flightext);
			flight.click();
			Thread.sleep(5000);
			// One way or Round trip
			driver.findElement(By.xpath("(//span[@class='InputRadio-module_field__4Jbyo'])[2]")).click();
			// for selecting which type
			Select dropdown = new Select(driver.findElement(By.className("css-1k0jlfl")));
			dropdown.selectByVisibleText("Business");
			//for clicking Destination text box 
			driver.findElement(By.xpath("//input[@placeholder ='Where to?']")).click();
			Thread.sleep(3000);
			// Destination Airport
			driver.findElement(By.className("css-1tl2oa1")).sendKeys("MAA Chennai International Airport");
			Thread.sleep(3000);
			// Selecting the destination airport
			driver.findElement(By.xpath("//div[@class ='css-1lc7njo']")).click();
			Thread.sleep(3000);
			// changing the number of adults and children
			driver.findElement(By.xpath("//div[@data-testid ='input_occupancy_desktop_passengers_trigger']")).click();
			// increasing adults
			driver.findElement(By.xpath("//button[@data-testid = 'input_occupancy_modal_adults_increase']")).click();
			// increasing children
			driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();
			Select childage = new Select(driver.findElement(By.className("InputSelect-module_field__wEAQl")));
			childage.selectByVisibleText("15");
			driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
			Thread.sleep(3000);
			// Date picking
			driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
			driver.findElement(By.xpath("//span[@data-date-cell ='2022-12-30']")).click();
			// Search
			driver.findElement(By.xpath("//button[@data-testid='searchbox_submit']")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//span[@class ='InputCheckbox-module_field__R4nYQ'])[3]")).click();
			//driver.findElement(By.xpath("//input[@id='__bui-44']']")).click();
			//driver.findElement(By.xpath("//div[@class='css-icaorl']")).click();
			
			
			//Best Tab
			driver.findElement(By.xpath("//button[@aria-controls ='BEST']")).click();
			Thread.sleep(5000);
			//Fastest Tab
			driver.findElement(By.xpath("//button[@aria-controls ='FASTEST']")).click();
			Thread.sleep(5000);
			
			//Cheapest Tab
			driver.findElement(By.xpath("//button[@aria-controls ='CHEAPEST']")).click();
			Thread.sleep(5000);
			//number of Flights in that single page
			List<WebElement> CheapestFlights = driver.findElements(By.id("flight-card"));
			Thread.sleep(5000);
			int count = CheapestFlights.size();
			System.out.println("The number of flights displayed in the first page is " +count);
			Thread.sleep(5000);
			//Cheapest Flight
			WebElement PriceofCheapestflight = driver.findElement(By.xpath("(//div[@data-test-id = 'flight_card_price_main_price'])[1]"));
			Thread.sleep(5000);
			String lowest = PriceofCheapestflight.getText();
			System.out.println("The price of the Cheapest Flight is = " + lowest);
			Thread.sleep(5000);
			
		}
	}		
	
		

