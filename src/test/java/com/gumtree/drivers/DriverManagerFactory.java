package com.gumtree.drivers;

public class DriverManagerFactory {
    public static DriverManager getManager(String driverType) {

        DriverManager driverManager = null;

        switch (driverType) {
            case "CHROME":
                driverManager = new ChromeDriverManager();
                break;
            case "FIREFOX":
                //driverManager = new FirefoxDriverManager();
                break;
            default:
                //driverManager = new SafariDriverManager();
                break;
        }
        return driverManager;
    }
}