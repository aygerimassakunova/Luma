package com.ProjectLuma.ui.selenium.pages;

import com.ProjectLuma.ui.selenium.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class WomenClothes extends BasePage{
@FindBy(id = "ui-id-4")
    public WebElement womenBtn;

    @FindBy(xpath = "//a[text()='Hoodies & Sweatshirts']")
    public WebElement hoodiesBtn;

    @FindBy(xpath = "//div[text()='Pattern']")
    public WebElement patternBtn;

    @FindBy(xpath = "/html/body/div[1]/main/div[3]/div[2]/div/div[2]/div/div[11]/div[2]/ol/li[2]/a")
    public WebElement solidBtn;

    @FindBy(xpath = "//a[@class='product-item-link'][contains(text(),\"Hera Pullover Hoodie\")]")
    public WebElement pulloverBtn;

    @FindBy(id = "option-label-size-143-item-168")
    public WebElement sizeBtn;

    @FindBy(id = "option-label-color-93-item-50")
    public WebElement colorBtn;

    @FindBy(id = "qty")
    public WebElement quantityBtn;

    @FindBy(id = "//button[@title='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement goToCart;

    @FindBy(xpath = "//a[@class='action viewcart']")
    public WebElement viewCart;

    @FindBy(xpath = "(//button[@title='Add to Cart'])[2]")
    public WebElement additionItemToCart;

        public WomenClothes fillTheCart(LinkedList<WebElement>selectItems){
        selectItems.add(hoodiesBtn);
        selectItems.add(patternBtn);
        selectItems.add(solidBtn);
        selectItems.add(pulloverBtn);
        selectItems.add(sizeBtn);
        selectItems.add(colorBtn);
        selectItems.add(quantityBtn);
        selectItems.add(addToCartBtn);
        selectItems.add(goToCart);
        selectItems.add(viewCart);
        selectItems.add(additionItemToCart);
        for (WebElement n: selectItems) {
            elementActions.clickWithJs(n);
        }return this;
    }

}
