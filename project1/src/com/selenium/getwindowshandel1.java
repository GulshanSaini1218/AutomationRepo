package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getwindowshandel1 {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement windowsId = driver.findElement(By.id("openwindow"));
        windowsId.click();

        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);

        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow){
            System.out.println(s);

        }
        Thread.sleep(4000);
        driver.quit();
    }
}
