package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class e1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium-apps.doselect.in/to-do-list/");




        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@name='ListItem']"));
        element.sendKeys("TaskOne");
        element.sendKeys("TaskTwo");
        element.sendKeys("TaskThree");
        WebElement element1 = driver.findElement(By.id("button"));
        element1.click();

    }

}
