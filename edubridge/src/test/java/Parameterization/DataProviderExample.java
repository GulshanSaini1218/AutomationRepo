package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    public WebDriver driver;
    @DataProvider(name = "test-data")
    public Object[][] dataProviderFunction(){
        return new Object[][]{
                {"gulshansaini1210@gmail.com", "abc@1234"},
                {"gulshan", "abc@1234"},
                {"abcd234@gmail.com", "123"},
                {"ABCD", "123"}
        };
    }
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

    }
    @Test(dataProvider = "test-data")
    public void verifyLoginWithInvalidUsernamePassword(String invalidUsername, String invalidPassword){
        driver.findElement(By.id("login1")).sendKeys(invalidUsername);
        driver.findElement(By.id("password")).sendKeys(invalidPassword);
        driver.findElement(By.name("proceed")).click();
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
