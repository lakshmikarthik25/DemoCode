package Updating;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamExercise {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	        
	        driver.findElement(By.cssSelector(".sort-descending")).click();
	        
	        
	       List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
	       
	       List<String> actualList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
	       
	       List<String> sortedList= actualList.stream().sorted().collect(Collectors.toList());
	       
	       Assert.assertEquals(actualList,sortedList);
	       List<String> prizeList;
	       do {
	    	   List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
	    	    prizeList = rows.stream().filter(s->s.getText().contains("Pineapple")).map(s->getVeggiesPrise(s)).collect(Collectors.toList());
		       prizeList.forEach(a->System.out.println(a));
		       if(prizeList.size()<1){
		    	   
		    	   driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		       }
		       
	       }
	       while(prizeList.size()<1) ;
	       
	}

	private static String getVeggiesPrise(WebElement s) {
          String prize=  s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return prize;
	}

}
