package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase6.AutomationExerciseTestCase6Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase6 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase6Helper automationexerciseTestCase6Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase6Helper = new AutomationExerciseTestCase6Helper(driver);
    }

    @Test(priority = 1)
    void verifyTouchWithUs() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase6Helper.verifyHomePage(driver);
        automationexerciseTestCase6Helper.clickContactUs(driver);
        automationexerciseTestCase6Helper.typeMyName(driver);
        automationexerciseTestCase6Helper.typeMyEmail(driver);
        automationexerciseTestCase6Helper.typeTheSubject(driver);
        automationexerciseTestCase6Helper.typeTheMessage(driver);
        automationexerciseTestCase6Helper.upload_file(driver);
        automationexerciseTestCase6Helper.clickSubmit(driver);
        automationexerciseTestCase6Helper.verifySuccessMessage(driver);
        automationexerciseTestCase6Helper.clickBackHome(driver);
        automationexerciseTestCase6Helper.verifyHomePageAgain(driver);

    }

    @AfterTest()

    void closure() {
        driver.close();
    }

}
