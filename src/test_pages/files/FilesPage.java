package test_pages.files;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.files.FilesObjects;
import test_pages.BasePage;

public class FilesPage extends BasePage {

    public FilesPage(ChromeDriver driver) { super(driver); }

    @FindBy(xpath=FilesObjects.addFileBottomButton)
    public WebElement addFileBottomButton;

    @FindBy(xpath=FilesObjects.addFolderTopButton)
    public WebElement addFolderTopButton;

    @FindBy(xpath=FilesObjects.addFileTopButton)
    public WebElement addFileTopButton;

    @FindBy(xpath=FilesObjects.addFolderBottomButton)
    public WebElement addFolderBottomButton;

    @FindBy(css=FilesObjects.selectionKLS37)
    public WebElement selectionKLS37;

    @FindBy(css=FilesObjects.selectionKLS177)
    public WebElement selectionKLS177;

    public WebElement getAddFileBottomButton() { return addFileBottomButton; }
    public WebElement getAddFolderTopButton() { return addFolderTopButton; }
    public WebElement getAddFileTopButton() { return addFileTopButton; }
    public WebElement getAddFolderBottomButton() { return addFolderBottomButton; }
    public WebElement getSelectionKLS37() { return selectionKLS37; }
    public WebElement getSelectionKLS177() { return selectionKLS177; }

}
