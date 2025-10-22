package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate browser driver
		ChromeDriver driver = new ChromeDriver();
		//launch browser
		driver.get("https://www.facebook.com/");
		// Maximize browser window
		driver.manage().window().maximize();
		//close the browser window
		driver.close();
		
		

	}

}
