package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class exampl1 {
    public static void  selectDropDown(WebElement element, String dropDown){
        Select select = new Select(element);
        select.selectByVisibleText(dropDown);
    }
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");

        driver.manage().window().maximize();

        WebElement firstNameTextBox = driver.findElement(By.name("First_Name"));
        firstNameTextBox.sendKeys("Gulshan");
        WebElement LastNameTextBox = driver.findElement(By.name("Last_Name"));
        LastNameTextBox.sendKeys("Saini");

        WebElement selectBirthDay = driver.findElement(By.id("Birthday_Day"));
        WebElement selectBirthMonth = driver.findElement(By.id("Birthday_Month"));
        WebElement selectBirthYear = driver.findElement(By.id("Birthday_Year"));

        selectDropDown(selectBirthDay,"12");
        selectDropDown(selectBirthMonth,"june");
        selectDropDown(selectBirthYear,"2001");



        WebElement EmailIdTextBox = driver.findElement(By.name("Email_Id"));
        EmailIdTextBox.sendKeys("gulshansaini1210@gmail.com");
        WebElement MobileNumber = driver.findElement(By.name("Mobile_Number"));
        MobileNumber.sendKeys("7718951301");

        WebElement Gender = driver.findElement(By.name("//input[@name='Female']"));



        /*List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
        System.out.println(elements);*/
        Thread.sleep(4000);



        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", firstNameTextBox);
        driver.close();


    }
}
