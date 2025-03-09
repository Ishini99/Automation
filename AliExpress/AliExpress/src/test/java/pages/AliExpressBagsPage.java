package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class AliExpressBagsPage {
    protected WebDriver driver;

    public AliExpressBagsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AliExpressBagsPage loadUrl(String url) {
        driver.get(url);
        return this;
    }

    public void scrollPage(int scrlX, int scrlY) {
        Actions action = new Actions(driver);
        action.scrollByAmount(scrlX, scrlY).perform();
    }
}
