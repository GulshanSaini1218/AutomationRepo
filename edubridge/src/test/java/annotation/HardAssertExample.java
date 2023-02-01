package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertExample {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyLoginWithInvalidUserNamePassword(){
           driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
           driver.findElement(By.id("login1")).sendKeys("abcd123");
           driver.findElement(By.id("password")).sendKeys("12345");
           driver.findElement(By.name("proceed")).click();

        System.out.println("hiii!!");

           String errorMessage = driver.findElement(By.xpath("//b[text()='Temporary Issue. Please try again later. [#5002]']")).getText();
           System.out.println("Hello Everyone");
           Assert.assertEquals(errorMessage,"Temporary Issue. Please try again later. [#5002]","Text should Match");
           System.out.println("How are you?");
           Assert.assertEquals(driver.getTitle(),"Rediffmail", "Title should match");
           System.out.println("I am Fine");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
