package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOutWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Load the URL
		driver.get("https://www.leafground.com/link.xhtml");

		// Maximize Window
		driver.manage().window().maximize();

		//Click on link
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
	}

}
