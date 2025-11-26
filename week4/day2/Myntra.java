package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		//- Launch the URL https://www.myntra.com/
		driver.get("https://www.myntra.com/");

		//maximize the window
		driver.manage().window().maximize();

		//- In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags",Keys.ENTER);

		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@value='men,men women']/parent::label")).click();
		Thread.sleep(5000);

		//Under "Category" click "Laptop bags"
		driver.findElement(By.xpath("//input[@value='Laptop Bag']/parent::label")).click();
		Thread.sleep(5000);

		//Print the count of the items found.
		String itemsCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Number of items" + " " + itemsCount);
		Thread.sleep(3000);

		//Get the list of brand of the products displayed in the page and print the list
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> nameList = new ArrayList<>();
		for (WebElement names : list) {
			String n = names.getText();
			nameList.add(n);

		}
		System.out.println(nameList);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		//Get the list of names of the bags and print it
		List<WebElement> names = driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<String> nameList1 = new ArrayList<>();
		for (WebElement names1 : names) {
			String n = names1.getText();
			nameList1.add(n);

		}
		System.out.println(nameList1);

		//close the browser


	}}

