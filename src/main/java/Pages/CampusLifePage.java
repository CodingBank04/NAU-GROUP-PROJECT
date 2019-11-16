package Pages;

import Utils.ConfigReader;
import base.Base;
import base.Driver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CampusLifePage extends Base {

        private static By campusLife=By.xpath("//*[@id=\"menu-item-4877\"]/a/span");
        private static WebDriver driver=driver ();




        public static WebDriver driver(){
            WebDriver driver= Driver.getDriver ();
            driver.manage ().window ().maximize ();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver;
        }

        public static void navigateToNAU (){
            driver.get (ConfigReader.getProperty ("url"));

            driver.findElement (campusLife).click ();
        }

        public static void mouseOverCampusLife () throws InterruptedException {
            WebDriver dr = new ChromeDriver();
            dr.get("url");
            Actions actions = new Actions(driver());

            driver.findElement(campusLife);
            actions.moveToElement(dr.findElement(campusLife));
            try {
                Thread.sleep(6000);
                actions.click().build().perform();
            } catch (Exception e){
                System.out.println("print e");
            }
        }

            //Actions .movetoElement(driver.findElement......).build .perform


        public static void dropDownMenuDisplayed (){
            Assert.assertTrue (driver.getCurrentUrl ().equalsIgnoreCase ("url"));


        }




    }
