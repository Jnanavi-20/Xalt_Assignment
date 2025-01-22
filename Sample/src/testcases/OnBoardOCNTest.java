package testcases;


import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseTest;
import pages.DashboardPage;
import pages.GettingStarted;
import pages.OnBoardOCNPages;
import pages.SignInPage;


public class OnBoardOCNTest extends baseTest{
	OnBoardOCNPages OnboardPages	;
	DashboardPage dashboardpage;
GettingStarted getStart;
	
	@BeforeMethod
    public void setUpTest() {
        setUp();
        //login to account
        signIn("testuser@yopmail.com", "Test@123");
        System.out.println("Navigating to Dashboard Page...");
        //tap on OnboardOCN
        dashboardpage= new DashboardPage(driver);
        
        //Tap on get start button 
       getStart= new GettingStarted(driver);
       OnboardPages = new OnBoardOCNPages(driver);
       
    }
	

	@Test
    public void testOnBoardOCN() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.clickGetstart();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getStart.clickOnBoardOCN();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		OnboardPages.enterNodeID("NodeID-211");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		OnboardPages.enterPublicID("192.2.4.6");
		OnboardPages.selectNode();
		OnboardPages.selectValidator();
		System.out.println("selects on validator");		//OnboardPages.selectRPC();
		OnboardPages.clickonAddNode();
		OnboardPages.clickNextbtn();
		System.out.println("move to next button");
		OnboardPages.enterWalletAddress("0x88FA61D2FA13AAD8FBD5B030372B4A159BBBDFAF");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 OnboardPages.Optionselect();
		OnboardPages.ClickTranssubmission();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		OnboardPages.clickAddWalletBTN();
		OnboardPages.ClickNextBTN();
		
		//OnboardPages.getRowTextFromFirstTable();
		//OnboardPages.getRowFromSecondTable();
		OnboardPages.ClickSubmitBTN1();
	}
    	@Test
        public void testfailOnBoardOCN() {
    		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    			dashboardpage.clickGetstart();
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    			getStart.clickOnBoardOCN();
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    			OnboardPages.enterNodeID("NodeID-Abc");
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    			OnboardPages.enterPublicID("255.255.255.255");
    			OnboardPages.selectNode();
    			OnboardPages.selectValidator();
    			System.out.println("selects on validator");		//OnboardPages.selectRPC();
    			OnboardPages.clickonAddNode();
    			OnboardPages.clickNextbtn();
    			System.out.println("move to next button");
    			OnboardPages.enterWalletAddress("0x88FA61D2FA13AAD8FBD5B030372B4A159BBBDGH");//wrong wallet address
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    			 OnboardPages.Optionselect();
    			OnboardPages.ClickTranssubmission();
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    			OnboardPages.clickAddWalletBTN();
    			OnboardPages.ClickNextBTN();
    			
    			//OnboardPages.getRowTextFromFirstTable();
    			//OnboardPages.getRowFromSecondTable();
    			OnboardPages.ClickSubmitBTN1();
    }
    	 @AfterMethod
    	    public void tearDownTest() {
    	        tearDown();
    	    }

	
}
