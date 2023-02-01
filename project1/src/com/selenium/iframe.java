package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.switchTo().frame("courses-iframe");
        WebElement name = driver.findElement(By.xpath("//a[text()='Sign In']"));
        name.click();
        WebElement course = driver.findElement(By.xpath("//a[text()='ALL COURSES']"));
        course.click();
        Thread.sleep(4000);
        driver.quit();

    }
}
