package driverEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Weekbaseclass {
  static WebDriver driver;

    public static WebDriver startchdriver(){
       final String str= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", str +"\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        log("Chrome driver launched successfully");
        return driver;
    }
    public static void log(final String messageToLog){
        Reporter.log("Message logged",true);
    }
}
