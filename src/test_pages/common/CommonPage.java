package test_pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import test_objects.common.CommonObjects;
import test_objects.files.FilesObjects;
import test_pages.BasePage;

public class CommonPage extends BasePage {

    public CommonPage(ChromeDriver driver) { super(driver); }

    @FindBy(xpath= CommonObjects.buttonSave)
    public WebElement buttonSave;

    @FindBy(xpath= CommonObjects.buttonSubmit)
    public WebElement buttonSubmit;

    @FindBy(css=CommonObjects.buttonConfirm)
    public WebElement buttonConfirm;

    @FindBy(xpath=CommonObjects.userIcon)
    public WebElement userIcon;

    @FindBy(xpath=CommonObjects.buttonSignOut)
    public WebElement buttonSignOut;

    public WebElement getButtonSave() { return buttonSave; }
    public WebElement getButtonConfirm() { return buttonConfirm; }
    public WebElement getButtonSubmit() { return buttonSubmit; }
    public WebElement getUserIcon() { return userIcon; }
    public WebElement getButtonSignOut() { return buttonSignOut; }
    public void logOut() {
        userIcon.click();
        buttonSignOut.click();
    }
}
