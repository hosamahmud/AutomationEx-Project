package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase1.AutomationExerciseTestCase1Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase1 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase1Helper automationexerciseTestCase1Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase1Helper = new AutomationExerciseTestCase1Helper(driver);
    }

    @Test(priority = 1)
    void verifyCreateAndDeleteUser() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase1Helper.verifyHomePage(driver);
        automationexerciseTestCase1Helper.clickSignUpLogin(driver);
        automationexerciseTestCase1Helper.verifyNewUserSignUp(driver);
        automationexerciseTestCase1Helper.login(driver);
        automationexerciseTestCase1Helper.verifyInformationPage(driver);
        automationexerciseTestCase1Helper.creatingAccount(driver);
        automationexerciseTestCase1Helper.verifyAccountCreated(driver);
        automationexerciseTestCase1Helper.clickContinue1(driver);
        automationexerciseTestCase1Helper.verifyLoggedIN(driver);
        automationexerciseTestCase1Helper.clickDeleteAccount(driver);
        automationexerciseTestCase1Helper.verifyAccountDeleted(driver);
        automationexerciseTestCase1Helper.clickContinue2(driver);
    }

    @AfterTest()

    void closure() {
        driver.close();
    }

}
