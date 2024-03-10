package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WithheaderStepDef {

	WebDriver driver;
	
	
	
	@Given("User launch the website URL")
	public void user_launch_the_website_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.buildchatbot.ai/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div[3]/div/span[2]/a/button")).click();

	}

	@When("user enter the valid credentials")
	public void user_enter_the_valid_credentials(DataTable dataTable) {

		List<Map<String, String>> mp=dataTable.asMaps(String.class, String.class);
		
		String string = mp.get(0).get("UserName");
		String string2 = mp.get(0).get("Password");
		
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.navigate().refresh();
		String string3 = mp.get(1).get("UserName");
		String string4 = mp.get(1).get("Password");
		
		driver.findElement(By.id("email")).sendKeys(string3);
		driver.findElement(By.id("password")).sendKeys(string4);
		driver.findElement(By.id("loginsubmit")).click();
		

		
	      	
		
	}

	@Then("user successfully click the sumbit button")
	public void user_successfully_click_the_sumbit_button() {

	}

}
