package dashboard.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {

	
	public DashboardPage(WebDriver driver) {
      PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH,using = "//*[@name=\"txtUsername\"]")
	private static WebElement username;
	
	@FindBy(how = How.XPATH,using = "//*[@name=\"txtPassword\"]")
	private static WebElement password;
	
	@FindBy(how = How.XPATH,using = "//*[@type='submit']")
	private static WebElement loginBtn;
	
	@FindBy(how = How.XPATH,using = "//*[@href=\"#\"]")
	private static WebElement welcomeWord;
	
	@FindBy(how = How.XPATH,using = "//*[@href=\"/index.php/auth/logout\"]")
	private static WebElement logoutBtn;
	
	public void enterUsernameAndPassword() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}
    
	public void clickOnLoginButton() {
		loginBtn.click();
    }

    public void verifyWelcomeWord1() {
		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match",actual.contains(expected));
	}

     public void verifyUserName() {
		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match",actual.contains(expected));
	}

	public void logOut() {
		welcomeWord.click();
		logoutBtn.click();
		
	}

}
	



