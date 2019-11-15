package Pages;

import Utils.ConfigReader;
import base.Base;
import base.Driver;

public class HomePage extends Base {
    public static void main(String[] args) {
        Driver.getDriver ().get (ConfigReader.getProperty ("url"));
    }
}
