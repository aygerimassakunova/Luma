package com.ProjectLuma.ui.selenium.pages;

import com.ProjectLuma.ui.selenium.driverFactory.Driver;
import com.ProjectLuma.ui.selenium.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);}
WebElement element;

        public ElementActions elementActions = new ElementActions();
    }

