package za.co.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase3 {

	public static void main(String[] args) throws Exception {
		// // declaration and instantiation of objects/variables  
	    //System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"); 
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 
		 String absolutePath = new File("").getAbsolutePath();
		 System.out.println(absolutePath);
		 
		 String filePath = absolutePath.trim().concat("\\resources\\testCase3.txt");
		 
		 System.out.println(filePath);		 
		 
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		String line = br.readLine(); 

		System.out.println("Line: " + line);
		 
		 driver.get(line);
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}
}
