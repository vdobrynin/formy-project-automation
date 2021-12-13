import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/vasya/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        PageForm.getPage(driver);

        SubmitFormFields.submitForm(driver);

        Banner.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",
                BannerText.getAlertBannerText(driver));

        driver.quit();
    }
}
