package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Utilities {

    protected BrowserFactory browserFactory;

    @BeforeMethod
    public void InitializeBrowser() {

        browserFactory = BrowserFactory.getBrowserFactory();
        browserFactory.getDriver().manage().window().maximize();
        browserFactory.getDriver().get("https://www.daraz.lk/");
    }

    @AfterMethod
    public void closeDriver(){

        browserFactory.getDriver().quit();
        browserFactory.threadLocal.remove();
    }
}