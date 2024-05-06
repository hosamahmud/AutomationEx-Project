package automationexerciseTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import automationexerciseTestCase18.AutomationExerciseTestCase18Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExerciseTestCase18 {

    String URL = LoadProperties.useData.getProperty("AEURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AutomationExerciseTestCase18Helper automationexerciseTestCase18Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        automationexerciseTestCase18Helper = new AutomationExerciseTestCase18Helper(driver);
    }

    @Test(priority = 1)
    void verifyMenWomenProductPages() {
        CommonHelper.openWebPage(URL, driver);
        automationexerciseTestCase18Helper.verifyHomePage(driver);
        automationexerciseTestCase18Helper.categoryText(driver);
        automationexerciseTestCase18Helper.clickWomenButton(driver);
        automationexerciseTestCase18Helper.clickDressButton(driver);
        automationexerciseTestCase18Helper.verifyWomenDressPage(driver);
        automationexerciseTestCase18Helper.clickMenButton(driver);
        automationexerciseTestCase18Helper.clickJeansButton(driver);
        automationexerciseTestCase18Helper.verifyMenJeansPage(driver);


    }

    @AfterTest()
    void closure() {
        driver.close();
    }

}
