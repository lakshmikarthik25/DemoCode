package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssig {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

       
        driver.switchTo().frame("frame-top");

       
        driver.switchTo().frame("frame-middle");

        // Get text from middle frame
        String middleText = driver.findElement(By.id("content")).getText();
        System.out.println( middleText);

       
        driver.quit();
    }
}
