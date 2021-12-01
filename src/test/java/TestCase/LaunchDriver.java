package TestCase;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchDriver {

	 WebDriver driver;

	public  WebDriver  launchDriver(String URL) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		return driver;
	}

}
