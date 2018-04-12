package com.gumtree.helpers;

import com.gumtree.config.Environment;
import com.gumtree.drivers.DriverManagerFactory;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class Injection {
    private WebDriver driver = DriverManagerFactory.getManager(Environment.getProperty("Browser")).getDriver();

    public WebDriver getDriver() {
        return driver;
    }
}
