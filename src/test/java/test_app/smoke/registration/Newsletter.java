package test_app.smoke.registration;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class Newsletter extends TestBasePage {
    @Test
    public static void testNewsletterSearchBox() {
        Homepage homepage = new Homepage();
        homepage.newsletterSearBox.sendKeys("lapaloma67@gmail.com");
        homepage.searchBoxField.sendKeys(Keys.ENTER);
        String actualText = driver.findElement(By.xpath("//input[@class='inputNew form-control grey newsletter-input']")).getText();
        String expectedText = "";
        Assert.assertEquals(actualText, expectedText);

    }
}
