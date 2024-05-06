package automationexerciseTestCase24;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase24Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='text-center']/a/u[text()='View Cart']")
    WebElement viewCartButton;

    @FindBy(xpath = "//li[text()='Shopping Cart']")
    WebElement shoppingCartPage;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//p[@class='text-center']/a/u[text()='Register / Login']")
    WebElement registerLoginButton;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement signUpNameTextBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmailTextBox;

    @FindBy(xpath = "//h2[normalize-space() = 'Enter Account Information']")
    WebElement accountInformationPage;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement checkGenderBox;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearsButton;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthsButton;

    @FindBy(xpath = "//select[@id='days']")
    WebElement daysButton;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement signupForNewSellerCheck;

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
    WebElement mobileNumberTextBox;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountTextBox;


    @FindBy(xpath = "//h2[@data-qa='account-created']")
    WebElement   accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continue1Button;


    @FindBy(xpath = "//a[contains(text(), 'Logged in as ')]")
    WebElement loggedInText;

    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartButton;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    WebElement processToCheckButton;

    @FindBy(xpath = "//h2[text()='Address Details']")
    WebElement addressPageMessage;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    WebElement reviewOrderMessage;

    @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageBoxArea;

    @FindBy(xpath = "//a[text()='Place Order']")
    WebElement placeOrder;

    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardBox;

    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumberBox;

    @FindBy(xpath = "//input[@name='cvc']")
    WebElement cvcBox;

    @FindBy(xpath = "//input[@name='expiry_month']")
    WebElement expiryMonthBox;

    @FindBy(xpath = "//input[@name='expiry_year']")
    WebElement expiryYearBox;

    @FindBy(xpath = "//button[@id = 'submit']")
    WebElement payAndConfirmButton;

    @FindBy(xpath = "//p[contains(text(), 'Congratulations! Your order has been confirmed!')]")
    WebElement confirmedMessage;

    @FindBy(xpath = "//a[contains(text(), 'Download Invoice')]")
    WebElement downloadInvoiceButton;

    @FindBy(xpath = "//a[@data-qa = 'continue-button']")
    WebElement ContinueAfterDownloadButton;

    @FindBy(xpath = "//a[contains(text(), ' Delete Account')]")
    WebElement deleteAccountButton;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continue2Button;

}
