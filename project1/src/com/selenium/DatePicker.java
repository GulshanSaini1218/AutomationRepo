package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // List<WebElement> tableColumn = driver.findElements(By.xpath("//table[@id='product']//following::tr/th"));//how to fetch values within a table
        // System.out.println(tableColumn.size());

        //  List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='product']//following::tr/td"));
        //  System.out.println(tableRows.size());
        //  for (WebElement e : tableRows) {
        //     System.out.println(e.getText());

        driver.findElement(By.id("datepicker1"));
        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td/a"));

        for(WebElement e : elements){

        }




    }
}
