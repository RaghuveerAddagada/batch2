package homepage;

import driverEngine.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class UseFullLinksInFooter {

    WebDriver driver;
    BaseClass webDriverBase;

    // THis is Constructor and we are initialising driver here
    public UseFullLinksInFooter(WebDriver driverObject) {
        driver = driverObject;
        webDriverBase = new BaseClass();
    }

    public void clickOnContactUsLink() throws InterruptedException {
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[1]"));

        webDriverBase.scrollToElement(webElement);
        webDriverBase.clickOnElement(webElement);
        Reporter.log("clicked on contact us ", true);
    }

    public void clickOnFAQLink() {

        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[2]"));
        webDriverBase.scrollToElement(webElement);
        webDriverBase.clickOnElement(webElement);
        Reporter.log("clicked on FAQ", true);
    }

    public void clickOnCareers() {
        driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[11]")).click();



        Reporter.log("clicked on Careers page", true);
    }

    public void clickOnWhiteHat() {
        driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[9]")).click();
    }
}
