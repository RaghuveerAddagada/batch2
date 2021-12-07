package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriver startFirefoxDriver() {
        driver = new FirefoxDriver();
        log("Firefox driver started successfully");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver startChromeDriver() {
        final String driverPath = System.getProperty("user.dir");

        if (System.getProperty("os.name").startsWith("Mac")) {
            System.setProperty("webdriver.chrome.driver", driverPath + "/drivers/chromedriver");
        } else if (System.getProperty("os.name").startsWith("Windows")) {
            // TODO
        }

        driver = new ChromeDriver();
        log("Chrome driver started successfully");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * This method is used to Log messages in std out
     *
     * @param messageToLog message you wanted to log
     */
    public static void log(final String messageToLog) {
        Reporter.log(messageToLog, true);
    }


    public void clickOnElement(final WebElement element) {
        log("---> webdriver performing click");
        element.click();
    }

    public void scrollToElement(final WebElement element) {
        log("---> webdriver performing scroll to element");
        Actions a = new Actions(driver);
        a.moveToElement(element);
        a.perform();
    }
}
