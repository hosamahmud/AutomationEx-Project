package automationexerciseTestCase3;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase3Helper extends AutomationExerciseTestCase3Po {
    public <WebDriver> AutomationExerciseTestCase3Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

   // AutomationExerciseTestCase3Constants automationExerciseTestCase3Constants = new AutomationExerciseTestCase3Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }
    public void clickSignUpLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(signupLoginButton, driver);
    }

    public void verifyLoginPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(loginUserPage, driver);
    }

    public void typeYourEmail(WebDriver driver) {
        CommonHelper.sendText(emailLoginUserTextBox, Util.getIncorrectEmail(), driver);
    }

    public void typeYourPassword(WebDriver driver) {
        CommonHelper.sendText(passwordLoginUserTextBox, Util.getPassword(), driver);
    }

    public void clickLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(loginButton, driver);
    }


    public void verifyIncorrectLoginMessage(WebDriver driver) {
        CommonHelper.verifyElementAppears(incorrectLoginText, driver);
    }


}





