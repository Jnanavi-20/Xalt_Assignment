package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.SignInPage;

import java.time.Duration;


public class baseTest {
	protected WebDriver driver;
    protected WebDriverWait wait;
    private SignInPage signInPage;
    
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://xaltsocnportal.web.app");
        wait  = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    
    

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    // Reusable Sign-In Method
    public void signIn(String email, String password) {
        signInPage = new SignInPage(driver);
        signInPage.SignIn();
        signInPage.SignInLink();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        signInPage.clickSignIn();
    }
    
    //Reusable Getstart
    

}
