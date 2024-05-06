package automationexerciseTestCase13;

import commonUtils.CommonHelper;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase13Helper extends AutomationExerciseTestCase13Po {
    public <WebDriver> AutomationExerciseTestCase13Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    AutomationExerciseTestCase13Constants automationExerciseTestCase13Constants = new AutomationExerciseTestCase13Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }
    public void clickViewProduct(WebDriver driver) {
        CommonHelper.scrollToElement(viewProductButton,driver);
        CommonHelper.clickWhenReady(viewProductButton, driver);
    }

    public void verifyCartPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(productPage, driver);
    }

    public void addingQuantity(WebDriver driver) {
        CommonHelper.sendClear(quantityTextBox, driver);
        CommonHelper.sendText(quantityTextBox, automationExerciseTestCase13Constants.Quantity, driver);
    }
    public void clickAddToCart(WebDriver driver) {
        CommonHelper.clickWhenReady(addToCartButton, driver);
    }

    public void clickViewCart(WebDriver driver) {
        CommonHelper.clickWhenReady(viewCartButton, driver);
    }

    public void verifyViewCartPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(correctQuantityPage, driver);
    }

}





