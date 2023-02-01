package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;

    public WebTestBase() {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialization() {
        String broweserName = prop.getProperty("browser");
        if (broweserName.equals("chrome")) {
            System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir", "/src/main/resources/drivers/chromedriver.exe"));
            driver = new ChromeDriver();
        } else if (broweserName.equals("edge")) {
            System.setProperty("webdriver.edge.chrome", System.getProperty("user.dir", "/src/main/resources/drivers/msedgedriver.exe"));
            driver = new EdgeDriver();
        } else if (broweserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.chrome", System.getProperty("user.dir", "/src/main/resources/drivers/msedgedriver.exe"));
            driver = new FirefoxDriver();
        } else {
            System.out.println("please select correct browser name");
        }
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITLY_WAIT));
        driver.manage().getCookies();
        driver.manage().deleteAllCookies();
    }


}


