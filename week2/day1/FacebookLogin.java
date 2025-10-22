package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//Instantiate browser driver
		ChromeDriver driver = new ChromeDriver();
		//launch browser
		driver.get("https://www.facebook.com/");
		//Enter the email id as testleaf.2023@gmail.com
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		//Enter the password as Tuna@321
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		//Click on the Login button.
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Print the title of the current web page.
		String title = driver.getTitle();

	}

}
