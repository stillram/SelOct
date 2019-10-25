package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		// Are you enjoying the classes?
		driver.findElement(By.id("no")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




