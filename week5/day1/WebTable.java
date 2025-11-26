package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {
		//instantiate browser
		ChromeDriver driver = new ChromeDriver();
		//global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the url - https://finance.yahoo.com/
		driver.get("https://finance.yahoo.com/");
		//maximize the window
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//mouse hover more
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		Actions moreOption = new Actions(driver);
		moreOption.moveToElement(more).pause(300).perform();
		//click on crypto tab
		driver.findElement(By.linkText("Crypto")).click();
		//print the cryptocurrency names
		List<WebElement> names = driver.findElements(By.xpath("//td[@data-testid-cell='companyshortname.raw']"));
		List<String> cryptoNames = new ArrayList<>();
		for (WebElement n : names) {
			String cn=n.getText();
			cryptoNames.add(cn);
		}
		System.out.println(cryptoNames);
		//close the driver
		driver.quit();
	}
}


