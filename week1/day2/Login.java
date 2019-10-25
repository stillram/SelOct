package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username")
		.sendKeys("demosalesmanager", Keys.TAB);
		driver.findElementById("password")
		.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		/*String title = driver.getTitle();
		System.out.println(title);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
//		driver.close();
		
		

	}

}




