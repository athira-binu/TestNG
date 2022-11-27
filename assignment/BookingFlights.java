package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingFlights {
	@Test
	public void checkFlights() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AsvtzJsGwAIB0gIkYjI2NzI2YjYtN2Y0MS00OThhLWI0NDYtNmY1ODczZDM5NTMy2AIF4AIB&sid=85a1d08a5a19dcbbfead10b12d7ce334&keep_landing=1&sb_price_type=total&");
		driver.manage().window().maximize();
		WebElement flight = driver.findElement(By.xpath("//a[@class='bui-tab__link']"));
		String expectedA = "Flights";
		Assert.assertTrue(flight.isDisplayed(), "Flights is not displayed");
		//Assert.assertEquals(expectedA, flight.getText());
		flight.click();
		
		driver.findElement(By.xpath("(//span[@class='InputRadio-module__content___n2tbZ'])[2]")).click();
		
		
		WebElement flightClass = driver.findElement(By.className("css-1k0jlfl"));
		Select sle = new Select(flightClass);
		sle.selectByValue("BUSINESS");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-testid='input_occupancy_desktop_passengers_trigger']")).click();
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();
		WebElement age = driver.findElement(By.className("InputSelect-module__field___wEAQl"));
		Select ageSle = new Select(age);	
		ageSle.selectByIndex(5);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='css-ya5gr9'])")).click();
		//Thread.sleep(5000);
		
		WebElement destination = driver.findElement(By.className("css-h71vi3-SearchboxInput"));
		//String a = destination.getText();
		//System.out.println(a);
		Assert.assertTrue(destination.isDisplayed());
		destination.click();
		driver.findElement(By.className("css-1tl2oa1")).sendKeys("chennai");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='css-1hhenib'])")).click();
		//Thread.sleep(5000);
		
		//WebElement Dropdown = driver.findElement(By.xpath("(//span[@class='css-1hhenib'])[1]"));
		//System.out.println(Dropdown);
		/*for(WebElement opt:Dropdown) {
			System.out.println(opt.getText());
		}*/
		
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
		driver.findElement(By.xpath("//span[@data-date-cell='2022-12-19']")).click();
		driver.findElement(By.xpath("//button[@data-testid='searchbox_submit']")).click();
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[@aria-controls='BEST']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@aria-controls ='FASTEST']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@aria-controls='CHEAPEST']")).click();
		//Thread.sleep(5000);
		
		List<WebElement> CheapestFlights = driver.findElements(By.id("flight-card"));
		//Thread.sleep(5000);
		int count = CheapestFlights.size();
		System.out.println("The number of flights displayed in the first page is " +count);
		//Thread.sleep(5000);
		
		WebElement PriceofCheapestflight = driver.findElement(By.xpath("(//div[@data-test-id = 'flight_card_price_main_price'])[1]"));
		//Thread.sleep(5000);
		String lowest = PriceofCheapestflight.getText();
		System.out.println("The price of the Cheapest Flight is = " + lowest);
		//Thread.sleep(5000);
		
		
		
	}

}
