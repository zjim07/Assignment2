package test_app.smoke.transactions;

import app.pom.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;



public class SearchBar extends TestBasePage {

    @Test
    public static void testSearchBoxField() {
        Homepage homepage = new Homepage();
        homepage.searchBoxField.sendKeys("summer dresses");
        homepage.searchBoxField.sendKeys(Keys.ENTER);
        String actualText= driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).getText();
        String expectedText = "";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public static void testSearchButton(){
        Homepage homepage =new Homepage();
        homepage.searchBox.click();
        String actualText= String.valueOf(driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).isSelected());
        String expectedText = String.valueOf(driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).isSelected());
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public static void testSearchPageErrorMessage(){
        Homepage homepage =new Homepage();
        homepage.searchBox.click();
        homepage.searchPageErrorMessage.getText();
        String actualText= String.valueOf(driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText());
        String expectedText = String.valueOf(driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText());
        Assert.assertEquals(actualText,expectedText);

    }



}
