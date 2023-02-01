package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {
    public WebDriver driver;
    String InvalidUsername = "Abcd@123";
    String InvalidPassword = "a12345";
    String ValidUsername = "pqrst@1234";
    String ValidPassword = "987727d";

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Parameters({"InvalidUsername", "InvalidPassword"} )
    @Test
    public void verifyLoginWithInvalidUserNameInvalidPassword(String InvalidUsername, String InvalidPassword ) {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(InvalidUsername);
        driver.findElement(By.id("password")).sendKeys(InvalidPassword);
        driver.findElement(By.name("proceed")).click();
    }

    @Parameters({"InvalidUsername", "ValidPassword "})
    @Test
    public void verifyLoginWithInvalidUserNameValidPassword(String InvalidUsername, String ValidPassword ) {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(InvalidUsername);
        driver.findElement(By.id("password")).sendKeys(ValidPassword);
        driver.findElement(By.name("proceed")).click();
    }
    @Parameters({"ValidUsername", "InvalidPassword " })
    @Test
    public void verifyLoginWithValidUserNameInPassword(String ValidUsername, String InvalidPassword ) {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(ValidUsername);
        driver.findElement(By.id("password")).sendKeys(InvalidPassword);
        driver.findElement(By.name("proceed")).click();
    }
    @Parameters({"ValidUsername", "ValidPassword"})
    @Test
    public void verifyLoginWithValidUserNameValidPassword(String ValidUsername, String ValidPassword  ) {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(ValidUsername);
        driver.findElement(By.id("password")).sendKeys(ValidPassword);
        driver.findElement(By.name("proceed")).click();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
