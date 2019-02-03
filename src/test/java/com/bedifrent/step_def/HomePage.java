package com.bedifrent.step_def;

import com.bedifrent.BaseClass;
import com.bedifrent.Constants;
import com.bedifrent.page_obj.HomePageObjects;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    @Given("^User is in HomePage$")
    public void homePage() {
        driver.get(Constants.getURL());
        ExtentCucumberFormatter.setTestRunnerOutput("User is in HomePage");
        Assert.assertEquals("https://www.bbc.co.uk/",driver.getCurrentUrl());
    }

    @Then("^\"([^\"]*)\" should be displayed$")
    public void navigateToHomePageLink(String linkName) {
        ExtentCucumberFormatter.setTestRunnerOutput("Link Name : " + linkName);
        try {
            switch (linkName.toLowerCase()) {
                case "news":
                    Assert.assertTrue(HomePageObjects.lnk_News(driver).isDisplayed());
                    break;
                case "sport":
                    Assert.assertTrue(HomePageObjects.lnk_Sport(driver).isDisplayed());
                    break;
                case "iplayer":
                    Assert.assertTrue(HomePageObjects.lnk_iPlayer(driver).isDisplayed());
                    break;
                case "more":
                    Assert.assertTrue(HomePageObjects.lnk_More(driver).isDisplayed());
                    break;
                case "sounds":
                    Assert.assertTrue(HomePageObjects.lnk_Sounds(driver).isDisplayed());
                    break;
                case "weather":
                    Assert.assertTrue(HomePageObjects.lnk_Weather(driver).isDisplayed());
                    break;
                case "taster":
                    Assert.assertTrue(HomePageObjects.lnk_Taster(driver).isDisplayed());
                    break;
                default:
                    ExtentCucumberFormatter.setTestRunnerOutput(linkName + "is not displayed");
                    Assert.fail(linkName + "is not displayed");
            }
        }catch (Exception e){
            Assert.fail("Failed" + e);
        }

    }


    @When("^User clicks the More link$")
    public void clickMoreLink() {
        try {
            HomePageObjects.lnk_More(driver).click();
        }catch (Exception e){
            Assert.fail("Failed : " + e);
        }
    }


    @Then("^\"([^\"]*)\" should be displayed under More$")
    public void navigateToHomePageMoreLinks(String linkName) {
        ExtentCucumberFormatter.setTestRunnerOutput("Link Name : " + linkName);
        try {
            switch (linkName.toLowerCase()) {
                case "taster":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Taster(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Taster(driver).isDisplayed());
                    break;
                case "tv":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_TV(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_TV(driver).isDisplayed());
                    break;
                case "radio":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Radio(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Radio(driver).isDisplayed());
                    break;
                case "food":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Food(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Food(driver).isDisplayed());
                    break;
                case "bitesize":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Bitesize(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Bitesize(driver).isDisplayed());
                    break;
                case "earth":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Earth(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Earth(driver).isDisplayed());
                    break;
                case "arts":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Arts(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Arts(driver).isDisplayed());
                    break;
                case "local":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_Local(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_Local(driver).isDisplayed());
                    break;
                case "make it digital":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_MakeItDigital(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_MakeItDigital(driver).isDisplayed());
                    break;
                case "cbeebies":
                    wait.until(ExpectedConditions.elementToBeClickable(HomePageObjects.lnk_CBeebies(driver)));
                    Assert.assertTrue(HomePageObjects.lnk_CBeebies(driver).isDisplayed());
                    break;
                default:
                    ExtentCucumberFormatter.setTestRunnerOutput(linkName + "is not displayed");
                    Assert.fail(linkName + "is not displayed");
            }
        }catch (Exception e){
            Assert.fail("Failed : " + e);
        }

    }
}