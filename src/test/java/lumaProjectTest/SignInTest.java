package lumaProjectTest;

import com.ProjectLuma.ui.selenium.models.NewUser;
import com.ProjectLuma.ui.selenium.pages.SignInPage;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{
    @Test
    void signInWithValidCredentials(){
driver.get("https://magento.softwaretestingboard.com/");
        elementActions.clickTheButton(signInPage.signInBtn);
        signInPage.fillOutTheFieldSingIn() ;

    }
}
