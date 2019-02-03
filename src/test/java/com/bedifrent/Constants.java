package com.bedifrent;

public class Constants {

    private static String REPORT_PATH = "target/reports/ExtentReports.html";
    private static String URL = "https://www.bbc.co.uk";

    private static Integer ScenarioCounter = 1;

    public static Integer getScenarioCounter() {
        return ScenarioCounter;
    }

    public static void setScenarioCounter(Integer scenarioCounter) {
        ScenarioCounter = scenarioCounter;
    }

    public static String getReportPath() {
        return REPORT_PATH;
    }

    public static String getURL() {
        return URL;
    }
}