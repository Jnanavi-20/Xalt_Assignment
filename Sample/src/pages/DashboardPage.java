package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	 WebDriver driver;
	

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private  By GetstartedButton=By.xpath("(//button[normalize-space()='Get Started'])[1]");
    private  By signOutButton = By.id("//*[@id='root']/div/header/div/button");

    // Actions
    public  void clickGetstart() {
        driver.findElement(GetstartedButton).click();
    }

    
    public  void clickSignOut() {
        driver.findElement(signOutButton).click();
    }

}
