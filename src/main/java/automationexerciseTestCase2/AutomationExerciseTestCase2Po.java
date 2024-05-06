package automationexerciseTestCase2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase2Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginButton;

    @FindBy(xpath = "//h2[contains(text(), 'Login to your account')]")
    WebElement loginUserPage;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailLoginUserTextBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement passwordLoginUserTextBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(), 'Logged in as ')]")
    WebElement loggedInText;

    @FindBy(xpath = "//a[contains(text(), ' Delete Account')]")
    WebElement deleteAccountButton;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement accountDeletedText;


}
