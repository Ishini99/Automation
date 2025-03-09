package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.LoggerUtils;

public class AliExpressHomeAndGarden extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Boxes')]")
    public WebElement categoryBoxes;

    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    public WebElement categoryBags;

    @FindBy(xpath = "//span[contains(text(),'Storage Box')]")
    public WebElement categoryStorageBox;

    @FindBy(xpath = "//span[contains(text(),'Artificial Flower')]")
    public WebElement categoryArtificialFlower;

    @FindBy(xpath = "//span[contains(text(),'Kitchen Gadget Sets')]")
    public WebElement categoryKitchenGadgetSets;

    @FindBy(xpath = "//span[contains(text(),'Table Decoration & Accessories')]")
    public WebElement categoryTableDecoration;

    public AliExpressHomeAndGarden(WebDriver driver) {
        super(driver);
    }
    public void categoryBoxes() {
        try {
            categoryBoxes.click();
            LoggerUtils.logInfo("Clicked on category Boxes.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on category Boxes.", e);
        }
    }
        public void categoryBags() {
            try {
                categoryBags.click();
                LoggerUtils.logInfo("Clicked on category Bags");
            } catch (Exception e) {
                LoggerUtils.logError("Failed to click on category Bags.", e);
            }
        }
    public void categoryArtificialFlower() {
        try {
            categoryArtificialFlower.click();
            LoggerUtils.logInfo("Clicked on category Artificial Flower.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on category Artificial Flower.", e);
        }
    }
    public void categoryKitchenGadgetSets() {
        try {
            categoryKitchenGadgetSets.click();
            LoggerUtils.logInfo("Clicked on category Kitchen Gadget Sets.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on category Kitchen Gadget Sets.", e);
        }
    }

    public void categoryStorageBox() {
        try {
            categoryStorageBox.click();
            LoggerUtils.logInfo("Clicked on category Storage Box.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on category Storage Box.", e);
        }
    }
    public void categoryTableDecoration() {
        try {
            categoryTableDecoration.click();
            LoggerUtils.logInfo("Clicked on category Table Decoration.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on category Table Decoration..", e);
        }
    }

    }

