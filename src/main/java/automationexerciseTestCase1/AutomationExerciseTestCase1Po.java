package automationexerciseTestCase1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase1Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    WebElement signupLoginButton;

    @FindBy(xpath = "//h2[contains(text(), 'New User Signup!')]")
    WebElement signupPage;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement nameSignUpTexBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailSignUpTextBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpBotton;

    @FindBy(xpath = "//h2[normalize-space() = 'Enter Account Information']")
    WebElement accountInformationPage;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement checkGenderBox;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearsBotton;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthsBotton;

    @FindBy(xpath = "//select[@id='days']")
    WebElement daysBotton;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement signupFornewsellerCheck;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement getMessageCheck;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    WebElement firstnameTextBox;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    WebElement lastnameTextBox;

    @FindBy(xpath = "//input[@data-qa='company']")
    WebElement companyTextBox;

    @FindBy(xpath = "//input[@data-qa='address']")
    WebElement addressTextBox;

    @FindBy(xpath = "//input[@data-qa='address2']")
    WebElement address2TextBox;

    @FindBy(xpath = "//input[@data-qa='state']")
    WebElement stateTextBox;

    @FindBy(xpath = "//input[@data-qa='city']")
    WebElement cityTextBox;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    WebElement zipcodeTextBox;

    @FindBy(xpath = "//select[@data-qa='country']")
    WebElement countryTextBox;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    WebElement mobilenumberTextBox;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountTextBox;


    @FindBy(xpath = "//h2[@data-qa='account-created']")
    WebElement   accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continue1Button;


    @FindBy(xpath = "//a[contains(text(), 'Logged in as ')]")
    WebElement loggedInText;

    @FindBy(xpath = "//a[contains(text(), ' Delete Account')]")
    WebElement deleteAccountButton;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continue2Button;


}
