package lumaProjectTest;

import com.ProjectLuma.ui.selenium.driverFactory.Driver;
import com.ProjectLuma.ui.selenium.enums.CreateAccountEnum;
import com.ProjectLuma.ui.selenium.models.NewUser;
import com.ProjectLuma.ui.selenium.pages.CreateAccountPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
    NewUser newUser = new NewUser("Aygerim", "Assakunova", "aygerim-mk@mail.ru", "Ay21102018!");
    CreateAccountEnum createAccountEnum;
    @Owner("Aygerim")
    @Severity(SeverityLevel.CRITICAL)
    @Description("dbl check an account with the same credentials")
    @Epic("Account")
    @Feature("Double Check")
    @Link("https://accounts.saucelabs.com/am/XUI/?region=eu-central-1&next=%2Ftests%2Fdf97ab3968e9448b9df5a928a92cd2d2#login/")
    @Test
    void createAccountWithBuilderPattern() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        createAccountPage.fillOutFields(newUser);
        createAccountPage.createBtn();
        Thread.sleep(10000);
        Assert.assertTrue(createAccountPage.createBtn().createSubmitBtn.isEnabled());
        Assert.assertTrue(createAccountPage.checkdblcreate.getText().contains( "There is already an account"));
    }

    @Owner("Aygerim")
    @Severity(SeverityLevel.CRITICAL)
    @Description("create new account")
    @Epic("Account")
    @Feature("New Button")
    @Link("https://accounts.saucelabs.com/am/XUI/?region=eu-central-1&next=%2Ftests%2Fdf97ab3968e9448b9df5a928a92cd2d2#login/")
    @Test
    void createAccTesWithFaker() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        createAccountPage.firstName.sendKeys(faker.name().firstName());
        createAccountPage.lastName.sendKeys(faker.name().lastName());
        createAccountPage.eMail.sendKeys(faker.internet().emailAddress());
        createAccountPage.password.sendKeys("Ba2321145!");
        createAccountPage.confirmPasswrod.sendKeys("Ba2321145!");
        Assert.assertTrue(createAccountPage.elementAbility(createAccountPage.createSubmitBtn));
      //  Assert.assertTrue(homePage.isPageOpenedExpectedWindow(createAccountPage.createSubmitBtn, "//https://magento.softwaretestingboard.com/customer/account/"));

    }
      @Test
    void createWithEnumCredentials() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        createAccountPage.createEnum(createAccountEnum);
        createAccountPage.createBtn();
        Thread.sleep(10000);
        Assert.assertTrue(createAccountPage.createBtn().createSubmitBtn.isDisplayed());
    }

    @Test
    void createAccountWithInvalidEmail(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        createAccountPage.firstName.sendKeys(faker.name().firstName());
        createAccountPage.lastName.sendKeys(faker.name().lastName());
        createAccountPage.eMail.sendKeys("2324354665");
        createAccountPage.password.sendKeys("Ba2321145!");
        createAccountPage.confirmPasswrod.sendKeys("Ba2321145!");
        createAccountPage.createBtn();
        Assert.assertTrue(createAccountPage.bodyElement.getText().contains("Please enter a valid email address (Ex: johndoe@domain.com)."));
        }
    @Test
    void createAccountWithInvalidPassword(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        createAccountPage.firstName.sendKeys(faker.name().firstName());
        createAccountPage.lastName.sendKeys(faker.name().lastName());
        createAccountPage.eMail.sendKeys("23243@mail.ru");
        createAccountPage.password.sendKeys("Ba23");
        createAccountPage.confirmPasswrod.sendKeys("Ba23");
        Assert.assertTrue(createAccountPage.bodyElement.getText().contains("Minimum length of this field must"));
    }
}
