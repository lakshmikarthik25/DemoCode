package Updating;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildInteraction {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
            Set<String> handles=   driver.getWindowHandles();
            Iterator<String> it= handles.iterator();
            String parentID= it.next();
             String childId= it.next();
             driver.get("https://courses.rahulshettyacademy.com/courses");
              String courseName=  driver.findElements(By.cssSelector("[class='course-listing-title']")).get(2).getText();
              driver.switchTo().window(parentID);
              WebElement bar=driver.findElement(By.xpath("(//div[@class='form-group'])[1]/input"));
              bar.sendKeys(courseName);
                
             File file= bar.getScreenshotAs(OutputType.FILE);
       
                FileUtils.copyFile(file,new File("Shot.png"));
                
               
          System.out.println( bar.getRect().getDimension().getHeight()); 
          System.out.println( bar.getRect().getDimension().getWidth()); 
	}

}
