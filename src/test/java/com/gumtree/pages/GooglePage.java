package com.gumtree.pages;

import com.google.inject.Injector;
import com.gumtree.config.Environment;
import com.gumtree.helpers.Injection;
import cucumber.runtime.Env;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@ScenarioScoped
public class GooglePage extends BasePage {

    private GumtreePage gumtreePage;
    private String gumtreeUrl = Environment.getProperty("gumtreeURL");
    private String gumtreeTitle = Environment.getProperty("gumtree.homepage.title");
    private List<WebElement> googleResultsList;

    @Inject
    public GooglePage(Injection injection, GumtreePage gumtreePage) {
        super(injection);
        this.gumtreePage = gumtreePage;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void returnListOfElements() {
        googleResultsList = driver.findElements(By.xpath(".//*[@class='r']/a"));
    }

    public void gumtreeLinks() throws InterruptedException{
        String home =driver.getCurrentUrl();
        List<String> allUrls = googleResultsList.stream().map(el -> el.getAttribute("href")).collect(Collectors.toList());

        for(String linkText : allUrls) {
            if (linkText.contains(gumtreeUrl)) {
                driver.navigate().to(linkText);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                // ** Checks whether gumtree page title matches and results exists in gumtree
                if (gumtreePage.getTitle().equalsIgnoreCase(gumtreeTitle) && gumtreePage.doesResultsExistInPage()) {
                    System.out.println("SUCCESS");
                }
                driver.navigate().to(home);
            }
        }
    }
}
