package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.LoggerUtils;

public class AliExpressHelpPage extends BasePage{

    @FindBy(xpath= "//span[@class='next-input next-medium next-input-group-auto-width']//input")
    public WebElement helpSearchBox;

    public AliExpressHelpPage(WebDriver driver) {

        super(driver);
    }
    public void setHelpSearchText(String searchText) {
        try {
            helpSearchBox.sendKeys(searchText);
            LoggerUtils.logInfo("Entered search text: " + searchText + " into Help Search Box.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to enter search text into Help Search Box.", e);
        }
    }

}