package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesStepDef {

	WebDriver driver;

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.buildchatbot.ai/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div[3]/div/span[2]/a/button")).click();

	}

	@When("User login with Valid and Invalid {string} and {string}")
	public void user_login_with_valid_and_invalid_and(String string, String string2) {

		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);

	}

	@When("User click the Sumbit button")
	public void user_click_the_sumbit_button() {

		driver.findElement(By.id("loginsubmit")).click();

	}

	@Then("User Navigate to welcome page")
	public void user_navigate_to_welcome_page() {

	}

}
