package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='product-name'])[1]")
    public WebElement firstItemOnHomePage;

    @FindBy(xpath = "//p[@id='add_to_cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//i[@class='icon-ok']")
    public WebElement addToCartCheckmark;

    @FindBy(xpath = "//a[@title = 'Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//i[@class='icon-plus']")
    public WebElement plusQuantityIcon;

    @FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']")
    public WebElement quantityOfItem;

    @FindBy(xpath = "//i[@class='icon-trash']")
    public WebElement deleteCartItem;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement cartAlertText;

    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(name = "submit_search")
    public WebElement submitSearch;

    @FindBy(xpath = "//span[@class='lighter']")
    public WebElement searchResultsText;

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    public WebElement logo;

    @FindBy(xpath = "//i[@class='icon-building']")
    public WebElement myAddresses;

    @FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
    public WebElement updateButton;

    @FindBy(id = "phone_mobile")
    public WebElement mobileNumber;

    @FindBy(id = "submitAddress")
    public WebElement saveButton;

    @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
    public WebElement dressesSection;

    @FindBy(id = "layered_id_attribute_group_13")
    public WebElement orangeFilter;

    @FindBy(xpath = "//span[@class='cat-name']")
    public WebElement filterConfirmation;

    @FindBy(id = "layered_id_attribute_group_11")
    public WebElement blackFilter;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[@class='account']")
    public WebElement confirmSignOut;

    @FindBy(id = "layered_id_attribute_group_14")
    public WebElement blueFilter;
}
