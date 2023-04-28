package za.co.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TestCase5d {

	
	public static BigDecimal calculateTotal(BigDecimal price, int qty) {
		return price.multiply(BigDecimal.valueOf(qty));
	}
}
