package sample1;

import driverEngine.BaseClass;
import homepage.UseFullLinksInFooter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class MyntraPageTests extends BaseClass {

     public static WebDriver driver;
     public UseFullLinksInFooter useFullLinksInFooter;

    @BeforeClass
    public void startBrowser(){
        driver = startChromeDriver();
        useFullLinksInFooter = new UseFullLinksInFooter(driver);
    }

    @BeforeMethod
    public void loadMyntraPageForTest() {
        driver.get("https://www.myntra.com/");
        log("---> Myntra page loaded at Before test");
    }

    @AfterMethod
    public void afterTestMethod() throws InterruptedException {
        Thread.sleep(3000);
        log("---> test completed");
    }

    @Test()
    public void contactUsTest() {
        useFullLinksInFooter.clickOnContactUsLink();
    }

    @Test(priority = 3)
    public void faqTest() {
        useFullLinksInFooter.clickOnFAQLink();
    }


    @Test(priority = 1)
    public void careersPageTest() {
        useFullLinksInFooter.clickOnCareers();
    }

    @Test(priority = 2)
    public void whiteHatPageTest() {
        useFullLinksInFooter.clickOnWhiteHat();
    }

    @AfterClass
    public void quiteBrowser(){
        driver.quit();
        log("Browser closed .. Bye bye");
    }
}
