package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.app.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class FacebookLoginTest extends CommonMethods {

	WebDriver driver = getDriver();

	@Given("^I navigate to facebook page$")
	public void navigateFacebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				" \"C:\\learn\\tools\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^I enter the username$")
	public void enterUsername() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	}

	@When("^I enter the username \"([^\"]*)\"$")
	public void i_enter_the_username(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}
	
	@When("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enterUserDetails(String arg1, String arg2) throws Throwable {
	}

	@When("^I click the login button$")
	public void clickLogin() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^I will be navigated to account page$")
	public void validateAccountPage() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean accountPage = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).isDisplayed();
		assertTrue(accountPage);
	}

}
