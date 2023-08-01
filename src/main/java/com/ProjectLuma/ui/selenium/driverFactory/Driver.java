package com.ProjectLuma.ui.selenium.driverFactory;

import com.ProjectLuma.ui.selenium.configReader.BaseConfig;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
    }
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (BaseConfig.getProperty2("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong driver");
            }

        } return driver;
    }
        public static void closeDriver(){
            try {
                if (driver != null) {
                    driver.close();
                    driver.quit();
                    driver = null;
                }
            } catch (Exception e) {
                System.out.println("Error while closing driver");
            }
        }
    }


