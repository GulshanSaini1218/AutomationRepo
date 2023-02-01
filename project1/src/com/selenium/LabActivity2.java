package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class LabActivity2 {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[text()='    click   ']"));
        element.click();


        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if(!parentWindows.contentEquals(s)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
            }
            driver.switchTo().window(parentWindows);
            System.out.println(driver.getTitle());

        }

        driver.quit();

    }
}
