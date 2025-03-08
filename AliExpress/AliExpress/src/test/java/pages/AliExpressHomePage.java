package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.LoggerUtils;

public class AliExpressHomePage extends BasePage {



    @FindBy(xpath = "//input[@placeholder='Search in Ali Express']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@tabindex='2']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()= 'Help & Support']")
    public WebElement helpAndSupport;

    @FindBy(xpath = " //a[text()='Help Center']")
    public WebElement selectHelpCenterHref;


    String visibleText = "";

    public AliExpressHomePage(WebDriver driver) {
        super(driver);
    }


    public void setSearchText(String searchText) {
        try {
            this.visibleText = searchText;
            searchBox.sendKeys(searchText);
        } catch (Exception e) {
            LoggerUtils.logError("Error setting search text: " + searchText, e);
        }
    }

    public <T> T clickSearchButton() {
        try {
            searchButton.click();

            if (visibleText.equals("Earrings")) {
                return (T) PageFactory.initElements(driver, AliExpressAccessoriesPage.class);
            } else if (visibleText.equals("Flowers")) {
                return (T) PageFactory.initElements(driver, AliExpressBagsPage.class);
            } else if (visibleText.equals("Flowers")) {
                return (T) PageFactory.initElements(driver,AliExpressShoesPage.class);
            } else if (visibleText.equals("Flowers")) {
                return (T) PageFactory.initElements(driver,AliExpressHomeAndGarden.class);
            }  else  {
            return (T) PageFactory.initElements(driver,AliExpressHelpPage.class);
        }
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking search button for visibleText: " + visibleText, e);
            return null;
        }
    }

    public void clickHelpAndSupport() {
        try {
            helpAndSupport.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Help and Support", e);
        }
    }

    public AliExpressHelpPage clickSelectHelpCenterHref() {
        try {
            selectHelpCenterHref.click();
            return PageFactory.initElements(driver, AliExpressHelpPage.class);
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Select Help Center Href", e);
            return null;
        }
    }

}