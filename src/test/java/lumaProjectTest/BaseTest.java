package lumaProjectTest;

import com.ProjectLuma.ui.selenium.driverFactory.Driver;
import com.ProjectLuma.ui.selenium.helper.ElementActions;
import com.ProjectLuma.ui.selenium.models.NewUser;
import com.ProjectLuma.ui.selenium.pages.CreateAccountPage;
import com.ProjectLuma.ui.selenium.pages.HomePage;
import com.ProjectLuma.ui.selenium.pages.SignInPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(AllureReportListener.class)
public abstract class BaseTest {
    public Faker faker;
    public HomePage homePage;
    public CreateAccountPage createAccountPage;
    public SignInPage signInPage;
    public NewUser newUser1;
    public WebDriver driver;
    public Actions actions;
    public ElementActions elementActions;
    public WomenClothes womenClothes;

    @BeforeClass
    public void setUpBrowser(){
        womenClothes = new WomenClothes();
        driver= Driver.getDriver();
        elementActions = new ElementActions();
        actions = new Actions(driver);
        signInPage = new SignInPage();
        faker = new Faker();
        homePage = new HomePage();
        createAccountPage = new CreateAccountPage();
        newUser1 = new NewUser();

    }
    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }

}
