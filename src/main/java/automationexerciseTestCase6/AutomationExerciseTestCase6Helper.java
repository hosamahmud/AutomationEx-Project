package automationexerciseTestCase6;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase6Helper extends AutomationExerciseTestCase6Po {

    public <WebDriver> AutomationExerciseTestCase6Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    AutomationExerciseTestCase6Constants automationExerciseTestCase6Constants = new AutomationExerciseTestCase6Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }
    public void clickContactUs(WebDriver driver) {
        CommonHelper.clickWhenReady(contactUsButton, driver);
    }

    public void typeMyName(WebDriver driver) {
        CommonHelper.sendText(nameContactUsTexBox, Util.getFirstName(), driver);
    }

    public void typeMyEmail(WebDriver driver) {
        CommonHelper.sendText(emailContactUsTextBox, Util.getEmailAddress(), driver);
    }
    public void typeTheSubject(WebDriver driver) {
        CommonHelper.sendText(subjectTextBox, automationExerciseTestCase6Constants.subject, driver);
    }
    public void typeTheMessage(WebDriver driver) {
        CommonHelper.sendText(messageTextArea, automationExerciseTestCase6Constants.Message, driver);
    }

    public void upload_file(WebDriver driver) {
        CommonHelper.sendText(uploadFileButton, Util.getPathOfImage(), driver);
    }

    public void clickSubmit(WebDriver driver) {
        CommonHelper.clickAfterAlert(submitButton,driver);
    }


    public void verifySuccessMessage(WebDriver driver) {
        CommonHelper.verifyElementAppears(successfullyMessagePage, driver);
    }

    public void clickBackHome(WebDriver driver) {
        CommonHelper.clickWhenReady(backHomeButton, driver);
    }

    public void verifyHomePageAgain(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }

}





