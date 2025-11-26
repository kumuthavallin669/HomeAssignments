package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		//Instantiate ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//Add an implicit wait to ensure the webpage elements are fully loaded
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//click try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//- Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String expected = "You pressed OK!";
		WebElement actual = driver.findElement(By.xpath("//p[text()='You pressed OK!']"));
		if(actual.getText().equals(expected))
		{
			System.out.println("Verified the text for ok button");
		}
		//close the browser
		driver.close();
	}

}
