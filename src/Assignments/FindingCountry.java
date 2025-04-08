package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingCountry {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        
	        WebElement drop = driver.findElement(By.id("autocomplete"));
	        Select s = new Select(drop);
	        

	}
	public void addedNew() {
		System.out.println("ja;jfafva;jf");
		System.out.println("sdfsdc");
		System.out.println("ds;jf");
		System.out.println("dsdzcvxvf");
	}

}
