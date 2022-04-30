package test_app.smoke.transactions;

import app.pom.Homepage;
import app.pom.SummerDresses;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import java.time.Duration;

public class ShoppingCart extends TestBasePage {

    //Sami's test code
    @Test
    public void testAddItemToCart() {
        Homepage homepage = new Homepage();
        homepage.hoverOverWomenButton();
        SummerDresses summerDresses = homepage.clickWomenHoverMenuDressesSummerDressesButton();

        summerDresses.setUpperPriceRange(20.00);
        summerDresses.hoverOverFirstItem();
        summerDresses.clickPrintedChiffonDressQuickViewButton();

        int desiredQuantity = 3;
        String size = "M";
        summerDresses.addItemToCart(desiredQuantity, size);

        String expectedMessage = "Product successfully added to your shopping cart";

        Assert.assertEquals(summerDresses.getShoppingCartModalSuccessOrFailMessage(), expectedMessage);
        Assert.assertEquals(summerDresses.getShoppingCartModalQuantityCount(), desiredQuantity);

    }

    @Test
    public void testAddAnItemToCart(){
        Homepage homepage = new Homepage();
        homepage.firstItemOnHomePage.click();
        homepage.addToCartButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(homepage.addToCartCheckmark));
        Assert.assertTrue(isElementVisible(homepage.addToCartCheckmark));
    }

    @Test
    public void testChangeQuantityOfItemsInCart() throws InterruptedException {

        Homepage homepage = new Homepage();
        homepage.firstItemOnHomePage.click();
        homepage.addToCartButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(homepage.proceedToCheckoutButton));
        homepage.proceedToCheckoutButton.click();
        homepage.plusQuantityIcon.click();
        webDriverWait.until(ExpectedConditions.attributeContains(homepage.quantityOfItem, "value", "2"));
        String actualResult = homepage.quantityOfItem.getAttribute("value");
        String expectedResult = "2";

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void deleteAnItemFromCart() throws InterruptedException {

        Homepage homepage = new Homepage();
        homepage.firstItemOnHomePage.click();
        homepage.addToCartButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(homepage.proceedToCheckoutButton));
        homepage.proceedToCheckoutButton.click();
        homepage.deleteCartItem.click();
        webDriverWait.until(ExpectedConditions.invisibilityOf(homepage.deleteCartItem));
        String actualResult = homepage.cartAlertText.getText();
        String expectedResult = "Your shopping cart is empty.";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSearchBar(){
        Homepage homepage = new Homepage();
        homepage.firstItemOnHomePage.click();
        homepage.addToCartButton.click();
        homepage.searchBar.sendKeys("Dresses");
        homepage.submitSearch.click();
        String actualResult = homepage.searchResultsText.getText();
        String expectedResult = "\"DRESSES\"";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLogoIcon(){
        Homepage homepage = new Homepage();
        homepage.firstItemOnHomePage.click();
        homepage.logo.click();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "http://automationpractice.com/index.php";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOrangeFilterButton() {
        Homepage homepage = new Homepage();
        homepage.dressesSection.click();
        homepage.orangeFilter.click();
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(homepage.filterConfirmation, "DRESSES > COLOR ORANGE"));
        String actualResult = homepage.filterConfirmation.getText();
        System.out.println(actualResult);
        String expectedResult = "DRESSES > COLOR ORANGE";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBlackFilterButton(){
        Homepage homepage = new Homepage();
        homepage.dressesSection.click();
        homepage.blackFilter.click();
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(homepage.filterConfirmation, "DRESSES > COLOR BLACK"));
        String actualResult = homepage.filterConfirmation.getText();
        System.out.println(actualResult);
        String expectedResult = "DRESSES > COLOR BLACK";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBlueFilterButton(){
        Homepage homepage = new Homepage();
        homepage.dressesSection.click();
        homepage.blueFilter.click();
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(homepage.filterConfirmation, "DRESSES > COLOR BLUE"));
        String actualResult = homepage.filterConfirmation.getText();
        System.out.println(actualResult);
        String expectedResult = "DRESSES > COLOR BLUE";
        Assert.assertEquals(actualResult, expectedResult);
    }




}
