package SeleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWidow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		//Maximize Screen
		driver.manage().window().maximize();
		
		//Go to web page link
		driver.get("https://www.leafground.com/window.xhtml");
		
		//Store Window
		String MainWindow = driver.getWindowHandle();
		
		//Sleep time
		Thread.sleep(5000);
	
				
		
		/////Click and Confirm new Window Opens
		
		WebElement OpenBtn = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Open']"));
		OpenBtn.click();
		//Find a web page title
		//String PageTitle = driver.getTitle();
		//System.out.println(PageTitle);
		
		//Sleep time
		//Thread.sleep(5000);
		
		/////Find the number of opened tabs
		WebElement Multiple_Btn = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span"));
		Multiple_Btn.click();
		
		//Sleep time
		Thread.sleep(5000);
		
		//Get a Opened Window Count
		Set<String> NewWindows = driver.getWindowHandles();	
		int WindowCount = NewWindows.size();
		System.out.println("Windows Count is: " +WindowCount);
		
		for (String window : NewWindows) {
			if(!window.equals(MainWindow)) {
				driver.switchTo().window(window).close();
			}
		}
		
		//Switch to MainWindow
		driver.switchTo().window(MainWindow);
		
		/////Wait for 2 new tabs to open
		WebElement Delay_Btn =  driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/button/span"));
		Delay_Btn.click();
		
		
		//Sleep time
		Thread.sleep(5000);
		
		
		//Quite browser 
		driver.quit();

	}

}
