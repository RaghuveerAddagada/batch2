package homepage;

import driverEngine.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class UseFullLinksInFooter {

    WebDriver driver;
    BaseClass webDriverBase;
    Properties locators;
    Properties credentials;


    // THis is Constructor and we are initialising driver here
    public UseFullLinksInFooter(WebDriver driverObject) {
        driver = driverObject;
        webDriverBase = new BaseClass();
        locators = webDriverBase.readLocators();
        credentials = webDriverBase.readCredentials();
    }

    public void clickOnContactUsLink() {
        WebElement webElement = driver.findElement(By.xpath(locators.getProperty("xpath_contactUs")));
        webDriverBase.scrollToElement(webElement);
        webDriverBase.clickOnElement(webElement);
        Reporter.log("clicked on contact us ", true);
    }

    public void clickOnFAQLink() {
        WebElement webElement = driver.findElement(By.xpath(locators.getProperty("xpath_faq")));
        webDriverBase.scrollToElement(webElement);
        webDriverBase.clickOnElement(webElement);
        Reporter.log("clicked on FAQ", true);
    }

    public void clickOnCareers() {
        WebElement el = driver.findElement(By.xpath(locators.getProperty("xpath_careers")));
        webDriverBase.scrollToElement(el);
        webDriverBase.clickOnElement(el);
        Reporter.log("clicked on Careers page link", true);
    }

    public void clickOnWhiteHat() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators.getProperty("xpath_Whitehat"))));
        webDriverBase.scrollToElement(element);
        webDriverBase.clickOnElement(element);
        Reporter.log("clicked on WhiteHat link", true);
    }
}
