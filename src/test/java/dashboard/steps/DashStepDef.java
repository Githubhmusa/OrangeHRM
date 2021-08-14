package dashboard.steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dashboard.pages.DashboardPage;



public class DashStepDef {
	WebDriver driver;
	DashboardPage dashPage;
	
	
	@Given("^user go to Orange Hrm home page$")
	public void user_go_to_Orange_Hrm_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@When("^user click on the log in button$")
	public void user_click_on_the_log_in_button() throws Throwable {
		dashPage = new DashboardPage(driver);
		dashPage.clickOnLoginButton();
		
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		DashboardPage dashPage = new DashboardPage(driver);
	    dashPage.enterUsernameAndPassword(); 
	    
	}

	@Then("^user navigate to the welcome page$")
	public void user_navigate_to_the_welcome_page() throws Throwable {
	    dashPage.verifyWelcomeWord1();
	    
	}

	@Then("^user verify the page title as \"([^\"]*)\"$")
	public void user_verify_the_page_title_as(String title) throws Throwable {
		String expected = title;
		String actual = driver.getTitle();
		Assert.assertTrue("Title does not match",actual.contains(expected));
	
	}

	@Then("^user verify user name is displays at top right$")
	public void user_verify_user_name_is_displays_at_top_right() throws Throwable {
	    dashPage.verifyUserName();
	    
	}
	@Then("^user log out$")
	public void user_log_out() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    dashPage.logOut();
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    driver.close();
	    driver.quit();
	}
}
