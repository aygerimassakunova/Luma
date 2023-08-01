package com.ProjectLuma.ui.selenium.pages;

import com.ProjectLuma.ui.selenium.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;
public class HomePage extends BasePage{

    @FindBy(xpath= "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    public WebElement createAccountBtn;

    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement signInBtn;

    @FindBy(xpath = "//*[text()=\"Default welcome msg!\"]")
    public WebElement defaultMsgBtn;

    @FindBy(id = "search")
    public WebElement searchField;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement basket;

    public boolean isPageOpenedInNewWindow(WebElement element) {
        String mainWindow = Driver.getDriver().getWindowHandle();
        element.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(mainWindow)) {
                return true;
            }
        }
        return false;
    }
    public boolean isPageOpenedExpectedWindow(WebElement element, String expectedUrl) {
        element.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (isPageOpenedInNewWindow(element)) {
                Driver.getDriver().switchTo().window(windowHandle);
                String currentUrl = Driver.getDriver().getCurrentUrl();
                if (currentUrl.equals(expectedUrl)) {
                    return true;
                }
            }
        }
        return false;
    }

    }


