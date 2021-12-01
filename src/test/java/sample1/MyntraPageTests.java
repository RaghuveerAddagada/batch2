package sample1;

import driverEngine.BaseClass;
import homepage.HomePageHeaders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyntraPageTests extends BaseClass {

     public static WebDriver driver;

     public static HomePageHeaders homePageHeaders;

    @BeforeClass
    public void startFirefox(){

        driver = startFirefoxDriver();
        homePageHeaders= new HomePageHeaders(driver);
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

    @Test
    public void frameTest1() throws InterruptedException {
        driver.get("https://www.myntra.com/");
        log("Myntra page loaded");

        homePageHeaders.hoverOnMenAndClickOnTShirtsPage();
    }

    @AfterClass
    public void quiteBrowser(){
        driver.quit();
        log("Browser closed .. Bye bye");
    }

}
