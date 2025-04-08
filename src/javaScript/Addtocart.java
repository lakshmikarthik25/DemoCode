package javaScript;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] wishList = { "Cucumber", "Beetroot", "Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < options.size(); i++) {

			String[] name = options.get(i).getText().split("-");
			String formateName = name[0].trim();

			List<String> addAll = Arrays.asList(wishList);

			if (addAll.contains(formateName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j==wishList.length) {
					break;
				}
			}

		}
	}
}
