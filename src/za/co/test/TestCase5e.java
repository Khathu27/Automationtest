package za.co.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TestCase5e {
	
	
	public static void main(String[] args) throws InterruptedException {

		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/"); 
		 
		 String[] additems = {"Pen","Paper"};
		 
		 List<WebElement> list = 
		          driver.findElements(By.cssSelector("h4.product-name")); 
		 
		 for(int i=0;i<list.size();i++) {
			//added this line again
	         list = driver.findElements(By.cssSelector("h4.product-name"));
	      
//list item productname["ProductName", "Quantity", "UnitPrice" "TotalPrice"]
	              String[] productname = list.get(i).getText().split("-");
	              Integer qty = Integer.valueOf(productname[1]);
	              BigDecimal price  = new BigDecimal(productname[1]);
	              
	              BigDecimal expectedTotalPrice = TestCase5d.calculateTotal(price, qty);
	              
	              if(expectedTotalPrice.compareTo(new BigDecimal(productname[2])) == 0) {
	            	  System.out.println("Test passed");
	              }else {
	            	  System.out.println("Test failed");
	              }
	            
	             // productname[1] = desiredQty.toString();
	              
	              System.out.println("Product Name: " + productname);	     
		 }	     
	
		 
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}
	
}
