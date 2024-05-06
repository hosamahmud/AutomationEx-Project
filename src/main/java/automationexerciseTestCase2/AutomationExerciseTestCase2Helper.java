package automationexerciseTestCase2;

import automationexerciseTestCase1.AutomationExerciseTestCase1Constants;
import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase2Helper extends AutomationExerciseTestCase2Po {

    public <WebDriver> AutomationExerciseTestCase2Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    //AutomationExerciseTestCase2Constants automationExerciseTestCase2Constants = new AutomationExerciseTestCase2Constants();

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
        CommonHelper.sendText(emailLoginUserTextBox, Util.getEmailAddress(), driver);
    }

    public void typeYourPassword(WebDriver driver) {
        CommonHelper.sendText(passwordLoginUserTextBox, Util.getPassword(), driver);
    }

    public void clickLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(loginButton, driver);
    }


    public void verifyTheLoginPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(loggedInText, driver);
    }

    public void clickDeleteAccount(WebDriver driver) {
        CommonHelper.clickWhenReady(deleteAccountButton, driver);
    }

    public void verifyAccountDeleted(WebDriver driver) {
        CommonHelper.verifyElementAppears(accountDeletedText, driver);
    }

}





