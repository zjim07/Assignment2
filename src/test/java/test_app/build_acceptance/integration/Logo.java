package test_app.build_acceptance.integration;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class Logo extends TestBasePage {

    @Test
    public static void testLogoBanner() {
        Homepage homepage = new Homepage();
        homepage.logoBanner.getAccessibleName();
        String actualText= driver.findElement(By.xpath("//img[@class='logo img-responsive']")).getText();
        String expectedText = "";
        Assert.assertEquals(actualText,expectedText);


    }
}

