package test_pages.products;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.login.LoginObjects;
import test_objects.products.SelectionProductsObjects;
import test_pages.BasePage;

public class SelectionProductsPage extends BasePage {
    public SelectionProductsPage(ChromeDriver driver) { super(driver); }

    @FindBy(css= SelectionProductsObjects.idAdvikUnderwear)
    public WebElement idAdvikUnderwear;

    public WebElement getIdAdvikUnderwear() { return idAdvikUnderwear; }
}
