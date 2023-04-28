package za.co.test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {

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
	      

	              String[] productname = list.get(i).getText().split("-");
	              String frmtdname = productname[0].trim();
	              List<String> itemsneeded = Arrays.asList(additems);

	            if(itemsneeded.contains(frmtdname))
	           {  //change the xpath of add to cart, take the class name

	              List<WebElement> list2=driver.findElements(By.xpath("//div[@class='actions']/button"));
	               list2.get(i).click();
	               System.out.println("One product added");

	            }
		 }	     
	
		 
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}
}
