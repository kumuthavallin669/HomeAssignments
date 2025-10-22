package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
		//Click on the "Leads" tab.
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//Enter a FirstName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		//Enter a LastName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("N");
		////Enter a CompanyName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("xyz");
		//Enter a Title .
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Create Lead");
		//Click the "Create Lead" button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Print theTitle.
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		//Close the browser window.
		driver.close();
		
		
		
	}

}
