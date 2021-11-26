package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {

    static WebDriver driver;

    public static WebDriver startFirefoxDriver(){
        driver = new FirefoxDriver();
        log("Firefox driver started successfully");
        return driver;
    }

    public static WebDriver startChromeDriver() {
        final String driverPath = System.getProperty("user.dir");

        if (System.getProperty("os.name").startsWith("Mac")) {
            System.setProperty("webdriver.chrome.driver", driverPath + "/drivers/chromedriver");
        } else if(System.getProperty("os.name").startsWith("Windows")) {
            // TODO
        }

        driver = new ChromeDriver();
        log("Chrome driver started successfully");
        return driver;
    }

    /**
     * This method is used to Log messages in std out
     * @param messageToLog message you wanted to log
     */
    public static void log(final String messageToLog) {
        Reporter.log(messageToLog, true);
    }
}
