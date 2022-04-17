package co.selenium.automation.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.selenium.automation.pages.CreateAccountPage;

public class CreateAccountTest {
	private WebDriver driver;
    private CreateAccountPage page;
    private AutomationTest test = new AutomationTest();

    @Before
    public void setUp() {
        test.setProperty();
        driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
        this.page = new CreateAccountPage(driver);
        test.createAccountSetup(driver, page);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCreateAccount() {
        page.fillGender();
        page.fillFirstName();
        page.fillLastName();
        page.fillPassword();
        page.fillAdressFirstName();
        page.fillAdressLastName();
        page.fillAdress();
        page.fillCity();
        page.fillState();
        page.fillPostalCode();
        page.fillCountry();
        page.fillMobilePhone();
        page.clickRegisterButton();
    }
}
