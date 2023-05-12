package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.ajio.com/");
		// Maximize Window
		driver.manage().window().maximize();
		// Implicit Time Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In SearchBox typing "bags" and press ENTER
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(1000);
		
		//In Gender, selecting "Men" CheckBox
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		
		//In Category, selecting "Fashion Bags
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		
		//Printing number of items found
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total no. of Items Found: "+totalItems);
		
		//Listing out of All Brands
		System.out.println("All Brands: ");
		List<WebElement> allbrands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brands Size: "+allbrands.size());
		for (WebElement brands : allbrands) {
			String txtbrand = brands.getText();
			System.out.println(txtbrand);
		} 
		
		//Listing out of All Bag Names
		System.out.println("All Bag Names: ");
		List<WebElement> allbags = driver.findElements(By.className("nameCls"));
		System.out.println("Bags Size: "+allbags.size());
		for (WebElement bags : allbags) {
			String txtbags = bags.getText();
			System.out.println(txtbags);
		} 
	}

}
