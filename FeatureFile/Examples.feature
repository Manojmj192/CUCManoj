Feature: Check the login validaiton
Scenario Outline: Verify with valid and invalid user name & password
 Given user launch the browser
 When User login with Valid and Invalid "<UserName>" and "<Password>"
 And User click the Sumbit button
 Then User Navigate to welcome page
 
 Examples:
 |UserName|Password|
 |praveen@gmail.com|password|
 |surya@gmail.com|password|
 |Prasanna@gmail.com|password|
 |Manoj@zaigoinfotech.com|Password@123|