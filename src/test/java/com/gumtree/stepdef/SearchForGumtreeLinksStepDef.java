package com.gumtree.stepdef;


import com.gumtree.config.Environment;
import com.gumtree.pages.GooglePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.inject.Inject;

public class SearchForGumtreeLinksStepDef {

    @Inject
    GooglePage gp;

    @Given("^I am on Google$")
    public void iAmOnGoogle() throws Throwable {
        Assert.assertEquals(Environment.getProperty("google.homepage.title"),gp.getTitle());
    }

    @When("^I search for (.*)$")
    public void searchOnGoogle(String searchString) throws Throwable {
        gp.searchString(searchString);

    }

    @Then("^I should see a list of results$")
    public void resultsFromTheSearch() throws Throwable {
        gp.returnListOfElements();

    }

    @Then("^I select each Gumtree link from the list to validate that each link has a minimum of (\\d+) advert$")
    public void checkGumtreeLinksFromTheSearch(int arg1) throws Throwable {
        gp.gumtreeLinks();
    }
}
