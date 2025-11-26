package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		//Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the browser window
		driver.manage().window().maximize();

		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Enter the username and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//Click on the Login button.
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//Click on the CRM/SFA link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();

		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Store parent window
		String parentWindow = driver.getWindowHandle();

		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();

		//switch to child window
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindows : allWindows) {
			if (!eachWindows.equals(parentWindow)) {
				driver.switchTo().window(eachWindows);
			}
		}

		// Click the first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// Switch back to parent
		driver.switchTo().window(parentWindow);


		// Click second widget
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> allWindows1 = driver.getWindowHandles();
		for(String eachWindows : allWindows1)
		{
			if(!eachWindows.equals(parentWindow))
			{
				driver.switchTo().window(eachWindows);
			}
		}
		Thread.sleep(3000);

		// Click the second resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();

		Thread.sleep(5000);

		// Switch back to parent
		driver.switchTo().window(parentWindow);

		//Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();

		//Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();

		//Verify the title of the page.
		String title = driver.getTitle();
		System.out.println(title);
	}

}
