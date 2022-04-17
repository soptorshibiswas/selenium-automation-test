package co.selenium.automation.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import co.selenium.automation.pages.SignInPage;

public class SignInAndShopTest {
//	private Actions action;
	private WebDriver driver;
    private SignInPage page;
    private AutomationTest test = new AutomationTest();

    @Before
    public void setUp() {
        test.setProperty();
        driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
        this.page = new SignInPage(driver);
        test.signinPageSetUp(driver, page);
    }

    @After
    public void tearDown() {
//    	page.logout();
        driver.quit();
    }
    
    @Test
    public void signInAndShop() {
    	page.fillEmailField("mail_20220417_134244_id@qatest.com");
    	page.fillPasswordField("123456");
    	page.clickSignInButton();
    	
//    	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]"));

//    	driver.findElement(By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[2]//a[contains(text(), \\\"Casual Dresses\\\")]"));
    }
}
