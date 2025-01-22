package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	 WebDriver driver;

	    public SignInPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locators
	    private By SignIn=By.xpath("//button[normalize-space()='Sign In']");
	    private By SignInLink = By.xpath("//button[normalize-space()='Already have an account? Click here to sign in.']");
	    private By emailField = By.xpath("//input[@type='text']");
	    private By passwordField = By.xpath("//input[@type='password']");
	    private By signInButton = By.xpath("//button[normalize-space()='Sign In']");
	   
	    // Actions
	    public void SignIn() {
	        driver.findElement(SignIn).click();
	    }
	    
	    
	    public void SignInLink() {
	        driver.findElement(SignInLink).click();
	    }
	    
	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickSignIn() {
	        driver.findElement(signInButton).click();
	    }
}
