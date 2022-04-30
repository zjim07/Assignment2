package app.pom;

import app.shared.Products;
import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blouses extends SystemBar {
    public Blouses() {
        PageFactory.initElements(driver, this);
    }
    //@FindBy(xpath = "//*[@id=block_top_menu]ul_li[1]_ul_li[1]_ul_li[2]_a")
    //public WebElement womenHoverMenuTopsBlousesButton();


    public void hoverOverWomenTopsButton() {
      //  hoverOverElement(womenButton());
    }

    public Blouses clickWomenHoverMenuTopsBlousesButton() {
       // safeClickOnElement(womenHoverMenuTopsBlousesButton);

        return new Blouses();

    }
}
