package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;

	@Given("Open the browser and go to the application")
	public void open_the_browser_and_go_to_the_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///C:/Users/IT/AppData/Local/Microsoft/Windows/INetCache/IE/1EZWZC3M/dev_online%20Banking%20monthly_yearly%20statement[1].html");

	}

	@When("Enter valid user")
	public void enter_valid_user() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch34");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	}

	@When("Click login")
	public void click_login() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("logout Button should be visible")
	public void logout_button_should_be_visible() {
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(driver.findElement(By.xpath("//*[text()='Logout']")).isDisplayed());
		sf.assertAll();

	}

	@When("Enter invalid user")
	public void enter_invalid_user() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("mhbjnhg");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("hgy7ttrdf");
	}

	@When("Click login invalid")
	public void click_login_invalid() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("alert msg shows Invalid username or password")
	public void alert_msg_shows_invalid_username_or_password() {
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(alertMsg, "Invalid username or password");

	}

	@When("Enter null user")
	public void enter_null_user() {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");
	}

	@When("Enter null password")
	public void enter_null_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}

	@When("Click login null")
	public void click_login_null() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("alert msg shows Invalid username or password null")
	public void alert_msg_shows_invalid_username_or_password_null() {

	}

}
