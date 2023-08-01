package lumaProjectTest;

import com.ProjectLuma.ui.selenium.pages.HomePage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    void buttonIsEnable(){
        driver.get("https://magento.softwaretestingboard.com/");
        Assert.assertTrue(homePage.defaultMsgBtn.isEnabled());
        Assert.assertTrue(homePage.searchField.isEnabled());
        Assert.assertTrue(homePage.basket.isEnabled());
        Assert.assertTrue(homePage.createAccountBtn.isEnabled());
        Assert.assertTrue(homePage.signInBtn.isEnabled());
    }

    @Test
    void buttonSwitchToNewPage(){
        driver.get("https://magento.softwaretestingboard.com/");
     //   Assert.assertTrue(homePage.isPageOpenedExpectedWindow(homePage.signInBtn, "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/"));
        Assert.assertTrue(homePage.isPageOpenedExpectedWindow(homePage.createAccountBtn, "https://magento.softwaretestingboard.com/customer/account/create/" ));
    }

    @Test
    void textVisibility(){
        driver.get("https://magento.softwaretestingboard.com/");
        Assert.assertTrue( homePage.createAccountBtn.getText().contains("Create an Account"));
        Assert.assertTrue(homePage.defaultMsgBtn.getText().contains("Default welcome msg"));
    }
}
