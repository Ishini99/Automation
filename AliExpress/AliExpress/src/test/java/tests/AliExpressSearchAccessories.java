package tests;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AliExpressAccessoriesPage;
import pages.AliExpressHomePage;
import pages.BasePage;
import utilities.ExcelUtils;
import utilities.Utilities;

import java.time.Duration;

public class AliExpressSearchAccessories  extends Utilities {
    ExcelUtils excelUtils;

    BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
    WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
    AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
    excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
    String searchTerm = excelUtils.getCellData(0, 0);
        homePage.setSearchText(searchTerm);
    AliExpressAccessoriesPage AccessoriesPage = homePage.clickSearchButton();
        AccessoriesPage.scrollPage(100, 200);
        AccessoriesPage.setMinValue("500");
        AccessoriesPage.setMaxValue("2000");
        AccessoriesPage.scrollPage(100, 200);
        AccessoriesPage.selectCheckBoxLocalSellerWarranty();
        Assert.assertTrue(EarringsPage.isCheckboxSelectedLocalSellerWarranty(), "LocalSellerWarranty checkbox is not selected.");

}
}
