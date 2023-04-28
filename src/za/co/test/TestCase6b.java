package za.co.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestCase6b {

	public static void main(String[] args) throws InterruptedException {
		// // declaration and instantiation of objects/variables  
	    //System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"); 
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 String url = "http://automationpractice.com/";
		 driver.get(url);
		    Actions actions = new Actions(driver); 
		    WebElement menuHoverLink = driver.findElement(By.linkText("About")); 
		    //WebElement menuHoverLink = driver.findElement(By.className("current")); 
		    actions.moveToElement(menuHoverLink).perform(); 
		    driver.findElement(By.cssSelector("a[href='" +url+ "/About/contact-us']")).click();
			
		  

		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}
}
