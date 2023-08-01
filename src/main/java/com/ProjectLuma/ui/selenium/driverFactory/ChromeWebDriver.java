package com.ProjectLuma.ui.selenium.driverFactory;
import com.ProjectLuma.ui.selenium.configReader.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class ChromeWebDriver {
        public static WebDriver loadChromeDriver(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disabled-extensions");
            options.addArguments("--no-sandbox");


            if (Boolean.parseBoolean(BaseConfig.getProperty2("headless"))){
                options.addArguments("--headless");
            }

            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return driver;
    }
}
