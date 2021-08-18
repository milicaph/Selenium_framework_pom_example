package test_pages.welcome;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.login.LoginObjects;
import test_objects.welcome.WelcomeObjects;
import test_pages.BasePage;

public class WelcomePage extends BasePage {
    public WelcomePage(ChromeDriver driver) { super(driver); }

    @FindBy(xpath= WelcomeObjects.changeWorkspaceButton)
    public WebElement changeWorkspaceButton;

    @FindBy(xpath=WelcomeObjects.selectAppButton)
    public WebElement selectAppButton;

    @FindBy(css=WelcomeObjects.workspaceRadio2)
    public WebElement workspaceRadio2;

    @FindBy(css=WelcomeObjects.workspaceRadio3)
    public WebElement workspaceRadio3;

    public WebElement getChangeWorkspaceButton() { return changeWorkspaceButton; }
    public WebElement getSelectAppButton() { return selectAppButton; }
    public WebElement getWorkspaceRadio2() { return workspaceRadio2; }
    public WebElement getWorkspaceRadio3() { return workspaceRadio3; }

}
