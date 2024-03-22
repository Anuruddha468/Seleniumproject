package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		//Maximize Screen
		driver.manage().window().maximize();
		
		//Go to web page link
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement OpenBtn = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Open']"));
		
		
			// after the redirected new web page get a web page URL
		   String currentUrl = driver.getCurrentUrl();
		   
		   OpenBtn.click();
		   
		   //this part, check if previous URL and after the redirect RRL check 
	        if (!currentUrl.equals("https://www.leafground.com/dashboard.xhtml")) {
	            System.out.println("New webpage is redirected after button click.");
	        } else {
	            System.out.println("No new webpage redirect after button click.");
	        }
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
