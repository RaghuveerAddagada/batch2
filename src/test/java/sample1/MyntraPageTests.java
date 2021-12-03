package sample1;

import driverEngine.BaseClass;
import abcd.HomePageHeaders;
import homepage.UseFullLinksInFooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyntraPageTests extends BaseClass {

     public static WebDriver driver;

     public UseFullLinksInFooter useFullLinksInFooter;

    @BeforeClass
    public void startFirefox(){
        driver = startFirefoxDriver();
        useFullLinksInFooter = new UseFullLinksInFooter(driver);
    }

    @Test
    public void contactUsTest() throws InterruptedException {
        driver.get("https://www.myntra.com/");
        log("Myntra page loaded");

        useFullLinksInFooter.clickOnContactUsLink();

        useFullLinksInFooter.clickOnFAQLink();

        Thread.sleep(10000);
    }



    //@Test
    public void myntraTest1() {

        driver.get("https://www.myntra.com/");
        log("Myntra page loaded");

        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
        log("Clicked on men category");

        log("Asserting the page Url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.myntra.com/shop/men", "Url Mismatch at mens page");
    }


    @AfterClass
    public void quiteBrowser(){
        driver.quit();
        log("Browser closed .. Bye bye");
    }

}
