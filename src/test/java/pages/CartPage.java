package pages;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static constants.Constants.*;
import static constants.Constants.ADD_TO_CART_ALL_THE_THINGS_T_SHIRT;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='cart_contents_container']/div/div[1]/div[3]/div[1]")
    WebElement getCartText;


    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement backpack_cart_page;
    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement bike_light_cart_page;
    @FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
    WebElement bolt_t_shirt_cart_page;
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    WebElement osesie_cart_page;
    @FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
    WebElement fleece_jacket_cart_page;
    @FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
    WebElement all_the_things_cart_page;


    public boolean checkAllItemsAddedToCart() {
        if (backpack_cart_page.isDisplayed() && bike_light_cart_page.isDisplayed() && bolt_t_shirt_cart_page.isDisplayed() &&
                bike_light_cart_page.isDisplayed() && bolt_t_shirt_cart_page.isDisplayed() && osesie_cart_page.isDisplayed()
                && bike_light_cart_page.isDisplayed()) {
            return true;
        } else return false;

    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> all_cart_items_label;



    public boolean checkAllItemsAddedToCartUsingDatatable(List<String> cartItemLabelList) {
        boolean isItemPresent = false;
//        System.out.println(cartItemLabelList);
//        System.out.println("***************");
//        System.out.println(all_cart_items_label);

        for (WebElement element:all_cart_items_label) {
//            System.out.println(element.getText());
            isItemPresent = cartItemLabelList.contains(element.getText());
        }

        return isItemPresent;
    }


    public String getCartTextNumber(){
        return getCartText.getText();
    }


}






