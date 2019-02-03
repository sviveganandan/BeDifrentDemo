package com.bedifrent.page_obj;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPageObjects {

    public static WebElement newsLogo(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div[@class='nw-o-news-branding__logo']"));
            ExtentCucumberFormatter.setTestRunnerOutput("News logo is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("News logo is not displayed");
            throw e;
        }
    }

    public static WebElement lnk_UK(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"orb-modules\"]//nav[@class='nw-c-nav__wide']//span[contains(text(),'UK')]"));
            ExtentCucumberFormatter.setTestRunnerOutput("UK link is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("UK link is not displayed");
            throw e;
        }
    }


}