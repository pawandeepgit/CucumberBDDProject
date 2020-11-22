package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkyAccountTest {
	
	protected static WebDriver driver;

	@Before
	public void setup() {
		System.out.println("Before method is executed!");
		System.setProperty("webdriver.chrome.driver",
				"C:\\learn\\tools\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		System.out.println("After method is executed!");
		driver.quit();
	}

	@Given("^I navigate to sky page$")
	public void navigateSkyPage() throws Throwable {
		driver.get("https://skyid.sky.com/signup/skycom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^I enter the form with details$")
	public void enterDetails(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(1));
		System.out.println(data.get(4).get(1));

		driver.findElement(By.id("firstname")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("email")).sendKeys(data.get(3).get(1));
	}
	
	@Then("^I click the cancel button$")
	public void clickCancel() throws Throwable {
	}

	@Then("^I validate the sky page$")
	public void validateSkyPage() throws Throwable {
		
	}	

}
