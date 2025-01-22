package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseTest;
import pages.SignInPage;

public class SignInTest extends baseTest {
	
	SignInPage signInPage;

    @BeforeMethod
    public void setUpTest() {
        setUp();
        signInPage = new SignInPage(driver);
    }

    @Test
    public void testSignInSuccess() {
    	signInPage.SignIn();
    	signInPage.SignInLink();
        signInPage.enterEmail("testuser@yopmail.com");
        signInPage.enterPassword("Test@123");
        signInPage.clickSignIn();
        // Assert success
       Assert.assertTrue(driver.getCurrentUrl().contains("https://xaltsocnportal.web.app/"));
    }

    @Test
    public void testSignInFailureInvalidCredentials() {
    	signInPage.SignIn();
    	signInPage.SignInLink();
        signInPage.enterEmail("testuser@yopmail.com");
        signInPage.enterPassword("Test@12345");// wrong password
        signInPage.clickSignIn();
       // Assert failure
        Assert.assertTrue(driver.getCurrentUrl().contains("https://xaltsocnportal.web.app/signin"));
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
