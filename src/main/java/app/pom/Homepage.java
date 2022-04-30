package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {


    public static final String URl = "http://automationpractice.com/index.php";

    // Test 1
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    public WebElement searchBoxField;

    // Test 2
    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchBox;

    //Test 3
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement searchPageErrorMessage;

    //Test 4
    @FindBy(xpath = "//img[@class='logo img-responsive']")
    public WebElement logoBanner;

    // Test 5
    @FindBy(xpath = "//input[@class='inputNew form-control grey newsletter-input']")
    public WebElement newsletterSearBox;


    // Test 6
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;
    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    public WebElement passwordRecoveryLink;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement passwordRecoveryEmailInput;


    // Test 7
    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenSearchButton;
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&amp;controller=category#properties-colorful_dress']")
    public WebElement colorfulDress;
    @FindBy(xpath = "//input[@id='layered_id_feature_5']")
    public WebElement colorfulDressCheckbox;

    // Test 8
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&amp;controller=category#properties-maxi_dress']")
    public WebElement maxiDress;
    @FindBy(xpath = "//input[@id='layered_id_feature_21']")
    public WebElement maxiDressCheckbox;

    // Test 9
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&amp;controller=category#properties-midi_dress']")
    public WebElement midiDress;
    @FindBy(xpath = "//input[@id='layered_id_feature_20']")
    public WebElement midiDressCheckbox;

    // Test 10
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&amp;controller=category#properties-short_dress']")
    public WebElement shortDress;
    @FindBy(xpath = "//input[@id='layered_id_feature_19']")
    public WebElement shortDressCheckbox;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
}

