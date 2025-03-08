import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestFile {
    WebDriver driver;

    @BeforeMethod
    public void loadChrome() {
        driver = new ChromeDriver();  // Initialize ChromeDriver
        driver.manage().window().maximize(); // Maximize window
        driver.get("https://www.bing.com/");    }

    @Test
    public void searchAliExpress() {
        // Find the search bar and enter "Ali Express"
        driver.findElement(By.name("q")).sendKeys("ali express" + Keys.ENTER);

        // Explicit wait for search results to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement aliExpressLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'AliExpress')]")));

        // Click the AliExpress link
        aliExpressLink.click();
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
