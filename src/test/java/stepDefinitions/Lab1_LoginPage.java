package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Lab1_LoginPage {
	WebDriver driver;

	@Given("^user is on Login page$")
	public void user_is_on_Login_page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("^user enter username ans password$")
	public void user_enter_username_ans_password(){
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	}

	@And("^click on login button$")
	public void click_on_login_button()  {
		
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user navigated to the home page$")
	public void user_navigated_to_the_home_page(){
		
		driver.quit();
		
	}

}
