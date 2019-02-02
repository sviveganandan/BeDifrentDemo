package com.bedifrent.page_obj;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

    public static WebElement lnk_News(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'News')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("News link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("News link is not displayed");
            throw e;
        }
    }


    public static WebElement lnk_Sport(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'Sport')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Sport link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Sport link is not displayed");
            throw e;
        }
    }


    public static WebElement lnk_Weather(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'Weather')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Weather link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Weather link is not displayed");
            throw e;
        }
    }


    public static WebElement lnk_iPlayer(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'iPlayer')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("iPlayer link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("iPlayer link is not displayed");
            throw e;
        }
    }

    public static WebElement lnk_Sounds(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'Sounds')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Sounds link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Sounds link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_More(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[contains(text(),'More')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("More link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("More link is not displayed");
            throw e;
        }
    }

    public static WebElement lnk_Taster(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Taster')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Taster link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Taster link is not displayed");
            throw e;
        }
    }

    public static WebElement lnk_MakeItDigital(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Make It Digital')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Make It Digital link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Make It Digital link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Food(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Food')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Food link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Food link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Bitesize(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Bitesize')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Bitesize link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Bitesize link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Earth(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Earth')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Earth link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Earth link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Arts(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Arts')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Arts link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Arts link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Local(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Local')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Local link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Local link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_TV(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'TV')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("TV link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("TV link is not displayed");
            throw e;
        }
    }
    public static WebElement lnk_Radio(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'Radio')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("Radio link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Radio link is not displayed");
            throw e;
        }
    }

    public static WebElement lnk_CBeebies(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@id='orb-panel-more']//a[contains(text(),'CBeebies')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("CBeebies link is displayed from objects");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("CBeebies link is not displayed");
            throw e;
        }
    }


}