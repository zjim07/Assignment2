package app.shared;

import app.pom.ContactUs;
import app.pom.Homepage;
import app.pom.Login;
import app.pom.SummerDresses;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='account']")
    public WebElement accountButton;

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a[@title='Women']")
    public WebElement womenButton;

    @FindBy(xpath = "//ul[@style='display: block;']//a[@title='Summer Dresses']")
    public WebElement womenHoverMenuDressesSummerDressesButton;

    @FindBy(xpath = "//a[@title='Contact Us']")
    public WebElement contactButton;

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")
    public WebElement dressesButton;

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
    public WebElement tShirtsButton;

    @FindBy(xpath = "//i[@class='icon-ok']")
    public WebElement addedToCartConfirmation;

    @FindBy(xpath = "//span[@class='cat-name']")
    public WebElement filterConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading  product-listing']")
    public WebElement searchConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement messageSentConfirmation;

    @FindBy(xpath = "//div[@class='fancybox-inner']")
    public WebElement locatorConfirmation;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement newsletterRegistrationConfirmation;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    public WebElement specialsConfirmation;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOutButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public Login clickLoginButton() {
        safeClickOnElement(loginButton);

        return new Login();
    }

    public Homepage clickLogoutButton() {
        safeClickOnElement(signOutButton);

        return new Homepage();
    }

    public ContactUs clickContactButton() {
        safeClickOnElement(contactButton);

        return new ContactUs();
    }

    public void hoverOverWomenButton() {
        hoverOverElement(womenButton);
    }

    public SummerDresses clickWomenHoverMenuDressesSummerDressesButton() {
        safeClickOnElement(womenHoverMenuDressesSummerDressesButton);

        return new SummerDresses();
    }

    public boolean isSignedIn() {
        boolean isSignedIn = false;

        if (isElementVisible(accountButton)) {
            isSignedIn = true;
        }

        return isSignedIn;
    }

}