package com.ProjectLuma.ui.selenium.helper;

import com.ProjectLuma.ui.selenium.driverFactory.Driver;
import com.ProjectLuma.ui.selenium.pages.WomenClothes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedList;

public class ElementActions {
    public ElementActions waitButtonToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickTheButton(WebElement element){
        waitButtonToBeClickable(element);
        element.click();
        return this;
    }

    public ElementActions writeText(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }
    public ElementActions choose(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt, Keys.ARROW_DOWN, Keys.ENTER);
        return this;
    }

    public ElementActions scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public ElementActions clickWithJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);
        return this;
    }
        public ElementActions highLightElement (WebElement element){
            JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
            jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);"
            , element, "border: 2px sold red");
            return this;
    }

    public ElementActions fillTheCart(LinkedList<WebElement> selectItems){
        for (WebElement n: selectItems) {
            clickWithJs(n);
        }
        return this;
    }
}
