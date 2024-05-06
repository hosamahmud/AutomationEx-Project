package automationexerciseTestCase3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase3Po {

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

    @FindBy(xpath = "//p[contains(text(), 'Your email or password is incorrect!')]")
    WebElement incorrectLoginText;

}
