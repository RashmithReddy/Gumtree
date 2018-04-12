package com.gumtree.stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchForGumtreeLinksStepDef {

    @Given("^I am on Google$")
    public void iAmOnGoogle() throws Throwable {

    }

    @When("^I search for (.*)$")
    public void searchOnGoogle(String searchString) throws Throwable {

    }

    @Then("^I should see a list of results$")
    public void resultsFromTheSearch() throws Throwable {
    }

    @Then("^I select each Gumtree link from the list to validate that each link has a minimum of (\\d+) advert$")
    public void checkGumtreeLinksFromTheSearch(int arg1) throws Throwable {

    }
}
