package Updating;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UiCalender {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
//         driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
         
         String date ="25";
         String month ="6";
         String year ="2030";
         String[] expectedValue = {month,date,year};
         
         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         Thread.sleep(2000);
         driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
         driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
         driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
         driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
         driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
         driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
         System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());
         
         
           List<WebElement> actualValues= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
           
           for(int i=0; i<actualValues.size(); i++) {
        	   System.out.println( actualValues.get(i).getAttribute("value"));
        	   Assert.assertEquals(actualValues.get(i).getAttribute("value"), expectedValue[i]);
           }
           
	}

}
