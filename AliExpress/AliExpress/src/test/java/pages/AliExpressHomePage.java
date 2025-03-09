package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.LoggerUtils;

public class AliExpressHomePage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Search in AliExpress']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[contains(@class,'search-button')]")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Help & Support']")
    private WebElement helpAndSupport;

    @FindBy(xpath = "//a[text()='Help Center']")
    private WebElement selectHelpCenterHref;

    @FindBy(xpath = "//button[contains(@class, 'categories-button')]")
    private WebElement allCategoriesDropdown;

    @FindBy(xpath = "//a[contains(text(), 'Bundle deals')]")
    private WebElement bundleDealsLink;

    @FindBy(xpath = "//a[contains(text(), 'Top Brands')]")
    private WebElement topBrandsLink;

    @FindBy(xpath = "//h2[contains(text(), 'Today’s deals')]")
    private WebElement todaysDealsHeading;

    @FindBy(xpath = "//a[contains(text(), 'Sign in / Register')]")
    private WebElement signInRegisterButton;

    @FindBy(xpath = "//a[contains(@href, 'cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//a[contains(text(), 'Download the AliExpress app')]")
    private WebElement downloadAppLink;

    @FindBy(xpath = "//div[contains(@class, 'currency-language-dropdown')]")
    private WebElement languageCurrencyDropdown;

    private String visibleText = "";

    public AliExpressHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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

            switch (visibleText.toLowerCase()) {
                case "earrings":
                    return (T) PageFactory.initElements(driver, AliExpressAccessoriesPage.class);
                case "flowers":
                    return (T) PageFactory.initElements(driver, AliExpressBagsPage.class);
                case "shoes":
                    return (T) PageFactory.initElements(driver, AliExpressShoesPage.class);
                case "home and garden":
                    return (T) PageFactory.initElements(driver, AliExpressHomeAndGarden.class);
                default:
                    return (T) PageFactory.initElements(driver, AliExpressHelpPage.class);
            }
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking search button for text: " + visibleText, e);
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

    public void openCategoriesDropdown() {
        try {
            allCategoriesDropdown.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Categories Dropdown", e);
        }
    }

    public void clickBundleDeals() {
        try {
            bundleDealsLink.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Bundle Deals", e);
        }
    }

    public void clickTopBrands() {
        try {
            topBrandsLink.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Top Brands", e);
        }
    }

    public void clickSignInRegister() {
        try {
            signInRegisterButton.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Sign In / Register", e);
        }
    }

    public void clickCart() {
        try {
            cartButton.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Cart button", e);
        }
    }

    public void clickDownloadApp() {
        try {
            downloadAppLink.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error clicking Download App link", e);
        }
    }

    public void openLanguageCurrencyDropdown() {
        try {
            languageCurrencyDropdown.click();
        } catch (Exception e) {
            LoggerUtils.logError("Error opening Language & Currency dropdown", e);
        }
    }
}
