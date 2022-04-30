package test_app.smoke.transactions;

import app.pom.Blouses;
import app.pom.CasualDresses;
import app.pom.Homepage;
import app.pom.SummerDresses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static java.awt.SystemColor.text;


public class testHomeWork2 extends TestBasePage {
    @Test
    public void testSearchElement(){
        Homepage homepage = new Homepage();
        WebElement SearchElement = driver.findElement(By.id("search_query_top]"));
        SearchElement.sendKeys("Summer dresses");
         driver.findElement(By.className("submit_search")).click();

    }
    @Test
    public void testWomenButton(){
        Homepage homepage = new Homepage();
        homepage.hoverOverWomenButton();
       // Blouses blouses = homepage.clickWomenHoverMenuTopsBlousesButton();
    }
    @Test
    public void testDressesButton(){
        Homepage homepage = new Homepage();
        homepage.hoverOveAllDressesButton();
        CasualDresses casualDresses = homepage.clickDressesHoverMenuCasualDressesButton();
    }
    @Test
    public void testAddToCartButton(){
        Homepage homepage = new Homepage();
        homepage.hoverOverAllDressesButton();
        CasualDresses casualDresses = homepage.clickDressesHoverMenuCasualDressesButton();

       // CasualDresses.setUpperPriceRange(20.00);
        CasualDresses.hoverOverFirstItem();
        //CasualDresses.clickPrintedChiffonDressQuickViewButton();
    }

}
