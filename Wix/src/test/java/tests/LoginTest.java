package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CollectionPage;
import pages.HomePage;
import pages.LogInPage;
import pages.WelcomePage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    HomePage homePage;
    LogInPage loginPage;
    WelcomePage welcomePage;
    CollectionPage collectionPage;


    public LoginTest() {
        super();

    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LogInPage();
        welcomePage = new WelcomePage();
        collectionPage = new CollectionPage();

    }

    @Test
    public void verfiyLoginWithValidCredential() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.closedSecondAdvertise();
        homePage.loginClick();
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        softAssert.assertEquals(welcomePage.getTextOfWelcomePage(),"WELCOME GULSHAN","WELCOME GULSHAN text should display");
        welcomePage.ContinueShopingClick();
        softAssert.assertEquals(collectionPage.getTextOfCollectionPage(),"COLLECTIONS","COLLECTIONS text should display");
        softAssert.assertAll();

    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
