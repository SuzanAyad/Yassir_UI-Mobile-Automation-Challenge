# Yassir
 The Movies apk for QA Technical Challenge
 Creating the mobile automation test using appium, Appium inspector for elements locators and Appium server for tracking the requests
 
 

# This project contains 4 Packages:-

## Utils Package
Contains >> Setup Class, each time you make a new Test Class it has to extend this class to access its methods
Also Contains >> Runner Class, to run the automated tests

## Pages Package
Contains a class for each screen of the app

## StepDefinitions Package
Contains Classes to execute the Gherkin steps

# How To Run it
Open CMD navigate to pom.xml file location
cd C://location-to-your-project-where-pom.xml-is-found

Then simply run clean verify using Maven CLI
mvn clean verify
>> Note That Maven, Java, Android and Node should be properly defined in
Environmental variables as JAVA_HOME,  MAVEN_HOME, ANDROID_HOME, NODE_HOME

## How To Make Allure Report
Open PowerShell and Type the following commands to install Allure Reports
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
Type "Y" and Hit Enter
irm get.scoop.sh | iex
scoop install allure

Then simply run Allure server with the target of allure-results folder of your project
allure serve C:\location-to-your-project-where-pom.xml-is-found\allure-results

