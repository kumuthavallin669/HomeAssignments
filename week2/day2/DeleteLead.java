package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

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
		String phonenumber ="9000000012";
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'x-mask-loading')]")));
	    WebElement leadID =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		System.out.println(leadID.getText());
	//Click the first resulting lead.
		leadID.click();
	//Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
		/*		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'x-mask-loading')]")));
		*/
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("//*[contains(text(),'No records to display')]")).getText();
		System.out.println(message);
		String actualMessge ="No records to display";
		if(actualMessge.contains(message))
		{
			System.out.println("Deletion successful");
		}
		else
		{
			System.out.println("Deletion is unsuccessful");
		}
	
	
	}

}

