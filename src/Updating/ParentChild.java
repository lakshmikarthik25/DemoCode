package Updating;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
	    Set<String> windows= driver.getWindowHandles();
	
	    Iterator<String> it= windows.iterator();
	    String parent =it.next();
	    String child = it.next();
	    driver.switchTo().window(child);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    driver.switchTo().window(parent);
	    driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
