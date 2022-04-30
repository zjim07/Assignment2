package app.pom;

import app.shared.SystemBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeWork2 extends SystemBar {

    public static class homeWork2 extends SystemBar {

        public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

        @FindBy(id = "search_query_top")
        public WebElement searchElement;

        @FindBy(id = "searchbox]/button")
        public WebElement searchButton;

        @FindBy(id = "home-page-tabs]/li[1]/a")
        public WebElement PopularButton;

        @FindBy(id = "home-page-tabs]/li[2]/a")
        public WebElement bestSellersButton;

        @FindBy(id = "header]/div[3]/div/div/div[3]/div/a")
        public WebElement addToCartButton;

        @FindBy(id = "block_top_menu]/ul/li[1]/a")
        public WebElement womenButton;

        @FindBy(id = "block_top_menu]/ul/li[2]/a")
        public WebElement dressesButton;

        @FindBy(id = "block_top_menu]/ul/li[3]/a")
        public WebElement tshirtsButton;

        @FindBy(id = "contact-link]/a")
        public WebElement contactUsButton;

        @FindBy(id = "center_column]/form/fieldset/div[1]/div[1]/p[4]/label")
        public WebElement EmailAddressInputField;


        public void clickSerachElement() { jsClickOnElement(searchElement);
        }

        public void clickSerachButton() { jsClickOnElement(searchButton);}

            public void clickPopularButton() { jsClickOnElement(PopularButton);

            }

            public void clickBestSellersButton () {
                jsClickOnElement(bestSellersButton);

            }

            public void addToCartButton() {
            }

            public void womenButton(){


            }

            public void clickDressesButton() {
                jsClickOnElement(dressesButton);

            }

            public void clickTshirtsButton() {
                jsClickOnElement(tshirtsButton);

            }

            public void clickContactUsButton() {
                jsClickOnElement(contactUsButton);

            }

            public void EmailAddressInputField (String emailAddress){
                sendKeysToElement(EmailAddressInputField, emailAddress);

            }
        }

    }

