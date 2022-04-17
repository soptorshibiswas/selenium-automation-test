package co.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	private WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void clickSignInButton(){
        WebElement headerUserInfo = driver.findElement(By.className("header_user_info"));
        headerUserInfo.findElement(By.className("login")).click();
    }
	
	public void fillEmailField(String email) {
        WebElement formCreateAccount = driver.findElement(By.id("create-account_form"));
        formCreateAccount.findElement(By.id("email_create")).sendKeys(email);
    }

    public void clickButtonCreateAccount() {
        WebElement formCreateAccount = driver.findElement(By.id("create-account_form"));
        formCreateAccount.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
    }
    
    public void fillGender() {
        WebElement gender = driver.findElement(By.id("id_gender1"));
        gender.click();
    }
    
    public void fillFirstName() {
        driver.findElement(By.id("customer_firstname")).sendKeys("S");
    }
    
    public void fillLastName() {
        driver.findElement(By.id("customer_lastname")).sendKeys("B");
    }
    
    public void fillPassword() {
        driver.findElement(By.id("passwd")).sendKeys("123456");
    }
    
    public void fillAdressFirstName() {
        driver.findElement(By.id("firstname")).sendKeys("Soptorshi");
    }

    public void fillAdressLastName() {
        driver.findElement(By.id("lastname")).sendKeys("Biswas");
    }

    public void fillAdress() {
        driver.findElement(By.id("address1")).sendKeys("Mohakhali, Dhaka");
    }
    
    public void fillCity() {
        driver.findElement(By.id("city")).sendKeys("Dhaka");
    }

    public void fillState() {
        WebElement state = driver.findElement(By.id("id_state"));
        new Select(state).selectByVisibleText("Alabama");
    }

    public void fillPostalCode() {
        driver.findElement(By.id("postcode")).sendKeys("10001");
    }

    public void fillCountry() {
        WebElement state = driver.findElement(By.id("id_country"));
        new Select(state).selectByVisibleText("United States");
    }
    
    public void fillMobilePhone() {
        driver.findElement(By.id("phone_mobile")).sendKeys("01711123456");
    }
    
    public void clickRegisterButton() {
        driver.findElement(By.id("submitAccount")).click();
    }
}

