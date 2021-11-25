package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    static WebDriver driver;

    public static WebDriver startFirefoxDriver(){
        driver = new FirefoxDriver();
        System.out.println("Firefox driver started successfully");
        return driver;
    }

    public static WebDriver startChromeDriver() {
        final String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath +"/drivers/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Chrome driver started successfully");
        return driver;
    }
}
