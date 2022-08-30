#Author: anitapcamara@gmail.com


 @web
Feature: User be able to create a subtask
User can add a new subtask When logged in My tasks

 @TC-001
Scenario: Create task
Given user is "https://qa-test.avenuecode.io/tasks"
And click on manage subtask button
And system opens modal dialog with Task ID
When type Sub task description 
And type due date And click on Add button
Then subtask added successfully 

