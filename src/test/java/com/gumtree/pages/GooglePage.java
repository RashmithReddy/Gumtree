package com.gumtree.pages;

import com.gumtree.helpers.Injection;
import cucumber.runtime.java.guice.ScenarioScoped;

import javax.inject.Inject;

@ScenarioScoped
public class GooglePage extends BasePage{

    @Inject
    public GooglePage(Injection injection) {
        super(injection);
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
