package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		//close notification pop up 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//Instantiate browser driver
		ChromeDriver driver = new ChromeDriver(options);
		//launch browser
		driver.get("http://leaftaps.com/opentaps/.");
		// Maximize browser window
		driver.manage().window().maximize();
		//Enter a username and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//Enter an account name.
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("test");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		//Enter a Number Of Employees.
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("10");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		//Click the "Create Account" button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Print theTitle name.
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window.
		driver.close();
		
	}

}
