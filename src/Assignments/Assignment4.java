package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        String checkbox = driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).getText();
        System.out.println(checkbox);
        driver.findElement(By.xpath("//select/option[2]")).click();
        
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
        Select s = new Select(dropDown);
        
        

	}

}
