package com.gumtree.helpers;

import com.gumtree.config.Environment;
import com.gumtree.drivers.DriverManager;
import com.gumtree.drivers.DriverManagerFactory;
import com.gumtree.drivers.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;
import java.io.IOException;

public class Hooks{
    private String baseUrl = Environment.getProperty("googleURL");

    @Inject
    private Injection injection;

    @Before
    public void beforeScenario() throws IOException {
        injection.getDriver().get(baseUrl);
    }

    @After
    public void afterScenario() {
        injection.getDriver().close();
        injection.getDriver().quit();
    }
}
