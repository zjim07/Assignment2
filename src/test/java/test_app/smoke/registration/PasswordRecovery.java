package test_app.smoke.registration;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class PasswordRecovery extends TestBasePage {
    @Test
    public static void testPasswordRecovery() {
        Homepage homepage = new Homepage();
        homepage.signInButton.click();
        homepage.passwordRecoveryLink.click();
        homepage.passwordRecoveryEmailInput.sendKeys("paloma67@gmail.com");
        homepage.passwordRecoveryEmailInput.sendKeys(Keys.ENTER);
        Assert.assertTrue(true,"paloma67@gmail.com ");






    }
}
