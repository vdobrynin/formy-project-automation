import org.openqa.selenium.WebDriver;

public class PageForm extends Form {

    public static void getPage(WebDriver driver) {

        driver.get("https://formy-project.herokuapp.com/form");
    }
}
