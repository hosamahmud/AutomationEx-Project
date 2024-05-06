package automationexerciseTestCase13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase13Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "(//a[contains(text(), 'View Product')])[10]")
    WebElement viewProductButton;

    @FindBy(xpath = "//div[@class='product-information']")
    WebElement productPage;

    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantityTextBox;

    @FindBy(xpath = "//button[normalize-space() ='Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='text-center']/a/u[text()='View Cart']")
    WebElement viewCartButton;

    @FindBy(xpath = "//button[text()='4']")
    WebElement correctQuantityPage;

}
