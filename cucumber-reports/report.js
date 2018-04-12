$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchGumtreeLinksOnGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user\nI would like to do a search on google for the cars in london\nSo that i can determine how many Gumtree links are available from the search results",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 5554875798,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search for cars in london on google and see how many gumtree links are available from the search results",
  "description": "",
  "id": ";search-for-cars-in-london-on-google-and-see-how-many-gumtree-links-are-available-from-the-search-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on Google",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for cars in london",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see a list of results",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I select each Gumtree link from the list to validate that each link has a minimum of 1 advert",
  "keyword": "And "
});
formatter.match({
  "location": "SearchForGumtreeLinksStepDef.iAmOnGoogle()"
});
formatter.result({
  "duration": 148436155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cars in london",
      "offset": 13
    }
  ],
  "location": "SearchForGumtreeLinksStepDef.searchOnGoogle(String)"
});
formatter.result({
  "duration": 2355044720,
  "status": "passed"
});
formatter.match({
  "location": "SearchForGumtreeLinksStepDef.resultsFromTheSearch()"
});
formatter.result({
  "duration": 38174910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 85
    }
  ],
  "location": "SearchForGumtreeLinksStepDef.checkGumtreeLinksFromTheSearch(int)"
});
formatter.result({
  "duration": 105325182643,
  "status": "passed"
});
formatter.after({
  "duration": 208748023,
  "status": "passed"
});
});