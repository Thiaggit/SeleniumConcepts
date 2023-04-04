Feature: This is the login testing of Orange HRM
Scenario Outline: This is the scenario of login testing of Orange HRM
Given user enters into login page of Orange HRM
When user the user enters the username and password of "<userName>" and "<passWord>"
Then user going to click on the login button
Examples:
|userName | passWord|
|Admin    | admin123|