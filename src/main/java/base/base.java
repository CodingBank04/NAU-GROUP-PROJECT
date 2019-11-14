package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class base {
    public static Properties prop;

    public static WebDriver driver;

    public static WebDriver getDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/base/global.properties");
        prop.load(fis);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;
    }

}
