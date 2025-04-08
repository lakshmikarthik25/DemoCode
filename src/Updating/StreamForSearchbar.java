package Updating;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamForSearchbar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Potato");
         List<WebElement> list= driver.findElements(By.xpath("//tr/td[1]"));
         
         List<WebElement> req= list.stream().filter(s->s.getText().contains("Potato")).collect(Collectors.toList());
         System.out.println(req.size());
         Assert.assertEquals(list.size(), req.size());
	}

}
