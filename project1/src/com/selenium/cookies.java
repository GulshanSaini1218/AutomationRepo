package com.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class cookies {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
       System.out.println(driver.manage().getCookies());  //get cookies

       Cookie cok = new Cookie("Hello", "World"); //Add cookies
        driver.manage().addCookie(cok);

        Set<Cookie> cookies = driver.manage().getCookies();  //set cookies

        for (Cookie c : cookies){
            System.out.println(c);
        }

       System.out.println("------------------------------------"); //delete cookies by name
        driver.manage().deleteCookieNamed("Hello");

        System.out.println("------------------------------------"); //delete all cookies
        driver.manage().deleteAllCookies();


        System.out.println("-------------Delete cookie check-------------------"); //delete all cookies
        Set<Cookie> cookies2 = driver.manage().getCookies();  //get cookies

        for (Cookie c : cookies2){
            System.out.println(c);
        }


        driver.quit();
    }
}
