package test.java;

import global.DataProvider_;
import global.ObjectRepo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test_pages.common.CommonPage;
import test_pages.files.FileOverviewPage;
import test_pages.files.FilesPage;
import test_pages.login.LoginPage;
import test_pages.products.ProductsFlyinPage;
import test_pages.products.SelectionProductsPage;
import utilities.GeneralUtilities;
import utilities.SeleniumUtilities;


public class SetupFileTests extends BaseTest{
    SeleniumUtilities selUtils;
    GeneralUtilities genUtils;
    CommonPage commonP;
    LoginPage loginP;
    FilesPage filesP;
    FileOverviewPage fileOverviewP;
    SelectionProductsPage selectionProductsP;
    ProductsFlyinPage productsFlyinP;

    @BeforeMethod(alwaysRun=true)
    public void setUp() {
        selUtils = new SeleniumUtilities(driver);
        genUtils = new GeneralUtilities(driver);
        commonP = new CommonPage(driver);
        loginP = new LoginPage(driver);
        filesP = new FilesPage(driver);
        fileOverviewP = new FileOverviewPage(driver);
        selectionProductsP = new SelectionProductsPage(driver);
        productsFlyinP = new ProductsFlyinPage(driver);
    }

    @Test(dataProviderClass = DataProvider_.class, dataProvider="getOwnersLoginData")
    public void kls44(String username, String password) {
        loginP.logInToKollekt(username, password);
        filesP.getSelectionKLS37().click();
        fileOverviewP.getKls39Selection().click();
        selectionProductsP.getIdAdvikUnderwear().click();
        sleepTest(800);

        if(username.contains(ObjectRepo.so1Username)) {
            productsFlyinP.getButtonFocus().click();
            selUtils.clickAndSendKeys(productsFlyinP.getCommentTextArea(), ObjectRepo.ownerComment1);
        } else if(username.contains(ObjectRepo.so2Username)) {
            productsFlyinP.getButtonIn().click();
            selUtils.clickAndSendKeys(productsFlyinP.getCommentTextArea(), ObjectRepo.ownerComment2);
        }
        commonP.getButtonSubmit().click();
        sleepTest(400);

        if(username.contains(ObjectRepo.so1Username)) {
            selUtils.clickAndSendKeys(productsFlyinP.getRequestTextarea(), ObjectRepo.ownerRequest1);
        }else if(username.contains(ObjectRepo.so2Username)) {
            productsFlyinP.getRequestTextarea().clear();
            selUtils.clickAndSendKeys(productsFlyinP.getRequestTextarea(), ObjectRepo.ownerRequest2);
        }

        commonP.getButtonSave().click();
        sleepTest(400);

        // Validations
        if(username.contains(ObjectRepo.so1Username))
            productsFlyinP.getValidateOwnerCommentText().isDisplayed();
        else if(username.contains(ObjectRepo.so2Username)) {
            productsFlyinP.getValidateOwner2CommentText().isDisplayed();
            productsFlyinP.getValidateNumOfComments2().isDisplayed();
            productsFlyinP.getValidateRequest2Text().isDisplayed();
            productsFlyinP.getValidateNumOfRequestComment().isDisplayed();
        }

        driver.navigate().back();
        sleepTest(600);
        driver.get(ObjectRepo.filesURL);
        commonP.logOut();
    }

    @Test
    public void kls193CopySelectionLink() {
        loginP.logInToKollekt(ObjectRepo.adminEmail, ObjectRepo.universalPassword);
        driver.get("https://staging.kollekt.dk/#/select/files");
        filesP.getSelectionKLS177().click();
        sleepTest(800);
        selUtils.contextClick(fileOverviewP.getSelection1contextClick());
        sleepTest(700);
        fileOverviewP.getDropdownCopySelectionURL().click();
        sleepTest(800);
        String clipboardURL = genUtils.getStringFromClipboard();
        System.out.println(clipboardURL);
        Assert.assertTrue(clipboardURL.contains("https://go.kollekt.dk/"));
    }

}
