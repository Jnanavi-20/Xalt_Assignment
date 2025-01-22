package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseTest;
import pages.DashboardPage;
import pages.SignInPage;

public class SignOutTest extends baseTest {
	SignInPage signInPage;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setUpTest() {
        setUp();
        signInPage = new SignInPage(driver);
        dashboardPage = new DashboardPage(driver);
        // Precondition: Sign In
        signInPage.enterEmail("testuser@example.com");
        signInPage.enterPassword("Test@1234");
        signInPage.clickSignIn();
    }

    @Test
    public void testSignOut() {
        dashboardPage.clickSignOut();
        // Assert success (e.g., redirect to login page)
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }

}
