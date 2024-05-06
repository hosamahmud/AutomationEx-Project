package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase24.AutomationExerciseTestCase24Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase24 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase24Helper automationexerciseTestCase24Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase24Helper = new AutomationExerciseTestCase24Helper(driver);
    }

    @Test(priority = 1)
    void verifyMenWomenProductPages() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase24Helper.verifyHomePage(driver);
        automationexerciseTestCase24Helper.addToCartButton(driver);
        automationexerciseTestCase24Helper.clickViewCartButton(driver);
        automationexerciseTestCase24Helper.verifyShoppingPage(driver);
        automationexerciseTestCase24Helper.clickProceedToCheckoutButton(driver);
        automationexerciseTestCase24Helper.clickRegisterLoginButton(driver);
        automationexerciseTestCase24Helper.typeMyName(driver);
        automationexerciseTestCase24Helper.typeMyEmail(driver);
        automationexerciseTestCase24Helper.clickSignUp(driver);
        automationexerciseTestCase24Helper.verifyInformationPage(driver);
        automationexerciseTestCase24Helper.creatingAccount(driver);
        automationexerciseTestCase24Helper.clickCreateAccount(driver);
        automationexerciseTestCase24Helper.verifyAccountCreated(driver);
        automationexerciseTestCase24Helper.clickContinue1(driver);
        automationexerciseTestCase24Helper.verifyLoggedIN(driver);
        automationexerciseTestCase24Helper.clickCartButton(driver);
        automationexerciseTestCase24Helper.clickCheckoutButton(driver);
        automationexerciseTestCase24Helper.verifyAddressMessage(driver);
        automationexerciseTestCase24Helper.verifyOrderMessage(driver);
        automationexerciseTestCase24Helper.CommentingMessage(driver);
        automationexerciseTestCase24Helper.clickOrderButton(driver);
        automationexerciseTestCase24Helper.addingCreditCardData(driver);
        automationexerciseTestCase24Helper.clickPayAndConfirmOrder(driver);
        automationexerciseTestCase24Helper.verifySuccessMessage(driver);
        automationexerciseTestCase24Helper.clickDownloadInVoice(driver);
        automationexerciseTestCase24Helper.clickContinueAfterDownloadInVoice(driver);
        automationexerciseTestCase24Helper.clickDeleteAccount(driver);
        automationexerciseTestCase24Helper.verifyAccountDeleted(driver);
        automationexerciseTestCase24Helper.clickContinue2(driver);

    }

    @AfterTest()
    void closure() {
        driver.close();
    }

}
