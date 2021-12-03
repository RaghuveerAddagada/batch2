package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class UseFullLinksInFooter {

    WebDriver driver;

    // THis is Constructor and we are initialising driver here
    public UseFullLinksInFooter(WebDriver driverObject) {
        driver = driverObject;
    }

    public void clickOnContactUsLink() {
        driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[2]/a[1]")).click();
        Reporter.log("clicked on contact us ", true);
    }

    public void clickOnFAQLink() {
        // TODO add code
    }

    public void careers() {
        // TODO add code
    }

    public void whiteHat() {

    }
}
