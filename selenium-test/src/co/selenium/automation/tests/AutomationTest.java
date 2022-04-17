package co.selenium.automation.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import co.selenium.automation.pages.CreateAccountPage;
import co.selenium.automation.pages.SignInPage;
import utils.EmailBuilder;

public class AutomationTest {
	
	public void setProperty() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Test\\OneDrive\\Documents\\selenium\\chromedriver.exe");
		  }
		 catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void defaultSetup(WebDriver driver) {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
	
	public void createAccountSetup(WebDriver driver,CreateAccountPage page) {
		String email = EmailBuilder.build();
        defaultSetup(driver);
        page.clickSignInButton();
        page.fillEmailField(email);
        page.clickButtonCreateAccount();
        System.out.println(email);
    }
	
	public void signinPageSetUp(WebDriver driver, SignInPage page) {
        defaultSetup(driver);
        page.clickSignInButton();
    }

	public static void main(String[] args) {
//
//		CreateAccountTest test1 = new CreateAccountTest();
//		test1.testCreateAccount();
		
		SignInAndShopTest test = new SignInAndShopTest();
		test.signInAndShop();
	}
}

