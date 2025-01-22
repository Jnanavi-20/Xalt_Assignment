package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.baseTest;

public class LaunchOCN extends baseTest {
	
	
	 WebDriver driver;

    public LaunchOCN(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private  By NetworkName= By.xpath("(//input[@id='outlined-basic'])[1]");
    private  By WallAddress= By.xpath("(//input[@id='outlined-basic'])[2]");
    private  By NextButton2=By.xpath("//button[normalize-space()='Next']");
    private  By LNodeID=By.xpath("(//input[@id='outlined-basic'])[1]");
    private  By LPublicIP= By.xpath("(//input[@id='outlined-basic'])[2]");
    private  By SelectNode2=By.cssSelector("#node-type-select");
    private  By LValidator=By.xpath("(//li[normalize-space()='Validator'])[1]");
    private  By LRPC=By.xpath("(//li[normalize-space()='RPC'])[1]");
    private  By AddNode2=By.className("MuiTouchRipple-root css-w0pj6f");
    private  By Lnext2=By.xpath("//button[normalize-space()='Next']");
    private  By LSubmit=By.xpath("//button[normalize-space()='Submit']");
    
    
    //Actions
    public void enterNetworkName(String Networkname) {
    	driver.findElement(NetworkName).sendKeys(Networkname); 
    	}
    
    public  void enterWalletAddress(String WalAddress) {
    	driver.findElement(WallAddress).sendKeys(WalAddress); 
    	}
    public void ClickNXTBTN2() {
    	driver.findElement(NextButton2).click(); 
    	}
    
    public void enterNodeID(String NodeID2) {
    	driver.findElement(LNodeID).sendKeys(NodeID2); 
    	}
    public  void enterpublicIP(String PublicIP2) {
    	driver.findElement(LPublicIP).sendKeys(PublicIP2); 
    	}
    
    public void ClickSelectNode2() {
    	driver.findElement(SelectNode2).click();	
    }
    public  void SelectValidator2() {
    	driver.findElement(LValidator).click();
    	}
    public  void SelectRPC2() {
    	driver.findElement(LRPC).click();
    	
    }
    public  void ClickAddNode2() {
    	driver.findElement(AddNode2).click();
    	
    }
    public  void ClickLNext2() {
    	driver.findElement(Lnext2).click();
    	
    }
    public void ClickSubmit2() {
    	driver.findElement(LSubmit).click();
    }
    
    
    
}
