$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("package6/Developer.feature");
formatter.feature({
  "name": "Life of a IT Guy",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am a \"\u003cDeveloper\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I fix \"\u003cDefects\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I get appreciated by \"\u003cManager\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Developer",
        "Defects",
        "Manager"
      ]
    },
    {
      "cells": [
        "Sridevi",
        "great",
        "Shang"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am a \"Sridevi\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Tester.I_am_a_Tester(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fix \"great\"",
  "keyword": "When "
});
formatter.match({
  "location": "Developer.i_fix_def(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get appreciated by \"Shang\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Developer.i_get_appreciated(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("package6/Tester.feature");
formatter.feature({
  "name": "Calculator Subraction",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I am a \"\u003cTester\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I do good \"\u003cTesting\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I find \"\u003cdefects\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I get appreciated by \"\u003cManager\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "salary \"\u003cincreases\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Tester",
        "Testing",
        "defects",
        "Manager",
        "increases"
      ]
    },
    {
      "cells": [
        "Miithiles",
        "Good",
        "great",
        "Shang",
        "thirty"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I am a \"Miithiles\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Tester.I_am_a_Tester(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do good \"Good\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tester.I_do_good_Testing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find \"great\"",
  "keyword": "When "
});
formatter.match({
  "location": "Tester.I_find_defects(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get appreciated by \"Shang\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Developer.i_get_appreciated(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "salary \"thirty\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tester.salary_increases(String)"
});
formatter.result({
  "status": "passed"
});
});