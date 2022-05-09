package stepdefs;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import util.ConfigLoader;


public class Add_to_cart_stepdef {

    private WebDriver driver ;
    private HomePage homePage;
    private CartPage cartPage;

    @Given("I login as {string} user")
    public void iLoginAsUser(String userType) {
        driver = DriverFactory.getDriverInstance();
        new LoginPage(driver).login(ConfigLoader.getInstance().getStandardUserId(), ConfigLoader.getInstance().getPwd());
    }

    @Then("I add a {string} to the cart")
    public void iAddToTheCart(String itemName) {
        homePage = new HomePage(driver);
        homePage.addToCart_homepage(itemName);
    }

    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(Integer noOfcartItems, String string) {
        homePage.gotToCart();
        cartPage = new CartPage(driver);
        Assert.assertEquals(Integer.toString(noOfcartItems), cartPage.getCartTextNumber());
    }


    @Then("I should see all the items in the cart")
    public void iShouldSeeAllTheItemsInTheCart() {
        homePage.gotToCart();
        cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.checkAllItemsAddedToCart());
    }

    @Then("I should see all the items in the cart with below data")
    public void iShouldSeeAllTheItemsInTheCartWithBelowData(DataTable dataTable) {
        cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.checkAllItemsAddedToCartUsingDatatable(dataTable.values()));
    }

//     @Then("I add a {string} to the cart using example")
//    public void iAddAToTheCartUsingExample(String productName) {
//
//    }
//
//    @Then("I should see {int} {string} in the cart using example")
//    public void iShouldSeeInTheCartUsingExample(int quantity, String productName) {
//    }
}

