package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.ConfigLoader;

import java.time.Duration;

public class DriverFactory {
//    public static WebDriver driver ;

    public static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver initializeDriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(ConfigLoader.getInstance().getBaseUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        DriverFactory.webDriverThreadLocal.set(driver);
        return driver;
    }

    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser){
            case "chrome":
               // System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
               // System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            case "edge":
               // System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            default: throw new IllegalStateException("INVALID BROWSER");

           }

        driver.get(ConfigLoader.getInstance().getBaseUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        DriverFactory.webDriverThreadLocal.set(driver);
        return driver;
    }

    public static WebDriver getDriverInstance(){
        return webDriverThreadLocal.get();
    }
}
