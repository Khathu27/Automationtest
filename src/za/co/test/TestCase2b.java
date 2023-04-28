package za.co.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase2b {

	public static void main(String[] args) throws InterruptedException {
		// // declaration and instantiation of objects/variables  
	    //System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"); 
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/?searchCriteria=[search1,search2,search3]");
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}
}
