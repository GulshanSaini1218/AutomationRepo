package Parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    public WebDriver driver;
    @DataProvider(name = "excel-data")
    public Object[][] getDataProvider() throws Exception {
        Object[][] arrobj= getExcelData("C:\\Users\\user\\Desktop\\testdata.xlsx", "testsheet1");
        return arrobj;
    }
    public String[][] getExcelData(String fileName, String sheetName) throws Exception {
        String[][] data= null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRows-1][noOfCols];

        for (int i=1; i<noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "excel-data")
    public void courseSearch(String courseName, String cityName){
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(courseName+" "+cityName);
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.close();

    }
}
