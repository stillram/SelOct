package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Actions - AUI
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.linkText("Mi")));
		driver.findElementByLinkText("Mi").click();
		
		
	
		
		
		
		
		
		
		
		
		
	
	
	}

}



