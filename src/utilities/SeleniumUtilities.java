package utilities;

import org.openqa.selenium.By;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumUtilities {
    private ChromeDriver driver;


    public SeleniumUtilities(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickAndSendKeys(WebElement element, String keysToSend){
        element.click();
        element.sendKeys(keysToSend);
    }

    public void contextClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.contextClick(element).build().perform();
    }
}
