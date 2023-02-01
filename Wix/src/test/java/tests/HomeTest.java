package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    SearchResultPage searchResultPage;
    SkinCarePage skinCarePage;
    LogInPage loginPage;
    WelcomePage welcomePage;
    CollectionPage collectionPage;



    public HomeTest() {
        super();

    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
       searchResultPage = new SearchResultPage();
       skinCarePage = new SkinCarePage();
        loginPage = new LogInPage();
        welcomePage = new WelcomePage();
        collectionPage = new CollectionPage();


    }

   @Test(priority = 1)
    public void verfiySearchFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.closedSecondAdvertise();
        homePage.searchProduct(prop.getProperty("searchText"));
        homePage.searchClick();
        softAssert.assertEquals(searchResultPage.getTextOfSearchResultPage(),"SHOWING RESULTS FOR \"SKIN CARE\"","SHOWING RESULTS FOR \"SKIN CARE\" text should display");
        softAssert.assertAll();

    }

    @Test(priority = 2)
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

  /*@Test
    public  void verifyClickAndHoldFunctionality()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.closedSecondAdvertise();
        homePage.clickAndHoldExample();
        softAssert.assertAll();
    }*/


   @Test(priority = 4)
    public void verfiyGetWindowHandelsFunctionality()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.closedSecondAdvertise();
        homePage.scrollDownExample();
        homePage.windowHandelExample();
       softAssert.assertAll();
    }

   @Test(priority = 3)
   public void verifyMouseOverFunctionality()  {
       SoftAssert softAssert = new SoftAssert();
       homePage.closedFirstAdvertise();
       homePage.closedSecondAdvertise();
       homePage.moveOverExample();
       softAssert.assertAll();
   }


  @Test(priority = 6)
  public void verifyCookiesFunctionality(){
      homePage.closedFirstAdvertise();
      homePage.closedSecondAdvertise();
      homePage.addCookies();
      homePage.setCookies();

  }

 /*@Test(priority = 6)
 public void verfiyRadioButtonFunctionality()  {
     SoftAssert softAssert = new SoftAssert();
     homePage.closedFirstAdvertise();
     homePage.closedSecondAdvertise();
     homePage.searchProduct(prop.getProperty("searchText"));
     homePage.searchClick();
     softAssert.assertEquals(searchResultPage.getTextOfSearchResultPage(),"SHOWING RESULTS FOR \"SKIN CARE\"","SHOWING RESULTS FOR \"SKIN CARE\" text should display");
     skinCarePage.radioButtonExample();
     softAssert.assertAll();

 }*/

 @Test(priority = 5)
 public void verfiydropDownFunctionality()  {
     SoftAssert softAssert = new SoftAssert();
     homePage.closedFirstAdvertise();
     homePage.closedSecondAdvertise();
     homePage.searchProduct(prop.getProperty("searchText"));
     homePage.searchClick();
     softAssert.assertEquals(searchResultPage.getTextOfSearchResultPage(), "SHOWING RESULTS FOR \"SKIN CARE\"", "SHOWING RESULTS FOR \"SKIN CARE\" text should display");
     skinCarePage.dropDowmExample();
     System.out.println("DropDown selected");
     softAssert.assertAll();
 }




    @AfterMethod
    public void afterMethod() {
      driver.close();
    }
}
