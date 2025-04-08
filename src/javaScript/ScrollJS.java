package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJS {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        JavascriptExecutor js =  (JavascriptExecutor)driver;
	        
	        js.executeScript("window.scrollBy(0,500)");
	        
	        js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
	        
	        List<WebElement> tableItems = driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"))  ;
	        
	        int sum =0;
	        for(int i =0; i<tableItems.size(); i++) {
	        	sum = sum+ Integer.parseInt(tableItems.get(i).getText());
	        	
	        }
	        System.out.println(sum);
	       int total=Integer.parseInt( driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	        System.out.println(total);
	        

	}

}
