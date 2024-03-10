package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepclass {

	WebDriver driver;

	@Given("User launch the BCB Loginpage")
	public void user_launch_the_bcb_loginpage() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.buildchatbot.ai/");

	}@When("login page displayed")
	public void user_launch_the_bcb_() {
		
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div[3]/div/span[2]/a/button")).click();
		
       

}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		
		
		driver.findElement(By.id("email")).sendKeys("manoj@zaigoinfotech.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("loginsubmit")).click();

	}

	@Then("User click the submit button")
	public void user_click_the_submit_button() {
		
		

	}

}
