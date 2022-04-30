package app.pom;

import app.shared.Products;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses extends Products {


    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=center_column]/ul/li/div/div[1]/div/a[1]/img")
    public WebElement firstItem;

    public static CasualDresses hoverOverFirstItem() {
        //hoverOverFirstItem(firstItem);
        return new CasualDresses();
    }



    private void hoverOverFirstItem(WebElement firstItem) {
    }
}