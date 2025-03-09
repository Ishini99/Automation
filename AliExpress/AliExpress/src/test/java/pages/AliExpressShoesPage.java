package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.LoggerUtils;

public class AliExpressShoesPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Sneaker')]")
    private WebElement sneakerCategory;

    @FindBy(xpath = "//span[contains(text(),'Casual Sneaker')]")
    private WebElement casualSneakerCategory;

    @FindBy(xpath = "//span[contains(text(),'Mary Janes')]")
    private WebElement maryJanesCategory;

    @FindBy(xpath = "//span[contains(text(),'Skateboard')]")
    private WebElement skateboardCategory;

    @FindBy(xpath = "//span[contains(text(),'Loafers')]")
    private WebElement loafersCategory;

    @FindBy(xpath = "//span[contains(text(),'Leather Shoes')]")
    private WebElement leatherShoesCategory;

    @FindBy(xpath = "//span[contains(text(),'Canvas')]")
    private WebElement canvasCategory;

    @FindBy(xpath = "//span[contains(text(),'Flat Sandals')]")
    private WebElement flatSandalsCategory;

    @FindBy(xpath = "//span[contains(text(),'High-Heeled')]")
    private WebElement highHeeledCategory;

    @FindBy(xpath = "//span[contains(text(),'Stiletto Heel')]")
    private WebElement stilettoHeelCategory;

    @FindBy(xpath = "//span[contains(text(),'Pvc Sandals')]")
    private WebElement pvcSandalsCategory;

    @FindBy(xpath = "//span[contains(text(),'Heeled Sandals')]")
    private WebElement heeledSandalsCategory;

    public AliExpressShoesPage(WebDriver driver) {
        super(driver);
    }

    public void selectSneakerCategory() {
        clickElement(sneakerCategory, "Sneaker");
    }

    public void selectCasualSneakerCategory() {
        clickElement(casualSneakerCategory, "Casual Sneaker");
    }

    public void selectMaryJanesCategory() {
        clickElement(maryJanesCategory, "Mary Janes");
    }

    public void selectSkateboardCategory() {
        clickElement(skateboardCategory, "Skateboard");
    }

    public void selectLoafersCategory() {
        clickElement(loafersCategory, "Loafers");
    }

    public void selectLeatherShoesCategory() {
        clickElement(leatherShoesCategory, "Leather Shoes");
    }

    public void selectCanvasCategory() {
        clickElement(canvasCategory, "Canvas");
    }

    public void selectFlatSandalsCategory() {
        clickElement(flatSandalsCategory, "Flat Sandals");
    }

    public void selectHighHeeledCategory() {
        clickElement(highHeeledCategory, "High-Heeled");
    }

    public void selectStilettoHeelCategory() {
        clickElement(stilettoHeelCategory, "Stiletto Heel");
    }

    public void selectPvcSandalsCategory() {
        clickElement(pvcSandalsCategory, "PVC Sandals");
    }

    public void selectHeeledSandalsCategory() {
        clickElement(heeledSandalsCategory, "Heeled Sandals");
    }

    private void clickElement(WebElement element, String categoryName) {
        try {
            element.click();
            LoggerUtils.logInfo("Clicked on " + categoryName + " category.");
        } catch (Exception e) {
            LoggerUtils.logError("Failed to click on " + categoryName + " category.", e);
        }
    }
}
