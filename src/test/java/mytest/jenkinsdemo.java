package mytest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkinsdemo 
{
	public void startBrowser()
	{
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
    }
}
