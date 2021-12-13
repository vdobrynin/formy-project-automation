import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Banner extends Form {

    public static void waitForAlertBanner(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

    }
}
