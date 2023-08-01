package com.ProjectLuma.ui.selenium.pages;

import com.ProjectLuma.ui.selenium.models.NewUser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement signInBtn;

    @FindBy(id = "email")
    public WebElement singInEmail;

    @FindBy(id="pass")
    public WebElement signInPass;

    @FindBy(xpath = "//button[@type='submit'][@class='action login primary']")
    public WebElement signInSubmitBtn;



    public SignInPage fillOutTheFieldSingIn(){
        elementActions.writeText(singInEmail, "aygerim-mk@mail.ru").writeText(signInPass, "Ay211018!").clickWithJs(signInSubmitBtn);
        return this;
    }


}
