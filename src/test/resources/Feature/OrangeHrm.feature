Feature: Login to OrangeHRM page

Scenario: Login page details

Given User is on login page
 
When user Check forgot click is present 
And click on Forgot link 
And User enter username "Admin"
And click on Reset password button
Then window contain text "Reset Password link sent successfully"
And User redirect to login page
And User enter username "Admin" and password "admin123"
And User click on submit button
Then page title should be "OrangeHRM"