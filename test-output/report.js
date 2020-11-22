$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfeature.feature");
formatter.feature({
  "line": 1,
  "name": "My first feature definition",
  "description": "",
  "id": "my-first-feature-definition",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3943439500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "My First Test Scenario",
  "description": "",
  "id": "my-first-feature-definition;my-first-test-scenario",
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
  "name": "this is my first given",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "this is my second when",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "this is my third then",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberTest.firstGiven()"
});
formatter.result({
  "duration": 171219300,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTest.secondWhen()"
});
formatter.result({
  "duration": 84400,
  "status": "passed"
});
formatter.match({
  "location": "CucumberTest.thirdThen()"
});
formatter.result({
  "duration": 262000,
  "status": "passed"
});
formatter.after({
  "duration": 838968300,
  "status": "passed"
});
});