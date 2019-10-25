package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		// Enter your email address
		driver.findElement(By.id("email")).sendKeys("values to send");
		// Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("values to send");
		// Get default text entered
		String testLeaf = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println(testLeaf);
		// Clear the text
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		// Confirm that edit field is disabled
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




