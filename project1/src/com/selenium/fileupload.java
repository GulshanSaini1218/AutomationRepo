package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user\\Downloads\\WhatsApp Image 2022-12-16 at 21.24.16.jpeg");
        driver.findElement(By.id("file-submit")).click();
        String element = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        if (element.equals("File Uploaded!")){
            System.out.println("The file is successfully uploaded");
        }
        else{
            System.out.println("The file is not uploaded successfully");
        }
        Thread.sleep(4000);
        driver.quit();
    }

    }
