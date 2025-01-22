package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class OnBoardOCNPages {

	 WebDriver driver;

    public OnBoardOCNPages(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private  By NodeIDField= By.xpath("(//input[@id='outlined-basic'])[1]");
    private  By PublicIDField= By.xpath("(//input[@id='outlined-basic'])[2]");
    private  By NodetypeSelect=By.xpath("(//div[@id='node-type-select'])[1]");
    private  By NodeValidator =By.xpath("(//li[normalize-space()='Validator'])[1]");
    private  By NodeRPC = By.xpath("//li[normalize-space()='RPC']");
    private  By AddNode = By.xpath("//button[normalize-space()='+ Add Node']");
    
   // private By checkNode= By.xpath("//div[@class='MuiDataGrid-virtualScrollerContent css-0']");//div[@class='MuiDataGrid-virtualScrollerContent css-0'])
    
    private  By NextButton =By.xpath("//button[normalize-space()='Next']");  
    
    private  By WalletAdd = By.xpath("(//input[@id='outlined-basic'])[1]");
    
    private  By SelectTrans = By.cssSelector("#node-type-select");
    private  By TransactionSubmsn=By.xpath("(//li[normalize-space()='Transaction Submission'])[1]");
    private  By ContraDeploy= By.xpath("(//li[normalize-space()='Contract Deployment'])[1]");
    private  By addWalletBTN=By.xpath("(//button[normalize-space()='+ Add Wallet'])[1]");
    private  By NextBTN= By.xpath("//button[normalize-space()='Next']");
    private  By SubmitBtn1= By.xpath("(//button[normalize-space()='Submit'])[1]");
   

    private  String TNodeaddcheck="(//div[@role='grid'])[1]";//div[@role='row'])[2])
    private  String TCheckaddress = "(//div[@role='grid'])[2]";
    private  String row1Node= "(//div[@role='row'])[2]";
    private  String row1WalletDetails="(//div[@role='row'])[4]";
    
    
    //Actions
    public  void enterNodeID(String NodeID) {
    	driver.findElement(NodeIDField).sendKeys(NodeID);
    }
    
    public  void enterPublicID(String PublicID) {
    	driver.findElement(PublicIDField).sendKeys(PublicID);
    }
    
    public  void selectNode() {
    	driver.findElement(NodetypeSelect).click();
    }
    
    public  void selectValidator() {
    	driver.findElement(NodeValidator).click();
    }
    
    public  void selectRPC() {
    	driver.findElement(NodeRPC).click();
    }
    public  void clickonAddNode() {
    	driver.findElement(AddNode).click();
    }
    
    public  void clickNextbtn() {
    	driver.findElement(NextButton).click();
    }
    
    public  void enterWalletAddress(String WalAddress) {
    	driver.findElement(WalletAdd).sendKeys(WalAddress);
    }
    
   public  void Optionselect() {
	   driver.findElement(SelectTrans).click();
    }
   public  void ClickTranssubmission() {
	   driver.findElement(TransactionSubmsn).click();
    }
   public  void ClickContraDeploy() {
	   driver.findElement(ContraDeploy).click();
    }
   public  void clickAddWalletBTN() {
	   driver.findElement(addWalletBTN).click();
   }
   
   public  void ClickNextBTN() {
	   driver.findElement(NextBTN).click();
   }
   
   public  WebElement getTable() {
       return driver.findElement(By.xpath("TNodeaddcheck"));
   }
   public   WebElement getRowFromTable() {
       return driver.findElement(By.xpath("row1Node"));
   }
   public  WebElement getSecondTable() {
       return driver.findElement(By.xpath("TCheckaddress"));
   }

   public  WebElement getRowFromSecondTable() {
       return driver.findElement(By.xpath("row1WalletDetails"));
   }
   
   // Action to get text of a row
   public  String getRowTextFromFirstTable() {
       WebElement row = getRowFromTable();
       return row.getText();
   }

   public  String getRowTextFromSecondTable() {
       WebElement row = getRowFromSecondTable();
       return row.getText();
   }
   
   public   void ClickSubmitBTN1() {
	   driver.findElement(SubmitBtn1).click();
   }


   
}
