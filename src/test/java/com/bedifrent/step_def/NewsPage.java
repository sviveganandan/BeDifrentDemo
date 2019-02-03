package com.bedifrent.step_def;

import com.bedifrent.BaseClass;
import com.bedifrent.Constants;
import com.bedifrent.page_obj.HomePageObjects;
import com.bedifrent.page_obj.NewsPageObjects;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NewsPage {

    WebDriver driver = BaseClass.get_instance().getDriver();

    @When("^User clicks on News link$")
    public void clicksNewsLink(){
        try {
            HomePageObjects.lnk_News(driver).click();
            ExtentCucumberFormatter.setTestRunnerOutput("News link is clicked");
        }catch (Exception e){
            Assert.fail("Failed :" + e);
        }

    }


    @Then("^User lands on News Page$")
    public void landingNewsPage(){
        try {
            Assert.assertEquals("https://www.bbc.co.uk/news",driver.getCurrentUrl());
            ExtentCucumberFormatter.setTestRunnerOutput("News Page displayed");
        }catch (Exception e){
            Assert.fail("Failed :" + e);
        }
    }

    @Then("^User is in NewsPage$")
    public void NewsPage(){
        try {
            driver.get(Constants.getURL());
            HomePageObjects.lnk_News(driver).click();
            Assert.assertEquals("https://www.bbc.co.uk/news",driver.getCurrentUrl());
            ExtentCucumberFormatter.setTestRunnerOutput("News Page displayed");
        }catch (Exception e){
            Assert.fail("Failed :" + e);
        }
    }

    @Then("^News Logo should be displayed$")
    public void newsLogoDisplayed(){
        try {
            Assert.assertTrue(NewsPageObjects.newsLogo(driver).isDisplayed());
            ExtentCucumberFormatter.setTestRunnerOutput("News Logo is displayed");
        }catch (Exception e){
            Assert.fail("Failed : news logo not displayed" + e);
        }
    }


    @Then("^UK News link should be displayed$")
    public void ukNewsLinkDisplay(){
        try {
            Assert.assertTrue(NewsPageObjects.lnk_UK(driver).isDisplayed());
            ExtentCucumberFormatter.setTestRunnerOutput("UK news link is displayed");
        }catch (Exception e){
            Assert.fail("Failed : UK news link not displayed" + e);
        }
    }

    @Then("^User clicks on UK link$")
    public void clickUkNewsLink(){
        try {
            NewsPageObjects.lnk_UK(driver).click();
            ExtentCucumberFormatter.setTestRunnerOutput("UK news link is clicked");
        }catch (Exception e){
            Assert.fail("Failed : UK news link not clicked" + e);
        }
    }


    @Then("^UK News Page should be loaded$")
    public void ukNewsPageDisplay(){
        try {
            Assert.assertEquals("https://www.bbc.co.uk/news/uk", driver.getCurrentUrl());
            ExtentCucumberFormatter.setTestRunnerOutput("UK news page displayed");
        }catch (Exception e){
            Assert.fail("Failed : UK news page not displayed" + e);
        }
    }

}