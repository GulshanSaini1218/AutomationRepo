package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class LogInPage extends WebTestBase{
    @FindBy(id = "CustomerEmail")
    WebElement emailTextbox;

    @FindBy(id = "CustomerPassword")
    WebElement passwordTextbox;

    @FindBy(xpath = "//input[@class='button is-primary']")
    WebElement signInBtn;

    public LogInPage() {

        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password){
        emailTextbox.sendKeys(email);
        passwordTextbox.sendKeys(password);
        signInBtn.click();

    }


}
