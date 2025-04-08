package Hero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Cookie;

import java.time.Duration;

public class FlirtifyBypass {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
//		WebDriver driver = new ChromeDriver();

        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize window

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the Flirtify room start page
            driver.get("https://flirtify.com/room/start");

            // Wait for the page to load
            Thread.sleep(3000); // Adjust time as needed

            // Create a WebDriverWait instance for explicit waits
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Attempt to detect and bypass the payment page
            // Example: If it’s a popup with a close button
            try {
                WebElement closeButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("close-button-id")) // Replace with actual ID
                );
                closeButton.click();
                System.out.println("Closed payment popup.");
            } catch (Exception e) {
                System.out.println("No close button found or not a popup.");
            }

            // Alternative: If it’s an overlay, try clicking a "skip" or "continue" link
            try {
                WebElement skipLink = wait.until(
                    ExpectedConditions.elementToBeClickable(By.className("skip-link")) // Replace with actual class
                );
                skipLink.click();
                System.out.println("Skipped payment overlay.");
            } catch (Exception e) {
                System.out.println("No skip link found.");
            }

            // Alternative: If cookies can bypass the payment wall
            // Example: Add a cookie that simulates a subscribed state (hypothetical)
            driver.manage().addCookie(new Cookie("subscription_status", "active"));
            driver.navigate().refresh(); // Refresh to apply the cookie
            System.out.println("Attempted cookie bypass.");

            // Wait to see if subscription content loads
            Thread.sleep(5000);

            // Check if subscription content is visible (replace with actual element)
            try {
                WebElement content = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("subscription-content-id")) // Replace with actual ID
                );
                System.out.println("Subscription content loaded successfully!");
            } catch (Exception e) {
                System.out.println("Could not access subscription content.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
