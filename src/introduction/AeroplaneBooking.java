package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AeroplaneBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
        System.out.println( driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
    Assert.assertTrue( driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
    
   System.out.println( driver.findElement(By.id("Div1")).getDomAttribute("style"));
//             driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
             System.out.println( driver.findElement(By.id("Div1")).getDomAttribute("style"));
             Thread.sleep(2000);
          if(   driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
        	  System.out.println("its enabled mama");
        	  Assert.assertTrue(true);
          }
          else {
        	  Assert.assertTrue(false);
          }

	}

}
