package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_Amazon {

	public static void main(String[] args) throws IOException {
		//Instantiate ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		//Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");

		//Maximize the browser window
		driver.manage().window().maximize();

		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);

		//Get the price of the first product.
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("Price is" + price);

		//Print the number of customer ratings for the first displayed product.
		String rating=driver.findElement(By.xpath("//span[@class='a-size-small a-color-base'][1]")).getText();
		System.out.println("Rating is" + rating);

		//Click the first text link of the first image.
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'][1]")).click();	

		// store current window
		String parent = driver.getWindowHandle();

		// switch to new window
		for (String eachWindow : driver.getWindowHandles()) {
			if (!eachWindow.equals(parent)) {
				driver.switchTo().window(eachWindow);
			}
		}
		//Take a screenshot of the product displayed.
		WebElement screenshot = driver.findElement(By.id("dp-container"));
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/product.png");
		FileUtils.copyFile(source,destination);

		//Click the 'Add to Cart' button.
		driver.findElement(By.id("add-to-cart-button")).click();

		//Get the cart subtotal and verify if it is correct.
		String total = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(total);
		if(total.contains(price))
		{
			System.out.println("Price is verified");
		}
		else
		{
			System.out.println("Price is incorrect");
		}

		//Close the browser.
		driver.quit();

	}

}
