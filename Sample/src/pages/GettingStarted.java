package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class GettingStarted {
	
	WebDriver driver;

    public GettingStarted(WebDriver driver) {
        this.driver = driver;
    }
	//Locators
    private By OnBoardOCN = By.xpath("//h2[normalize-space()='Onboard OCN Node']");
    private By LaunchOCN = By.xpath("(//h2[normalize-space()='Launch OCN Child Network'])[1]");
    
    //Actions
    public void clickOnBoardOCN() {
    	
    	driver.findElement(OnBoardOCN).click();
    }
    
    public void clickLaunchOCN() {
    	
    	driver.findElement(LaunchOCN).click();
    }

}
