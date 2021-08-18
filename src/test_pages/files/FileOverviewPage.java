package test_pages.files;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.files.FileOverviewObjects;
import test_pages.BasePage;

public class FileOverviewPage extends BasePage {

    public FileOverviewPage(ChromeDriver driver) { super(driver); }

    @FindBy(xpath=FileOverviewObjects.addMasterButton)
    public WebElement addMasterButton;

    @FindBy(css= FileOverviewObjects.inputNewMaster)
    public WebElement inputNewMaster;

    @FindBy(xpath=FileOverviewObjects.addSelectionButton)
    public WebElement addSelectionButton;

    @FindBy(css=FileOverviewObjects.inputNewSelection)
    public WebElement inputNewSelection;

    @FindBy(xpath=FileOverviewObjects.buttonEditProducts)
    public WebElement buttonEditProducts;

    @FindBy(css=FileOverviewObjects.kls39Selection)
    public WebElement kls39Selection;

    @FindBy(css=FileOverviewObjects.selection1contextClick)
    public WebElement selection1contextClick;

    @FindBy(xpath=FileOverviewObjects.dropdownCopySelectionURL)
    public WebElement dropdownCopySelectionURL;

    public WebElement getAddMasterButton() { return addMasterButton; }
    public WebElement getInputNewMaster() { return inputNewMaster; }
    public WebElement getAddSelectionButton() { return addSelectionButton; }
    public WebElement getInputNewSelection() { return inputNewSelection; }
    public WebElement getButtonEditProducts() { return buttonEditProducts; }
    public WebElement getKls39Selection() { return kls39Selection; }
    public WebElement getSelection1contextClick() { return selection1contextClick; }
    public WebElement getDropdownCopySelectionURL() { return dropdownCopySelectionURL; }
}
