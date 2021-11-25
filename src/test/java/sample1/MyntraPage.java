package sample1;

import driverEngine.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class MyntraPage extends BaseClass {

    static WebDriver driver;

    @BeforeClass
    public static void startFirefox(){
        driver = startChromeDriver();
    }

    @Test
    public static void myntraTest1() {

        driver.get("https://www.myntra.com/");
        log("Myntra page loaded");

        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
        log("Clicked on men category");

        log(driver.getCurrentUrl());
    }

    @AfterClass
    public static void quiteBrowser(){
        driver.quit();
        log("Browser closed .. Bye bye");
    }

}
