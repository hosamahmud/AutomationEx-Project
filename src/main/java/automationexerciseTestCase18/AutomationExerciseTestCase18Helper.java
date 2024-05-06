package automationexerciseTestCase18;

import commonUtils.CommonHelper;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseTestCase18Helper extends AutomationExerciseTestCase18Po {

    public <WebDriver> AutomationExerciseTestCase18Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    //AutomationExerciseTestCase18Constants automationExerciseTestCase18Constants = new AutomationExerciseTestCase18Constants();

    public void verifyHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(homePage, driver);
    }

    public void categoryText(WebDriver driver) {
        CommonHelper.verifyElementAppears(categoryText, driver);
    }

    public void clickWomenButton(WebDriver driver) {
        CommonHelper.clickWhenReady(womenCategoryButton, driver);
    }

    public void clickDressButton(WebDriver driver) {
        CommonHelper.scrollToElement(dressButton, driver);
        CommonHelper.clickWhenReady(dressButton, driver);
    }

    public void verifyWomenDressPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(womenDressPage, driver);
    }

    public void clickMenButton(WebDriver driver) {
        CommonHelper.clickWhenReady(menCategoryButton, driver);
    }

    public void clickJeansButton(WebDriver driver) {
        CommonHelper.clickWhenReady(jeansButton, driver);
    }

    public void verifyMenJeansPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(menJeansPage, driver);
    }


}





