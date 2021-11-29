package sample1;

import driverEngine.Weekbaseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assessmentweek extends Weekbaseclass {
   static WebDriver driver;

    @BeforeMethod
    public static void driverengine(){
    driver= startchdriver();
    }

    @Test
    public static void launchbrowser(){
        driver.get("http://www.myntra.com");
        log("Url launched successfully");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")).click();
        String str=driver.getCurrentUrl();
        log("str");
        Assert.assertEquals("https://www.myntra.com/shop/women","https://www.myntra.com/shop/women");
    }
    @Test
    public static void nextwindows(){
        driver.get("http://www.myntra.com");
        log("nextwindow launches successfully");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a")).click();
            String str1=driver.getCurrentUrl();
            log("str1");
            Assert.assertEquals("https://www.myntra.com/shop/kids","https://www.myntra.com/shop/kids");
        }
    }

    @AfterMethod
    public static void closebrowser(){
        driver.close();
        log("browser closed successfully");
    }

}
