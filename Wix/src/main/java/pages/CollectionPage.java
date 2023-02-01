package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class CollectionPage extends WebTestBase
{
    @FindBy(xpath = "//h1[text()='Collections']")
    WebElement collectionText;

    public CollectionPage() {

        PageFactory.initElements(driver,this);
    }

    public  String getTextOfCollectionPage(){

        return collectionText.getText();

    }

}
