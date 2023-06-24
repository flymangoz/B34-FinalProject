@Smoke @Regression
Feature: Login function test

@Positive @TC_SMAR-5
Scenario: Check login with valid credentials
Given Open the browser and go to the application
When Enter valid user
When Enter valid password
When Click login
Then logout Button should be visible 

@Negative @TC_SMAR-6
Scenario: Check login with invalid credentials
Given Open the browser and go to the application
When Enter invalid user
When Enter invalid password
When Click login invalid
Then alert msg shows Invalid username or password

@Negative @TC_SMAR-7
Scenario: Check login with null credentials
Given Open the browser and go to the application
When Enter null user
When Enter null password
When Click login null
Then alert msg shows Invalid username or password null
