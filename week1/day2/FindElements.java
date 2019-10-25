package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		List<WebElement> allCheckBox = 
				driver.findElementsByTagName("input");
		int size = allCheckBox.size();
		System.out.println(size);
		allCheckBox.get(size-1).click();
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




