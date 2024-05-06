package automationexerciseTestCase18;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseTestCase18Po {

    @FindBy(xpath = "//a[text()=\" Home\"]")
    WebElement homePage;

    @FindBy(xpath = "//h2[text()='Category']")
    WebElement categoryText;

    @FindBy(xpath = "//a[@href='#Women']")
    WebElement womenCategoryButton;

    @FindBy(xpath = "(//a[text()='Dress '])[1]")
    WebElement dressButton;

    @FindBy(xpath = "//h2[contains(text(), 'Women - Dress Products')]")
    WebElement womenDressPage;

    @FindBy(xpath = "//a[@href='#Men']")
    WebElement menCategoryButton;

    @FindBy(xpath = "(//a[text()='Jeans '])[1]")
    WebElement jeansButton;

    @FindBy(xpath = "//h2[contains(text(), 'Men - Jeans Products')]\n")
    WebElement menJeansPage;


}
