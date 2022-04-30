package test_app.smoke.transactions;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class WomenDresses extends TestBasePage {

    @Test
    public void testColorfulDress() {
        Homepage homepage =new Homepage();
        homepage.womenSearchButton.click();
        homepage.colorfulDressCheckbox.click();
        Assert.assertFalse(isElementVisible(homepage.colorfulDress));

    }

    @Test
    public void testMaxiDress() {
        Homepage homepage = new Homepage();
        homepage.womenSearchButton.click();
        homepage.maxiDressCheckbox.click();
        Assert.assertFalse(isElementVisible(homepage.maxiDress));

    }

    @Test
    public void testMidiDress() {
        Homepage homepage = new Homepage();
        homepage.womenSearchButton.click();
        homepage.midiDressCheckbox.click();
        Assert.assertFalse(isElementVisible(homepage.midiDress));
    }


    @Test
    public void testShortDress() {
        Homepage homepage = new Homepage();
        homepage.womenSearchButton.click();
        homepage.shortDressCheckbox.click();
        Assert.assertFalse(isElementVisible(homepage.shortDress));
    }
}
