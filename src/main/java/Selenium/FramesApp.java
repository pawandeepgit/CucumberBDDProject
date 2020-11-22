package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesApp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\learn\\tools\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		//Print the number of frames in a page
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberofTags = elements.size();
		System.out.println("No of frames in a page: " + numberofTags);
		
		//Print the frame IDs and names
		for(WebElement we: elements){
			System.out.println("Frame ID :" + we.getAttribute("id"));
			System.out.println("Frame Name :" + we.getAttribute("name"));
		}
		
		//Navigate to frame using ID and Name and click the try it button
		driver.switchTo().frame("iframeResult");
		String getText1 = driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).getText();
		System.out.println(getText1);
		driver.switchTo().defaultContent();
		
		//Navigate to frame using webelement and click the try it button
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='iframeResult']")));
		String getText3 = driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).getText();
		System.out.println(getText3);
		driver.switchTo().defaultContent();
		
		driver.quit();

	}

}

