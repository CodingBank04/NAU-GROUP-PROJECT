package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String keyName) {
        try {
            FileInputStream input = new FileInputStream("global.properties");

            Properties configFile = new Properties();
            configFile.load(input);
            input.close();
            return configFile.getProperty(keyName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}




