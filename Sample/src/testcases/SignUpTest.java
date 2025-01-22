package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseTest;
import pages.SignUpPage;

public class SignUpTest extends baseTest{
	 SignUpPage signUpPage;

	    @BeforeMethod
	    public void setUpTest() {
	        setUp();
	        signUpPage = new SignUpPage(driver);
	    }

	    @Test
	    public void testSignUpSuccess() {
	    	signUpPage.SignUpLink();
	        signUpPage.enterEmail("testuser@example.com");
	        signUpPage.enterPassword("Test@1234");
	        signUpPage.ConfirmPassword("Test@1234");
	        signUpPage.clickSignUp();
	        // Assert success (e.g., redirect to dashboard)
	        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	    }

	    @Test
	    public void testSignUpFailureInvalidEmail() {
	        signUpPage.enterEmail("invalidemail");
	        signUpPage.enterPassword("Test@1234");
	        signUpPage.clickSignUp();
	        // Assert failure (e.g., error message displayed)
	        Assert.assertTrue(driver.getPageSource().contains("Invalid email address"));
	    }

	    @AfterMethod
	    public void tearDownTest() {
	        tearDown();
	    }

}
