package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("aut");
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("cse");
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("opt");
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testing@gmail.com");
		//Select State/Province as NewYork Using Visible Text.
		WebElement drop = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select sel = new Select(drop);
		sel.selectByVisibleText("New York");
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("fill it");
		//Click on the update button.
		driver.findElement(By.className("smallSubmit")).click();
		//Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window.
		driver.close();





	}

}
