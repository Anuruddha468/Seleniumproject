package SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		  // Set the path to your ChromeDriver executable
    	System.setProperty("Webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

        // Create a new Chrome driver instance
        WebDriver driver = new ChromeDriver();
        
      //Maximize Screen
      	driver.manage().window().maximize();

        // Navigate to a webpage with an Alert (Simple Dialog)
        driver.get("https://www.leafground.com/alert.xhtml");

        // Locate the button that triggers the Alert
        WebElement Show_1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c' and text()='Show'])[1]"));
        Show_1.click();
        
       
        try {
            // Switch to the Alert
            Alert alert = driver.switchTo().alert();

            // Print the alert text
            System.out.println("Alert Tex 01: " + alert.getText());
            Thread.sleep(5000); 
            // Accept the Alert (click OK or similar)
            alert.accept();
        	} catch (Exception e) {
            System.out.println("Error handling Alert: " + e.getMessage());
        }
        
        Thread.sleep(5000);
        
        WebElement Show_2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c' and text()='Show'])[2]"));
        Show_2.click();
        
        try {
            // Switch to the Alert
            Alert alert = driver.switchTo().alert();

            // Print the alert text
            System.out.println("Alert Tex 02: " + alert.getText());
            Thread.sleep(5000); 
            // Accept the Alert (click OK or similar)
            alert.accept();
        	} catch (Exception e) {
            System.out.println("Error handling Alert: " + e.getMessage());
        }
        
        Thread.sleep(5000); 
        
        driver.quit();
	}

}
