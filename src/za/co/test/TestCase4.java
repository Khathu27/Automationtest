package za.co.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase4 {
	
	private String username, password;
	
	

	public TestCase4(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public static void main(String[] args) throws InterruptedException {
		
		TestCase4 testCase4 = new TestCase4("username", "password");
		String url ="http://automationpractice.com/?username="
				.concat(testCase4.username)
				.concat("&password=")
				.concat(testCase4.getPassword());
		
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 driver.get(url);
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution complete");
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
