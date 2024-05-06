package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase3.AutomationExerciseTestCase3Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase3 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase3Helper automationexerciseTestCase2Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase2Helper = new AutomationExerciseTestCase3Helper(driver);
    }

    @Test(priority = 1)
    void verifyLoginWithIncorrectUser() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase2Helper.verifyHomePage(driver);
        automationexerciseTestCase2Helper.clickSignUpLogin(driver);
        automationexerciseTestCase2Helper.verifyLoginPage(driver);
        automationexerciseTestCase2Helper.typeYourEmail(driver);
        automationexerciseTestCase2Helper.typeYourPassword(driver);
        automationexerciseTestCase2Helper.clickLogin(driver);
        automationexerciseTestCase2Helper.verifyIncorrectLoginMessage(driver);

    }

    @AfterTest()

    void closure() {
        driver.close();
    }

}
