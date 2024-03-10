package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WithoutHeaderUsingDatatable {

	WebDriver driver;

	@Given("User click the login page")
	public void user_click_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.buildchatbot.ai/");

	}

	@When("User enter the user name and password")
	public void user_enter_the_user_name_and_password(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div[3]/div/span[2]/a/button")).click();

		List<List<String>> asList = dataTable.asLists(String.class);

		for (List<String> e : asList) {

			driver.findElement(By.id("email")).sendKeys(e.get(0));
			driver.findElement(By.id("password")).sendKeys(e.get(1));
			
		}

		driver.findElement(By.id("loginsubmit")).click();
		
//		 List<String> string = asList.get(0);
//		List<String> string2 = asList.get(1);

		

	}

}
