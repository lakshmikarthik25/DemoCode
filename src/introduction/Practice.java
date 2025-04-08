package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         Thread.sleep(2000);
         driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println( driver.findElement(By.id("checkBoxOption1")).isSelected());
         driver.findElement(By.id("checkBoxOption1")).click();
         System.out.println( driver.findElement(By.id("checkBoxOption1")).isSelected());

         
         System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
