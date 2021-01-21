package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para 
{
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void para_exec(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./folder/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./folder/chromedriver.exe");
		if(browser.equals("chrome"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	}
}
