package com.gumtree.pages;

import com.gumtree.helpers.Injection;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected Injection injection;
    protected WebDriver driver;

    public BasePage(Injection injection) {
        this.injection = injection;
        this.driver = injection.getDriver();
    }
}
