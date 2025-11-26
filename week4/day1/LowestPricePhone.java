package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestPricePhone {
	public static void main (String args[])
	{
		//instantiate chrome driver
		ChromeDriver driver = new ChromeDriver();
		//navigate url
		driver.get("https://www.amazon.in/");
		//maximize the window
		driver.manage().window().maximize();
		//enter phones in searchbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones" + Keys.ENTER);
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//capturing all prices webelement in list
		List <WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//getting all the price values and storing it in a list
		List<String> price = new ArrayList<>();
		int priceInt;
		int minValue = 0;
		for (WebElement allPrice : priceList) {
			String lowestPrice = allPrice.getText();
			price.add(lowestPrice);

		}
		System.out.println(price);
		//finding the lowest price of mobile
		String min = price.get(0);
		for (String value : price) {
			priceInt = Integer.parseInt(value.replaceAll("[^0-9]", ""));
			minValue = Integer.parseInt(min.replaceAll("[^0-9]", ""));
			if(priceInt<minValue)
			{
				minValue=priceInt;
			}


		}

		System.out.println(minValue);	
		//closing the browser
		driver.close();

	}
}
