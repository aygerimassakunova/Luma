package com.ProjectLuma.ui.selenium.pages;

import com.ProjectLuma.ui.selenium.enums.CreateAccountEnum;
import com.ProjectLuma.ui.selenium.models.NewUser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email_address")
    public WebElement eMail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPasswrod;

    @FindBy(id = "is_subscribed")
    public WebElement newsLetter;

    @FindBy(xpath = "//button[@type='submit'][@title = 'Create an Account']")
    public WebElement createSubmitBtn;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement checkingText;

    @FindBy(xpath = "//div[@data-ui-id = 'message-error']")
    public WebElement checkdblcreate;

    @FindBy(xpath = "//body[@data-container= 'body']")
    public WebElement bodyElement;

    public CreateAccountPage fillOutFields(NewUser newUserDetails){
        elementActions.writeText(firstName, newUserDetails.getUserName())
                .writeText(lastName, newUserDetails.getUserLastName())
                .writeText(eMail, newUserDetails.getUserEmail())
                .writeText(password, newUserDetails.getUserPassword())
                .writeText(confirmPasswrod, newUserDetails.getUserPassword());
        return this;
    }

    public CreateAccountPage createEnum(CreateAccountEnum createAccountEnum){
        elementActions.writeText(firstName, CreateAccountEnum.userFirstName.getCredentials())
                .writeText(lastName, CreateAccountEnum.userLastName.getCredentials())
                .writeText(eMail, CreateAccountEnum.userEmail.getCredentials())
                .writeText(password, CreateAccountEnum.userPassw.getCredentials())
                .writeText(confirmPasswrod, CreateAccountEnum.userPassw.getCredentials());
return this;
    }

    public CreateAccountPage newsLetterSubscribing(){
        elementActions.clickTheButton(newsLetter);
        return this;
    }
public CreateAccountPage createBtn(){
        elementActions.scrollToElement(createSubmitBtn);
        elementActions.clickTheButton(createSubmitBtn);
        return this;
}

public boolean elementAbility(WebElement element){
        if (element.isEnabled()){
            return true;
        } return false;
}
}
