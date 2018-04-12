package com.gumtree.pages;

import com.gumtree.config.Environment;
import com.gumtree.helpers.Injection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.inject.Inject;

public class BasePage {

    protected Injection injection;
    protected WebDriver driver;

    public BasePage(Injection injection) {
        this.injection = injection;
        this.driver = injection.getDriver();
    }

    public WebElement webElement(By by) {
        return driver.findElement(by);
    }

    public WebElement byId(String sr) {
        return driver.findElement(By.id(sr));
    }


    public void searchString(String search) {
        switch (search) {
            case "cars in london":
                WebElement element =  driver.findElement(By.id(Environment.getProperty("google.search.textbox.id")));
                element.sendKeys(search);
                element.sendKeys(Keys.TAB);

                driver.findElement(By.name("btnK")).click();
                break;

        }
    }
}
