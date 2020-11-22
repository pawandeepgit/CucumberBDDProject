$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfeature.feature");
formatter.feature({
  "line": 1,
  "name": "My first feature definition",
  "description": "",
  "id": "my-first-feature-definition",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7117220400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "My first Background",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "this is my first given",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberTest.firstGiven()"
});
formatter.result({
  "duration": 106823100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "My First Test Scenario",
  "description": "",
  "id": "my-first-feature-definition;my-first-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "this is my second when",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "this is my third then",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTest.secondWhen()"
});
formatter.result({
  "duration": 80000,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTest.thirdThen()"
});
formatter.result({
  "duration": 89400,
  "status": "passed"
});
formatter.after({
  "duration": 644986000,
  "status": "passed"
});
formatter.uri("myfeature3.feature");
formatter.feature({
  "line": 1,
  "name": "Test SKY Sign-In functionalities",
  "description": "",
  "id": "test-sky-sign-in-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5137531000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Enter the form with valid data using datatables",
  "description": "",
  "id": "test-sky-sign-in-functionalities;enter-the-form-with-valid-data-using-datatables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to sky page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the form with details",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "First Name",
        "Vikram"
      ],
      "line": 8
    },
    {
      "cells": [
        "Last Name",
        "Vikram"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email Address",
        "test@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Confirm Email Address",
        "test@gmail.com"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click the cancel button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I validate the sky page",
  "keyword": "And "
});
formatter.match({
  "location": "SkyAccountTest.navigateSkyPage()"
});
formatter.result({
  "duration": 5045910100,
  "status": "passed"
});
formatter.match({
  "location": "SkyAccountTest.enterDetails(DataTable)"
});
formatter.result({
  "duration": 346071900,
  "status": "passed"
});
formatter.match({
  "location": "SkyAccountTest.clickCancel()"
});
formatter.result({
  "duration": 28400,
  "status": "passed"
});
formatter.match({
  "location": "SkyAccountTest.validateSkyPage()"
});
formatter.result({
  "duration": 15500,
  "status": "passed"
});
formatter.after({
  "duration": 675807100,
  "status": "passed"
});
});