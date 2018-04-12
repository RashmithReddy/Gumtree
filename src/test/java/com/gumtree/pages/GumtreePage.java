package com.gumtree.pages;

import com.gumtree.helpers.Injection;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.inject.Inject;
import java.util.List;

@ScenarioScoped
public class GumtreePage extends BasePage {

    @Inject
    public GumtreePage(Injection injection) {
        super(injection);
    }

    public boolean doesResultsExistInPage() {
        List<WebElement> gumtreeList = driver.findElements(By.xpath(".//*[@class='listing-link']"));
        boolean retVal = false;
        System.out.println(gumtreeList);
        if (gumtreeList.size() > 0) {
            retVal = true;
        }

        return retVal;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
