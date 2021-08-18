package test_pages;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public ChromeDriver driver;

    public BasePage (ChromeDriver driver){
        this.driver = driver;
        this.initPage();
    }

    public void initPage(){
        PageFactory.initElements(driver, this);
    }


}
