package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLink {
    public static void  main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        List<String> urlList = new ArrayList<>();

        for (WebElement e : elements){
            String url = e.getAttribute("href");
            urlList.add(url);
            checkBrokenLink(url);
        }

        urlList.parallelStream().forEach(e -> checkBrokenLink(e));

        Thread.sleep(3000);
        driver.close();
    }

    public static void checkBrokenLink(String linkUrl){
        try{
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400){
                System.out.println(linkUrl + "------" + httpURLConnection.getResponseCode() + "is broken link");
            }else{
                System.out.println(linkUrl + "------" + httpURLConnection.getResponseCode() + "" + httpURLConnection.getResponseMessage());
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
