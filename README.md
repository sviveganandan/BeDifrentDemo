# BBCDemo
Demo on Cucumber Selenium with Java

It is a maven Project once you cloned the project please open that in Intelij or eclipse

Running the Tests:

  1. open the project in IDE
  2. go to "bbctesting\src\main\java\com\bedifrent\RunTest.java"
  3. Right click on the file and select "Run"
  
  
  Scenarios Covered:
  
   1. Verify that expected links are availble in the Home page of BBC website
   2. Verify by clicking the News link takes the user to news page
   3. Verify by clicking on the uk link from the NewsPage takes the user to UK NewsPage


 Configuration:
  Currently is set to run on Chrome Browser in "bbctesting\src\main\resources\features\1_TestSetup.feature"
  if you wish to run on firefox or IE please enable that value from the example table and run. Please disable other options
 
 
 Logs and Report:
   1. Report of Test exectuion and logs are logged in the same file "bbctesting\target\reports\ExtentReports.html"
   2. Please open the html from the location give complete test execution report
   3. clicking on the last icon in the report gives the TestRunner Logs.
    


