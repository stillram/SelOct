package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		// Select the languages that you know?
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		System.out.println(selected);
		WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




