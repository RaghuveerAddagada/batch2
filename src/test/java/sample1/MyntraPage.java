asdfghtyuiO package sample1;

import driverEngine.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyntraPage extends BaseClass {

    //1. First Chrome browser launch
    //2. My test case
    //3. Close browser
    static WebDriver driver;

    @BeforeClass
    public static void startFirefox(){
        driver = startChromeDriver();
    }

    @Test
    public static void myntraTest1() {

        driver.get("https://www.myntra.com/");
        System.out.println("Myntra page loaded");

        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
        System.out.println("Clicked on men category");

        System.out.println(driver.getCurrentUrl());
    }

    @AfterClass
    public static void quiteBrowser(){
        driver.quit();
        System.out.println("Browser closed .. Bye bye");
    }

}
