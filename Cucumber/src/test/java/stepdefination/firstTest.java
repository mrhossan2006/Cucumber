package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
 public class firstTest {
	 WebDriver driver;
	 
	 @Given("^Open chrome browser\\.$")
	 public void open_chrome_browser() throws Throwable {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	 @And("^Start Applicattion\\.$")
	 public void start_Applicattion() throws Throwable {
		 driver.get("http://www.dice.com/");
	 }
	 @When("^i click on login button\\.$")
	 public void i_click_on_login_button() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='Login_1']")).click();
	 }

	@When("^I enter valid username and valid password\\.$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='Email_1']")).sendKeys("mrhossan2006@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Password_1']")).sendKeys("md436845");
		driver.switchTo().frame("google_osd_static_frame_9138658280762");
		driver.findElement(By.id("close")).click();
	}

	@Then("^user should able to login successfully\\.$")
	public void user_should_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='loginDataSubmit']/div/div/button")).click();
	}

}
