package Updating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
       System.out.println(  driver.findElement(with(By.tagName("label")).above(name)).getText());
       
       WebElement two = driver.findElement(By.cssSelector("[for='dateofBirth']"));
         driver.findElement(with(By.tagName("input")).below(two)).click();
         
         WebElement ice = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
         driver.findElement(with(By.tagName("input")).near(ice)).click();
         
         WebElement emp = driver.findElement(By.cssSelector("[for='inlineRadio1']"));
         driver.findElement(with(By.tagName("input")).toRightOf(emp)).click();
	}

}
