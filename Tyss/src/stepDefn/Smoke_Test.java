package stepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke_Test 
{ 
	WebDriver driver;
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	}

	@When("^I enter my valid username and password$")
	public void I_enter_my_valid_username_and_password() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("admin");
	    driver.findElement(By.id("pass")).sendKeys("manager");
	}

	@Then("^User should be able to login$")
	public void User_should_be_able_to_login() throws Throwable {
		driver.findElement(By.id("u_0_b")).click();
	
	}
}
