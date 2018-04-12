package com.gumtree.drivers;


import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class DriverManager {
    protected WebDriver driver;
    protected abstract void startService();
    protected abstract void stopService();
    protected abstract void createDriver();


    public WebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }

    public void switchWindow(String windowHandle) throws IOException {
        getDriver().switchTo().window(windowHandle);
    }
}

