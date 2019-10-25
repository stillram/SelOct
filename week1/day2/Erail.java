package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		// Add ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter Source and Destination
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("NMKL",Keys.TAB);
		// Uncheck the date
		driver.findElement(By.id("chkSelectDateOnly")).click();	
		// Find the train first (there is no other locator - hence xpath)
		WebElement train = driver.findElementByXPath
				("//table[contains(@class,'DataTable TrainList')]");
		// Find the number of rows in train
		List<WebElement> allRows = train.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




