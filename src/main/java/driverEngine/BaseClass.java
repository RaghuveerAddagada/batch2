package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    static WebDriver driver;

    public static WebDriver startFirefoxDriver(){
        //System.setProperty("webdriver.gecko.driver", "/Users/addagadaraghuveer/Documents/workspace/sidekicks/ui-automation/drivers");
        driver = new FirefoxDriver();
        System.out.println("Firefox driver started successfully");
        return driver;
    }

    public static WebDriver startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/addagadaraghuveer/Documents/workspace/sidekicks/ui-automation/drivers/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Chrome driver started successfully");
        return driver;
    }
}
