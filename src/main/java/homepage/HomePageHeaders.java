package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageHeaders {

    static WebDriver driver;

    public HomePageHeaders(WebDriver driverObj) {
        driver = driverObj;
    }

    // TODO Add hover on Profile
    // TODO Add hover on MEN
    // TODO Add hover on Women

    public void hoverOnMenAndClickOnTShirtsPage() throws InterruptedException {

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();


        System.out.print("Hovered");
        Thread.sleep(15000);

        //action.moveToElement(menElement).moveToElement(driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a"))).click().build().perform();
    }


    public void clickOnBag() {
        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")).click();
    }

    public void clickOnWishlist() {
        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[1]/span[2]")).click();
    }
}
