package test_pages.files;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.files.CreateFileModalObjects;
import test_pages.BasePage;

public class CreateFileModalPage extends BasePage {
    public CreateFileModalPage(ChromeDriver driver) { super(driver); }

    @FindBy(css= CreateFileModalObjects.inputFileName)
    public WebElement inputFileName;

    @FindBy(css=CreateFileModalObjects.viewCreatedFileCheckbox)
    public WebElement viewCreatedFileCheckbox;

    public WebElement getInputFileName() { return inputFileName; }
    public WebElement getViewCreatedFileCheckbox() { return viewCreatedFileCheckbox; }
}
