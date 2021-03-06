package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod(){
        getDriver().navigate().to("https://demoqa.com/modal-dialogs");
    }

    // TC54 - verify small modal dialog
    @Test(priority = 1)
    public void testSmallModalDialog(){
        modalDialogsPage.clickSmallModalButton();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog")));
        Assert.assertEquals(modalDialogsPage.modalBodyText(), "This is a small modal. It has very less content");
        modalDialogsPage.clickCloseSmallModalButton();
    }

    // TC54 - verify large modal dialog
    @Test(priority = 2)
    public void testLargeModalDialog(){
        modalDialogsPage.clickLargeModalButton();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog")));
        Assert.assertEquals(modalDialogsPage.modalBodyText(), "Lorem Ipsum is simply dummy text of the printing " +
                "and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining " +
                "essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum.");
        modalDialogsPage.clickCloseLargeModalButton();
    }
}
