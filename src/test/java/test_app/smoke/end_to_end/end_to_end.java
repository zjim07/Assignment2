package test_app.smoke.end_to_end;

import app.pom.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;
import utils.GenerateData;

public class end_to_end extends TestBasePage {

    @Test
    public void testEndToEndProcess() {
        Homepage homepage = new Homepage();
        Login login = homepage.clickLoginButton();

        String emailAddress = GenerateData.email();
        CreateAccount createAccount = login.createAccount(emailAddress);

        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();
        createAccount.registerNewUser(firstName, lastName, password, day, monthNumber, year,
                streetAddress, city, state, zipCode, phoneNumber);

        Catalog catalog = homepage.selectTShirtOption();
        catalog.clickFadedShortSleeveOption();
        catalog.setProductQuantity(2);
        catalog.selectSize(0);
        catalog.pressAddToCartButton();
        catalog.clickCheckoutButton();
        catalog.clickConfirmShoppingCart();
        catalog.clickAddressConfirmation();
        catalog.checkToAgreeTermsConditions();
        catalog.clickDeliveryOptionConfirmation();
        catalog.clickBankWireOption();
        catalog.clickOrderConfirmationButton();
        catalog.clickBackToOrdersButton();
        catalog.clickOrderRef();

        Assert.assertTrue(isElementVisible(catalog.orderRef));
    }
}