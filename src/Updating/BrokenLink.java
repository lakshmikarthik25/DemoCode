package Updating;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	         List<WebElement> overAll= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	         SoftAssert sa = new SoftAssert();
	         
	         for(WebElement one: overAll) {
	        	 String link=  one.getAttribute("href");
	 	        
	 	        HttpURLConnection all=  (HttpURLConnection)new URL(link).openConnection();
	 	        all.setRequestMethod("HEAD");
	 	        all.connect();
	 	        int res =all.getResponseCode();
	 	        System.out.println(res);
	 	        
	 	       sa.assertTrue(res<404, "The provided link " +one.getText() +" is broken whith code"+res);
	 	       
	 	       
	         }
	          sa.assertAll();
	          
	          driver.quit();
			
	        
	        
	}

}
