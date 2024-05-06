package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase2.AutomationExerciseTestCase2Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase2 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase2Helper automationexerciseTestCase2Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase2Helper = new AutomationExerciseTestCase2Helper(driver);
    }

    @Test(priority = 1)
    void verifyLoginAndDeleteUser() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase2Helper.verifyHomePage(driver);
        automationexerciseTestCase2Helper.clickSignUpLogin(driver);
        automationexerciseTestCase2Helper.verifyLoginPage(driver);
        automationexerciseTestCase2Helper.typeYourEmail(driver);
        automationexerciseTestCase2Helper.typeYourPassword(driver);
        automationexerciseTestCase2Helper.clickLogin(driver);
        automationexerciseTestCase2Helper.verifyTheLoginPage(driver);
        automationexerciseTestCase2Helper.clickDeleteAccount(driver);
        automationexerciseTestCase2Helper.verifyAccountDeleted(driver);

    }

    @AfterTest()

    void closure() {
        driver.close();
    }

}
