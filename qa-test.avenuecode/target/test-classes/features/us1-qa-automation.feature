#Author: anitapcamara@gmail.com

@web
Feature: User be able to create a task
User can add a new task When logged in ToDo List

 @TC-001
Scenario: Create task
Given user is in "https://qa-test.avenuecode.io/users/sign_inusers/sign_in/"
And entered email And password 
And user is redirect to page tasks
When user can type new task And press enter or click on add task button
Then new tasked is added succefully

