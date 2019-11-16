package Pages;

import Utils.ConfigReader;
import base.Base;
import base.Driver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AdmissionsPage extends Base {
    private static By admissions=By.id ("menu-item-107");
    private static By applyNow=By.xpath("//*[@id=\"menu-item-2264\"]/a/span");
    private static WebDriver driver=driver ();
    private static String applyNowPageUrl= "https://apply.na.edu/admission";


    public static WebDriver driver(){
        WebDriver driver= Driver.getDriver ();
        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public static void visitHomePage (){
        driver.get (ConfigReader.getProperty ("url"));

        driver.findElement (admissions).click ();
    }

    public static void clickApplyNow (){


        driver.findElement (applyNow).click ();
    }

    public static void applypage_page_will_displayed (){
        Assert.assertTrue (driver.getCurrentUrl ().equalsIgnoreCase (applyNowPageUrl));


    }

    public static void mouseOver(){
        Actions actions = new Actions(driver);
        WebElement mouseOver = driver.findElement(By.linkText("#page-top"));
        actions.moveToElement(mouseOver).perform();
    }

}
