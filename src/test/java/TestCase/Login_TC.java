package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_TC {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void setupMethod() {
		driver = new LaunchDriver().launchDriver("https://google.com");
		wait = new WebDriverWait(driver, 90);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("// Write code here that turns the phrase above into concrete actions");

	}

	@Test
	public void testMethod() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Gmail']")));
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']")));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		System.out.println("// Write code here that turns the phrase above into concrete actions");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ranjankrsonu");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']//ancestor::button")));
		driver.findElement(By.xpath("//*[text()='Next']//ancestor::button")).click();
		
		System.out.println("Login not done in automated browser");
		

	}

}
