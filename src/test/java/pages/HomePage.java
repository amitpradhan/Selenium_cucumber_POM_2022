package pages;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static util.SeleniumUtilities.addToCart;

import static constants.Constants.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBtn_backpack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartBtn_bike_light;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCartBtn_bolt_t_shirt;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCartBtn_fleece_jacket;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement addToCartBtn_onesie;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement addToCartBtn_all_the_things;

    public void addBackpackToCart(){
        addToCartBtn_backpack.click();
    }

    public void addToCart_homepage(String itemName){
        if(itemName.trim().equals(ADD_TO_CART_BACKPACK.trim()))
            addToCartBtn_backpack.click();
        else if (itemName.trim().equals(ADD_TO_CART_BIKE_LIGHT.trim()))
            addToCartBtn_bike_light.click();
        else if(itemName.trim().equals(ADD_TO_CART_BOLT_T_SHIRT.trim()))
            addToCartBtn_bolt_t_shirt.click();
        else if (itemName.trim().equals(ADD_TO_CART_FLEECE_JACKET.trim()))
            addToCartBtn_fleece_jacket.click();
        else if(itemName.trim().equals(ADD_TO_CART_ONESIE.trim()))
            addToCartBtn_onesie.click();
        else if(itemName.trim().equals(ADD_TO_CART_ALL_THE_THINGS_T_SHIRT.trim()))
            addToCartBtn_all_the_things.click();

    }


    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement  cartLink;

    public void gotToCart(){
        cartLink.click();
    }

}
