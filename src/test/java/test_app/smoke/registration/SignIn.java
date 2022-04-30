package test_app.smoke.registration;

import app.pom.Homepage;
import app.pom.Login;
import config.Config;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class SignIn extends TestBasePage {

    @Test
    public void TestSignIn() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));
        String expectedResult = "Bob Bobson";
        String actualResult = login.getUsername.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void changePhoneNumber(){

        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));
        homepage.myAddresses.click();
        homepage.updateButton.click();
        homepage.mobileNumber.clear();
        homepage.mobileNumber.sendKeys("555-555-5555");
        String actualResults = homepage.mobileNumber.getAttribute("value");
        String expectedResults = "555-555-5555";
        Assert.assertEquals(actualResults, expectedResults);
        //Uncomment next line if you actually want to save the change
        //homepage.saveButton.click();
    }

    @Test
    public void testSignOut(){
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();
        login.login(appConfig.get(Config.AppProperties.USER), appConfig.get(Config.AppProperties.PASSWORD));
        homepage.signOutButton.click();
        Assert.assertFalse(homepage.confirmSignOut.isDisplayed());
    }
}
