package co.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	private WebDriver driver;
    
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
 
    public void clickSignInButton(){
        WebElement headerUserInfo = driver.findElement(By.className("header_user_info"));
        headerUserInfo.findElement(By.className("login")).click();
    }
    
    public void fillEmailField(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void fillPasswordField(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }
    
    public void submitSignIn() {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    
    public void logout() {
        driver.findElement(By.xpath("//a[@title=\"Log me out\"]")).click();
    }
}
