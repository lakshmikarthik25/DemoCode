package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         
	         driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	         Thread.sleep(2000);
	        System.out.println( driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	         driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	     System.out.println(   driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	         
	         
	         Thread.sleep(2000);
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	         driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();

	}

}
