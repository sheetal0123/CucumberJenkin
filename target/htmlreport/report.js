$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("yahoo.feature");
formatter.feature({
  "id": "yahoo-search-results",
  "tags": [
    {
      "name": "@yahoo",
      "line": 1
    }
  ],
  "description": "In order to test Yahoo search results\r\nAs a user\r\nI want to verify search results count",
  "name": "Yahoo Search Results",
  "keyword": "Feature",
  "line": 2
});
formatter.scenarioOutline({
  "id": "yahoo-search-results;yahoo-srp",
  "description": "",
  "name": "Yahoo SRP",
  "keyword": "Scenario Outline",
  "line": 7,
  "type": "scenario_outline"
});
formatter.step({
  "name": "user is on application home page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "user search for \"\u003cKeyword\u003e\"",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "user verify results",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "user close the application",
  "keyword": "And ",
  "line": 11
});
formatter.examples({
  "id": "yahoo-search-results;yahoo-srp;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 13,
  "rows": [
    {
      "id": "yahoo-search-results;yahoo-srp;;1",
      "cells": [
        "Keyword"
      ],
      "line": 14
    },
    {
      "id": "yahoo-search-results;yahoo-srp;;2",
      "cells": [
        "seleniumhq org"
      ],
      "line": 15
    }
  ]
});
formatter.before({
  "duration": 6146237,
  "status": "passed"
});
formatter.scenario({
  "id": "yahoo-search-results;yahoo-srp;;2",
  "tags": [
    {
      "name": "@yahoo",
      "line": 1
    }
  ],
  "description": "",
  "name": "Yahoo SRP",
  "keyword": "Scenario Outline",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "user is on application home page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "user search for \"seleniumhq org\"",
  "keyword": "When ",
  "line": 9,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "user verify results",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "user close the application",
  "keyword": "And ",
  "line": 11
});
formatter.match({
  "location": "StepFile.user_is_on_application_home_page()"
});
formatter.result({
  "duration": 13688118200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "seleniumhq org",
      "offset": 17
    }
  ],
  "location": "StepFile.user_search_for(String)"
});
formatter.result({
  "duration": 12946707516,
  "status": "passed"
});
formatter.match({
  "location": "StepFile.user_verify_results()"
});
formatter.result({
  "duration": 7732895673,
  "status": "passed"
});
formatter.match({
  "location": "StepFile.user_close_the_application()"
});
formatter.result({
  "duration": 1458522089,
  "status": "passed"
});
formatter.after({
  "duration": 36778,
  "status": "passed"
});
});