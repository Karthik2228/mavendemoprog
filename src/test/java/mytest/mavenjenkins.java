package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mavenjenkins 
{
	WebDriver driver;

	@BeforeMethod
	public void setbrowser() 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		System.out.println("Opening browser");
	}

	@Test
	public void checkTitle() {
		System.out.println("checking title");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 1)
	public void checklogo() {
		System.out.println("checking logo");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Get Vaccinated. Wear a Mask. Save Lives.']")).isDisplayed());
	}

	@AfterMethod
	public void closeWindow() {
		driver.quit();
	}

}
