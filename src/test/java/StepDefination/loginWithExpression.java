package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginWithExpression {

	WebDriver driver;

	@Given("Check user launch the Website with URL")
	public void check_user_launch_the_website_with_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.buildchatbot.ai/");

	}

	@When("User enter user name {string} and password {string} in text field")
	public void user_enter_user_name_and_password_in_text_field(String string, String string2) {

		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div[3]/div/span[2]/a/button")).click();
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);

	}

	@When("user click the submit button")
	public void user_click_the_submit_button() {
		driver.findElement(By.id("loginsubmit")).click();

	}

	@Then("User successfully open the homepage")
	public void user_successfully_open_the_homepage() {

	}

}
