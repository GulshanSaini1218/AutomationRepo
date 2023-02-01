package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LOCATORS {

    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("gulshansaini1210@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123");
        Thread.sleep(4000);
        driver.findElement(By.id("Login")).click();
        Thread.sleep(4000);
        //WebElement element = driver.findElement(By.linkText(""));
                // WebElement element = driver.findElement(By.tagName(//a[text()='Login'])));


        driver.close();
    }
}
