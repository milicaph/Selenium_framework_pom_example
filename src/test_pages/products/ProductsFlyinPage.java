package test_pages.products;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_objects.products.ProductFlyinObjects;
import test_objects.products.SelectionProductsObjects;
import test_pages.BasePage;

public class ProductsFlyinPage extends BasePage {
    public ProductsFlyinPage(ChromeDriver driver) { super(driver); }

    @FindBy(xpath= ProductFlyinObjects.buttonFocus)
    public WebElement buttonFocus;

    @FindBy(xpath= ProductFlyinObjects.buttonIn)
    public WebElement buttonIn;

    @FindBy(css= ProductFlyinObjects.commentTextArea)
    public WebElement commentTextArea;

    @FindBy(xpath= ProductFlyinObjects.requestTextarea)
    public WebElement requestTextarea;

    @FindBy(xpath= ProductFlyinObjects.validateOwnerCommentText)
    public WebElement validateOwnerCommentText;

    @FindBy(xpath= ProductFlyinObjects.validateOwner2CommentText)
    public WebElement validateOwner2CommentText;

    @FindBy(xpath= ProductFlyinObjects.validateNumOfComments2)
    public WebElement validateNumOfComments2;

    @FindBy(xpath= ProductFlyinObjects.validateRequest2Text)
    public WebElement validateRequest2Text;

    @FindBy(xpath= ProductFlyinObjects.validateNumOfRequestComment)
    public WebElement validateNumOfRequestComment;

    public WebElement getButtonFocus() { return buttonFocus; }
    public WebElement getButtonIn() { return buttonIn; }
    public WebElement getCommentTextArea() { return commentTextArea; }
    public WebElement getRequestTextarea() { return requestTextarea; }
    public WebElement getValidateOwnerCommentText() { return validateOwnerCommentText; }
    public WebElement getValidateOwner2CommentText() { return validateOwner2CommentText; }
    public WebElement getValidateNumOfComments2() { return validateNumOfComments2; }
    public WebElement getValidateRequest2Text() { return validateRequest2Text; }
    public WebElement getValidateNumOfRequestComment() { return validateNumOfRequestComment; }

}
