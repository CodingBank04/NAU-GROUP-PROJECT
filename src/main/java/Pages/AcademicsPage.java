package Pages;
import base.Driver;
import Utils.ConfigReader;
import base.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AcademicsPage extends Base {
    private static By academics=By.id ("menu-item-645");
    private static WebDriver driver=driver ();
    private static String academicsPageUrl= "http://qatest2119.na.edu/academics/";
    private static String timeStamp = new SimpleDateFormat ("yyyy_MM_dd__hh_mm_ss").format(new Date ());


    public static WebDriver driver(){
     WebDriver driver= Driver.getDriver ();
    driver.manage ().window ().maximize ();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    return driver;
    }

    public static void go_To_HomePage (){
       driver.get (ConfigReader.getProperty ("url"));

        driver.findElement (academics).click ();
    }

    public static void click_academics (){


        driver.findElement (academics).click ();
    }

    public static void Academics_page_will_displayed (){
        Assert.assertTrue (driver.getCurrentUrl ().equalsIgnoreCase (academicsPageUrl));


    }

    public static void screenShot(String TestName) throws IOException {

        String fileLocation= "src\\main\\CommonFile\\AcademicsScreenshots\\ScreenShots";
        String fileName=TestName+" "+timeStamp;
        String fileExtension=".png";

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(fileLocation+fileName+fileExtension));
    }


}
