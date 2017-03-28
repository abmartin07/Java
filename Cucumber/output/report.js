$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepdef/daily.feature");
formatter.feature({
  "line": 1,
  "name": "Attitude matters",
  "description": "In order to understand Attitude\r\nAs a working guy\r\nI want to know whom to wish",
  "id": "attitude-matters",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Login Functionality",
  "description": "",
  "id": "attitude-matters;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I work Latenights",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I meet watchman",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I greet him",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I work in mornings",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I meet boy",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I dontgreet him",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Attitudetest.openBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Attitudetest.goToFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Attitudetest.loginButton()"
});
formatter.result({
  "status": "skipped"
});
});