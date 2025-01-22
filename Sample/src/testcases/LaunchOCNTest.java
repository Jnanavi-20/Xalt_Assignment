package testcases;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseTest;
import pages.DashboardPage;
import pages.GettingStarted;
import pages.LaunchOCN;


public class LaunchOCNTest extends baseTest {
	LaunchOCN LaunchOCN;
	DashboardPage dashboardpage;
GettingStarted getStart;
	
	@BeforeMethod
    public void setUpTest() {
        setUp();
        signIn("testuser@yopmail.com", "Test@123");
        System.out.println("Navigating to Dashboard Page...");
        dashboardpage= new DashboardPage(driver); 
       getStart= new GettingStarted(driver);
       LaunchOCN = new LaunchOCN(driver);
    }
	
	@Test
    public void testLaunchOCN() 
	{
		 System.out.println("Clicking 'Get Started' button...");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dashboardpage.clickGetstart();
		   System.out.println("Navigating to Launch OCN page...");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getStart.clickLaunchOCN();
		
		 System.out.println("Filling network details...");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LaunchOCN.enterNetworkName("Node Wallet");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LaunchOCN.enterWalletAddress("0x88fa61d2faA13aad8Fbd5B030372B4A159BbbDFb");
		LaunchOCN.ClickNXTBTN2();

	    System.out.println("Submitting Launch OCN form...");
		LaunchOCN.enterNodeID("Node-1234");
		LaunchOCN.enterpublicIP("255.255.3.67");
		LaunchOCN.ClickSelectNode2();
		LaunchOCN.SelectRPC2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 System.out.println("click on addnode...");
		LaunchOCN.ClickAddNode2();
		LaunchOCN.ClickLNext2();
		LaunchOCN.ClickSubmit2();
	}
	
	 @AfterMethod
	    public void tearDownTest() {
	        tearDown();
	    }
	

}
