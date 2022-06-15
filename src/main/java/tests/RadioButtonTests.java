package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTests {

    @Test(priority = 1)
    public void clickRadioButtonTest() {
        elementsPage.openElementsPage();
        elementsPage.clickElementRadioButton();

        radioButtonPage.clickRadioButtonYes();
        Assert.assertEquals(radioButtonPage.getLabelText(), "Yes");
        Assert.assertFalse(radioButtonPage.getRadioButtonImpressive().isSelected());

        radioButtonPage.clickRadioButtonImpressive();
        Assert.assertEquals(radioButtonPage.getLabelText(), "Impressive");
        Assert.assertFalse(radioButtonPage.getRadioButtonYes().isSelected());

        Assert.assertFalse(radioButtonPage.isRadioButtonNoEnabled());
    }
}
