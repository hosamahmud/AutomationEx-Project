package automationexerciseTestCase1;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase1Helper extends AutomationExerciseTestCase1Po {

    public <WebDriver> AutomationExerciseTestCase1Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    //AutomationExerciseTestCase1Constants automationExerciseTestCase1Constants = new AutomationExerciseTestCase1Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }
    public void clickSignUpLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(signupLoginButton, driver);
    }

    public void verifyNewUserSignUp(WebDriver driver) {
        CommonHelper.verifyElementAppears(signupPage, driver);
    }

    public void typeMyName(WebDriver driver) {
        CommonHelper.sendText(nameSignUpTexBox, Util.getFirstName(), driver);
    }



    public void typeMyEmail(WebDriver driver) {
        CommonHelper.sendText(emailSignUpTextBox, Util.getEmailAddress(), driver);
    }

    public void clickSignUp(WebDriver driver) {
        CommonHelper.clickWhenReady(signUpBotton, driver);
    }

    public void login(WebDriver driver){
        this.typeMyName(driver);
        this.typeMyEmail(driver);
        this.clickSignUp(driver);
    }

    public void verifyInformationPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(accountInformationPage, driver);
    }

    public void clickGender(WebDriver driver) {
        CommonHelper.clickWhenReady(checkGenderBox, driver);
    }

    public void EnterPassword(WebDriver driver) {
        CommonHelper.sendText(passwordTextBox, Util.getPassword(), driver);
    }

    public void selectTheYear(WebDriver driver) {
        CommonHelper.selectFromDropDownByText(yearsBotton, Util.getYear(), driver);
    }

    public void selectTheMonth(WebDriver driver) {
        CommonHelper.selectFromDropDownByText(monthsBotton, Util.getMonth(), driver);
    }
    public void selectTheDay(WebDriver driver) {
        CommonHelper.selectFromDropDownByText(daysBotton, Util.getDay(), driver);
    }

    public void clickSignUpNewsletter(WebDriver driver) {
        CommonHelper.scrollToElement(signupFornewsellerCheck,driver);
        CommonHelper.clickWhenReady(signupFornewsellerCheck, driver);
    }

    public void clickReceiveOffers(WebDriver driver) {
        CommonHelper.scrollToElement(getMessageCheck,driver);
        CommonHelper.clickWhenReady(getMessageCheck, driver);
    }

    public void enterFirstName(WebDriver driver) {
        CommonHelper.scrollToElement(firstnameTextBox,driver);
        CommonHelper.sendText(firstnameTextBox, Util.getFirstName(), driver);
    }
    public void enterLastName(WebDriver driver) {
        CommonHelper.scrollToElement(lastnameTextBox,driver);
        CommonHelper.sendText(lastnameTextBox, Util.getLastName(), driver);
    }
    public void enterCompanyName(WebDriver driver) {
        CommonHelper.scrollToElement(companyTextBox,driver);
        CommonHelper.sendText(companyTextBox, Util.getCompanyName(), driver);
    }
    public void enterAddress(WebDriver driver) {
        CommonHelper.scrollToElement(addressTextBox,driver);
        CommonHelper.sendText(addressTextBox, Util.getAddress(), driver);
    }
    public void enterAddress2(WebDriver driver) {
        CommonHelper.scrollToElement(address2TextBox,driver);
        CommonHelper.sendText(address2TextBox, Util.getAddress2(), driver);
    }
    public void selectTheCountry(WebDriver driver) {
        CommonHelper.scrollToElement(countryTextBox,driver);
        CommonHelper.selectFromDropDownByText(countryTextBox, Util.getCountry(), driver);
    }
    public void enterState(WebDriver driver) {
        CommonHelper.scrollToElement(stateTextBox,driver);
        CommonHelper.sendText(stateTextBox, Util.getState(), driver);
    }
    public void enterCity(WebDriver driver) {
        CommonHelper.scrollToElement(cityTextBox,driver);
        CommonHelper.sendText(cityTextBox, Util.getCity(), driver);
    }
    public void enterZipCode(WebDriver driver) {
        CommonHelper.scrollToElement(zipcodeTextBox,driver);
        CommonHelper.sendText(zipcodeTextBox, Util.getZipCode(), driver);
    }
    public void enterMobileNumber(WebDriver driver) {
        CommonHelper.scrollToElement(mobilenumberTextBox,driver);
        CommonHelper.sendText(mobilenumberTextBox, Util.getMobileNumber(), driver);
    }
    public void clickCreateAccount(WebDriver driver) {
        CommonHelper.clickWhenReady(createAccountTextBox, driver);
    }

    public void creatingAccount(WebDriver driver){
        this.clickGender(driver);
        this.EnterPassword(driver);
        this.selectTheYear(driver);
        this.selectTheMonth(driver);
        this.selectTheDay(driver);
        this.clickSignUpNewsletter(driver);
        this.clickReceiveOffers(driver);
        this.enterFirstName(driver);
        this.enterLastName(driver);
        this.enterLastName(driver);
        this.enterCompanyName(driver);
        this.enterAddress(driver);
        this.enterAddress2(driver);
        this.selectTheCountry(driver);
        this.enterState(driver);
        this.enterCity(driver);
        this.enterZipCode(driver);
        this.enterMobileNumber(driver);
        this.clickCreateAccount(driver);
    }
    public void verifyAccountCreated(WebDriver driver) {
        CommonHelper.verifyElementAppears(accountCreatedText, driver);
    }
    public void clickContinue1(WebDriver driver) {
        CommonHelper.clickWhenReady(continue1Button, driver);
    }
    public void verifyLoggedIN(WebDriver driver) {
        CommonHelper.verifyElementAppears(loggedInText, driver);
    }
    public void clickDeleteAccount(WebDriver driver) {
        CommonHelper.clickWhenReady(deleteAccountButton, driver);
    }
    public void verifyAccountDeleted(WebDriver driver) {
        CommonHelper.verifyElementAppears(accountDeletedText, driver);
    }
    public void clickContinue2(WebDriver driver) {
        CommonHelper.clickWhenReady(continue2Button, driver);
    }

}





