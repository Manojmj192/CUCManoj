Feature: Verify the login page
Scenario: Check with valid username and password
 Given User launch the website URL
 When user enter the valid credentials
 |UserName|Password|
 |Man@zaigoinfotech.com|Password123|
 |Manoj@zaigoinfotech.com|Password@123|
 Then user successfully click the sumbit button
 
 
 
 
 
 
 