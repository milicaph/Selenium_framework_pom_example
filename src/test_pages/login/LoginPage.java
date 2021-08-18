package test_pages.login;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.login.LoginObjects;
import test_pages.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(ChromeDriver driver) { super(driver); }

    @FindBy(css= LoginObjects.inputEmail)
    public WebElement emailInput;

    @FindBy(css=LoginObjects.inputPassword)
    public WebElement passwordInput;

    @FindBy(css=LoginObjects.loginButton)
    public WebElement loginButton;

    public WebElement getEmailInput() { return emailInput; }
    public WebElement getPasswordInput() { return passwordInput; }
    public WebElement getLoginButton() { return loginButton; }
    public void logInToKollekt(String username, String password) {
        getEmailInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getLoginButton().click();
    }
}

