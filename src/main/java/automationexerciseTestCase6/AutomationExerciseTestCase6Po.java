package automationexerciseTestCase6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase6Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "//a[text()=' Contact us']")
    WebElement contactUsButton;

    @FindBy(xpath = "//input[@data-qa='name']")
    WebElement nameContactUsTexBox;

    @FindBy(xpath = "//input[@data-qa='email']")
    WebElement emailContactUsTextBox;

    @FindBy(xpath = "//input[@data-qa='subject']")
    WebElement subjectTextBox;

    @FindBy(xpath = "//textarea[@data-qa='message']")
    WebElement messageTextArea;

    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFileButton;

    @FindBy(xpath = "//input[@data-qa='submit-button']")
    WebElement submitButton;

    @FindBy(xpath = "(//div[normalize-space() ='Success! Your details have been submitted successfully.'])[1]")
    WebElement successfullyMessagePage;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement backHomeButton;


}
