package com.bedifrent.step_def;

import com.bedifrent.BaseClass;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TestTearDown {

    WebDriver driver = BaseClass.get_instance().getDriver();

    @Then("^Quit Driver$")
    public void quitDriver(){
        try {
            driver.quit();
        }catch(Exception e){
            Assert.fail("Failed : Cannot quit the driver "+ e);
        }
    }
}