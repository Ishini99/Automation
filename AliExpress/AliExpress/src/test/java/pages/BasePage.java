package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public AliExpressHomePage loadUrl(String url){
        driver.get(url);
        return PageFactory.initElements(driver, AliExpressHomePage.class);
    }

    public void scrollPage(int scrlX, int scrlY){
        Actions action = new Actions(driver);
        action.scrollByAmount(scrlX, scrlY).perform();
    }
}