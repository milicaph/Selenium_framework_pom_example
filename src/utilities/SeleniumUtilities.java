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
/*
    public WebElement waitForElementToBeVisible(String elementLocator, String typeOfLocator) {
        WebElement webElement = null;
        int timeout = 20;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            System.out.println(elementLocator);
            if(typeOfLocator == "css")
                webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementLocator)));
            else if(typeOfLocator == "xpath")
                webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementLocator)));
        } catch (WebDriverException ignored) {
        }

        if (webElement == null) {
            System.out.println("WebElement not found within " + timeout + " seconds. Failing test!" + " of element: " + elementLocator + "\nCurrent page: " + driver.getCurrentUrl());
        }
        return webElement;
    }

*/

    public void clickAndSendKeys(WebElement element, String keysToSend){
        element.click();
        element.sendKeys(keysToSend);
    }

    public void contextClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.contextClick(element).build().perform();
    }
}
