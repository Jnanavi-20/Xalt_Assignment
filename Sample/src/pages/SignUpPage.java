package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By SignUpLink = By.xpath("//*[@id='root']/div/header/div/button");
    private By emailField = By.id("outlined-basic");
    private By passwordField = By.xpath("//input[@id='outlined-basic' and @type='password']");
    private By ConPasswordField=By.xpath("(//input[@id='outlined-basic'])[3]");
    private By signUpButton = By.xpath("//*[@id='root']/div/main/div[2]/button[1]");

    // Actions
    public void SignUpLink() {
        driver.findElement(SignUpLink).click();
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void ConfirmPassword(String password) {
        driver.findElement(ConPasswordField).sendKeys(password);
    }
    public void clickSignUp() {
        driver.findElement(signUpButton).click();
    }

}
