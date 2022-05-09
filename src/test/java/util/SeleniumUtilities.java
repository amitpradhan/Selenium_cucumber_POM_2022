package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SeleniumUtilities extends BasePage {

//    protected WebDriver driver;

    public SeleniumUtilities(WebDriver driver) {
        super(driver);
    }

    public static void addToCart(WebElement addToCartButton){
        addToCartButton.click();

    }
}
