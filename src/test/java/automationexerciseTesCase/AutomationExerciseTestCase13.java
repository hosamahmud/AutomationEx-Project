package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase13.AutomationExerciseTestCase13Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase13 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase13Helper automationexerciseTestCase13Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase13Helper = new AutomationExerciseTestCase13Helper(driver);
    }

    @Test(priority = 1)
    void verifyAddedProduct() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase13Helper.verifyHomePage(driver);
        automationexerciseTestCase13Helper.clickViewProduct(driver);
        automationexerciseTestCase13Helper.verifyCartPage(driver);
        automationexerciseTestCase13Helper.addingQuantity(driver);
        automationexerciseTestCase13Helper.clickAddToCart(driver);
        automationexerciseTestCase13Helper.clickViewCart(driver);
        automationexerciseTestCase13Helper.verifyViewCartPage(driver);

    }

    @AfterTest()
    void closure() {
        driver.close();
    }

}
