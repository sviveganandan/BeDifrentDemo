package com.bedifrent.step_def;

import com.bedifrent.BaseClass;
import com.bedifrent.Constants;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSetup {

    WebDriver driver;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
        ExtentCucumberFormatter.setTestRunnerOutput("Scenario : " + Constants.getScenarioCounter() + " - " + scenario.getName());
        Constants.setScenarioCounter(Constants.getScenarioCounter()+1);
    }

    @After
    public void after() {
        ExtentCucumberFormatter.setTestRunnerOutput("-------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Given("^User provides the browser as \"([^\"]*)\"$")
    public void browserSetup(String browser) {
        if (browser.equals("firefox")) {
            System.setProperty("webdriver.firefox.marionette","src\\main\\resources\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","src\\main\\resources\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("IE")) {
            System.setProperty("webdriver.ie.driver","src\\main\\resources\\driver\\MicrosoftWebDriver.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        ExtentCucumberFormatter.setTestRunnerOutput(browser.toUpperCase() + " browser is initiated successfully");
    }


    @And("^Initiate and set the Driver in BaseClass")
    public void initiateDriverClass() {
        BaseClass.get_instance().setDriver(driver);

    }

//    @Before
//    public void navigateToUrl(){
//        driver.get("https://www.bbc.co.uk");
//    }

    @After
    public void tearDown(){
        System.out.println("Tear down script");
    }
}