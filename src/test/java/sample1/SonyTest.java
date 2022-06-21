package sample1;

import driverEngine.BaseClass;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class SonyTest extends BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public void startBrowser(){
        driver = startChromeDriver();
    }

    @Test(priority = 1)
    public void FarCry6() throws Exception {

        driver.get("https://www.playstation.com/en-in/games/far-cry-6/");

        By chooseEditionButton = By.xpath("//*[@id=\"jetstream-tertiary-nav\"]/div/div/div[2]/a/span");
        Assert.assertEquals(driver.findElement(chooseEditionButton).getText(), "Choose edition and buy");
        driver.findElement(chooseEditionButton).click();

        WebElement standardEdition = driver.findElement(By.xpath("//*[@id=\"buynow\"]/div/div/div/article[1]/div[2]/div[1]/h3"));
        Assert.assertEquals(standardEdition.getText(), "FAR CRY®6 Standard Edition PS4 & PS5", "Standard edition title mismatch");

        Thread.sleep(5000);

        WebElement priceOfStandardEdition = driver.findElement(By.xpath("//*[@id=\"buynow\"]/div/div/div/article[1]/div[2]/div[2]/div/div/label/div/span/span/span"));
        Assert.assertEquals(priceOfStandardEdition.getText(), "Rs 3,999");
        Thread.sleep(5000);
    }


    @Test(priority = 2)
    public void AssassinCreedValahella() {

        driver.get("https://www.playstation.com/en-in/games/assassins-creed-valhalla/");

        By chooseEditionButton = By.xpath("//*[@id=\"jetstream-tertiary-nav\"]/div/div/div[2]/a/span");
        Assert.assertEquals(driver.findElement(chooseEditionButton).getText(), "Choose edition and buy");
        driver.findElement(chooseEditionButton).click();

        WebElement standardEdition = driver.findElement(By.xpath("//*[@id=\"buynow\"]/div/div/div/article[1]/div[2]/div[1]/h3"));
        Assert.assertEquals(standardEdition.getText(), "Assassin's Creed Valhalla PS4 & PS5", "Standard edition title mismatch");

        WebElement priceOfStandardEdition = driver.findElement(By.xpath("//*[@id=\"buynow\"]/div/div/div/article[1]/div[2]/div[2]/div/div/label/div/span/span/span"));
        Assert.assertEquals(priceOfStandardEdition.getText(), "Rs 3,999");
    }

    @Test(priority = 3)
    public void AssassinCreedOdyssey() {

        driver.get("https://www.playstation.com/en-in/games/assassins-creed-odyssey/");

        By titleH1Text = By.xpath("//*[@id=\"gdk__content\"]/div/div[1]/div/div[1]/div[2]/div[1]/h1");
        Assert.assertEquals(driver.findElement(titleH1Text).getText(), "Assassin's Creed® Odyssey");

        WebElement priceOfStandardEdition = driver.findElement(By.xpath("//*[@id=\"gdk__content\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[3]/div/div/label/div/span/span/span"));
        Assert.assertEquals(priceOfStandardEdition.getText(), "Rs 3,999");
    }

    @Test(priority = 4)
    public void AssassinCreedOrigins() {

        driver.get("https://www.playstation.com/en-in/games/assassins-creed-origins/");

        By titleH1Text = By.xpath("//*[@id=\"gdk__content\"]/div/div[1]/div/div/div[2]/div[1]/div[1]/div/h1");
        Assert.assertEquals(driver.findElement(titleH1Text).getText(), "Assassin's Creed® Origins");

        WebElement priceOfStandardEdition = driver.findElement(By.xpath("//*[@id=\"gdk__content\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div/label/div/span/span/span"));
        Assert.assertEquals(priceOfStandardEdition.getText(), "Rs 3,999");
    }


    @AfterMethod
    public void screenShot(ITestResult result) {
        if (result.getStatus() != ITestResult.SUCCESS) {
            if (result.getThrowable().getMessage().startsWith("expected")) {
                driver.navigate().to("http://api.callmebot.com/text.php?source=web&user=@atomberg1991&text= Price Change noticed on " + result.getName());
            } else {
                driver.navigate().to("http://api.callmebot.com/text.php?source=web&user=@atomberg1991&text=Your PSN Scraper failed; " + result.getThrowable().getMessage());
            }
        }
    }

    @AfterClass
    public void quiteBrowser(){
        driver.quit();
        log("Browser closed .. Bye bye");
    }

}
