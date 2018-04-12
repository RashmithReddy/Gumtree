package com.gumtree.drivers;

import com.gumtree.config.Environment;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeDriverManager extends DriverManager {
    private ChromeDriverService chService;

    @Override
    public void startService() {
        if (null == chService) {
            try {
                String os = System.getProperty("os.name").toLowerCase();
                String driverPath="";
                if (os.indexOf("win") >= 0) {
                    driverPath = Environment.getProperty("chromeDriverPathWindows");
                } else if(os.indexOf("mac") >= 0) {
                    driverPath = Environment.getProperty("chromeDriverPathMac");
                }
                chService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(driverPath))
                        .usingAnyFreePort()
                        .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        driver = new ChromeDriver(chService, options);
    }
}

