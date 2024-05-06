package automationexerciseTestCase24;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase24Helper extends AutomationExerciseTestCase24Po {

    public <WebDriver> AutomationExerciseTestCase24Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    AutomationExerciseTestCase24Constants automationExerciseTestCase24Constants = new AutomationExerciseTestCase24Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }

    public void addToCartButton(WebDriver driver) {
        CommonHelper.scrollToElement(addToCartButton, driver);
        CommonHelper.clickWhenReady(addToCartButton, driver);
    }
    public void clickViewCartButton(WebDriver driver) {CommonHelper.clickWhenReady(viewCartButton, driver);}

    public void verifyShoppingPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(shoppingCartPage, driver);
    }

    public void clickProceedToCheckoutButton(WebDriver driver) {CommonHelper.clickWhenReady(proceedToCheckoutButton, driver);}

    public void clickRegisterLoginButton(WebDriver driver) {CommonHelper.clickWhenReady(registerLoginButton, driver);}



    public void typeMyName(WebDriver driver) {
        CommonHelper.sendText(signUpNameTextBox,Util.getFirstName(), driver);
    }

    public void typeMyEmail(WebDriver driver) {
        CommonHelper.sendText(signUpEmailTextBox, Util.getEmailAddress(), driver);
    }

    public void clickSignUp(WebDriver driver) {
        CommonHelper.clickWhenReady(signUpButton, driver);
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
        CommonHelper.selectFromDropDownByText(yearsButton, Util.getYear(), driver);
    }

    public void selectTheMonth(WebDriver driver) {
        CommonHelper.selectFromDropDownByText(monthsButton,Util.getMonth(), driver);
    }
    public void selectTheDay(WebDriver driver) {
        CommonHelper.selectFromDropDownByText(daysButton,Util.getDay(), driver);
    }

    public void clickSignUpNewsletter(WebDriver driver) {
        CommonHelper.scrollToElement(signupForNewSellerCheck,driver);
        CommonHelper.clickWhenReady(signupForNewSellerCheck, driver);
    }

    public void clickReceiveOffers(WebDriver driver) {
        CommonHelper.scrollToElement(getMessageCheck,driver);
        CommonHelper.clickWhenReady(getMessageCheck, driver);
    }

    public void enterFirstName(WebDriver driver) {
        CommonHelper.scrollToElement(firstnameTextBox,driver);
        CommonHelper.sendText(firstnameTextBox,Util.getFirstName(), driver);
    }
    public void enterLastName(WebDriver driver) {
        CommonHelper.scrollToElement(lastnameTextBox,driver);
        CommonHelper.sendText(lastnameTextBox,Util.getLastName(), driver);
    }
    public void enterCompanyName(WebDriver driver) {
        CommonHelper.scrollToElement(companyTextBox,driver);
        CommonHelper.sendText(companyTextBox,Util.getCompanyName(), driver);
    }
    public void enterAddress(WebDriver driver) {
        CommonHelper.scrollToElement(addressTextBox,driver);
        CommonHelper.sendText(addressTextBox,Util.getAddress(), driver);
    }
    public void enterAddress2(WebDriver driver) {
        CommonHelper.scrollToElement(address2TextBox,driver);
        CommonHelper.sendText(address2TextBox,Util.getAddress2(), driver);
    }
    public void selectTheCountry(WebDriver driver) {
        CommonHelper.scrollToElement(countryTextBox,driver);
        CommonHelper.selectFromDropDownByText(countryTextBox,Util.getCountry(), driver);
    }
    public void enterState(WebDriver driver) {
        CommonHelper.scrollToElement(stateTextBox,driver);
        CommonHelper.sendText(stateTextBox,Util.getState(), driver);
    }
    public void enterCity(WebDriver driver) {
        CommonHelper.scrollToElement(cityTextBox,driver);
        CommonHelper.sendText(cityTextBox,Util.getCity(), driver);
    }
    public void enterZipCode(WebDriver driver) {
        CommonHelper.scrollToElement(zipcodeTextBox,driver);
        CommonHelper.sendText(zipcodeTextBox,Util.getZipCode(), driver);
    }
    public void enterMobileNumber(WebDriver driver) {
        CommonHelper.scrollToElement(mobileNumberTextBox,driver);
        CommonHelper.sendText(mobileNumberTextBox,Util.getMobileNumber(), driver);
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
    }
    public void clickCreateAccount(WebDriver driver) {
        CommonHelper.clickWhenReady(createAccountTextBox, driver);
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

    public void clickCartButton(WebDriver driver) {CommonHelper.clickWhenReady(cartButton, driver);}

    public void clickCheckoutButton(WebDriver driver) {CommonHelper.clickWhenReady(processToCheckButton, driver);}

    public void verifyAddressMessage(WebDriver driver) {CommonHelper.verifyElementAppears(addressPageMessage, driver);}

    public void verifyOrderMessage(WebDriver driver) {
        CommonHelper.verifyElementAppears(reviewOrderMessage, driver);
    }

    public void CommentingMessage(WebDriver driver) {
        CommonHelper.scrollToElement(messageBoxArea,driver);
        CommonHelper.sendText(messageBoxArea, automationExerciseTestCase24Constants.yourComment, driver);
    }

    public void clickOrderButton(WebDriver driver) {
        CommonHelper.scrollToElement(placeOrder,driver);
        CommonHelper.clickWhenReady(placeOrder, driver);
    }

    public void enterCreditCardName(WebDriver driver) {
        CommonHelper.scrollToElement(nameOnCardBox,driver);
        CommonHelper.sendText(nameOnCardBox, Util.getNameFromCard(), driver);
    }
    public void enterCreditCardNumber(WebDriver driver) {
        CommonHelper.scrollToElement(cardNumberBox,driver);
        CommonHelper.sendText(cardNumberBox, Util.getTheCardNumber(), driver);
    }
    public void enterCreditCardCVC(WebDriver driver) {
        CommonHelper.scrollToElement(cvcBox,driver);
        CommonHelper.sendText(cvcBox,Util.getCvc(), driver);
    }
    public void enterCreditCardMEX(WebDriver driver) {
        CommonHelper.scrollToElement(expiryMonthBox,driver);
        CommonHelper.sendText(expiryMonthBox,Util.getMonthExpiration(), driver);
    }
    public void enterCreditCardYEX(WebDriver driver) {
        CommonHelper.scrollToElement(expiryYearBox,driver);
        CommonHelper.sendText(expiryYearBox,Util.getYearExpiration() , driver);
    }
    public void addingCreditCardData(WebDriver driver){
        this.enterCreditCardName(driver);
        this.enterCreditCardNumber(driver);
        this.enterCreditCardCVC(driver);
        this.enterCreditCardMEX(driver);
        this.enterCreditCardYEX(driver);

    }


    public void clickPayAndConfirmOrder(WebDriver driver) {CommonHelper.clickWhenReady(payAndConfirmButton, driver);}

    public void verifySuccessMessage(WebDriver driver) {
        CommonHelper.verifyElementAppears(confirmedMessage, driver);
    }

    public void clickDownloadInVoice(WebDriver driver) {CommonHelper.clickWhenReady(downloadInvoiceButton, driver);}


    public void clickContinueAfterDownloadInVoice(WebDriver driver) {CommonHelper.clickWhenReady(ContinueAfterDownloadButton, driver);}


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





