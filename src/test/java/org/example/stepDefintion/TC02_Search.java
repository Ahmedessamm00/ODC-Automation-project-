package org.example.stepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Search;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC02_Search {
    P02_Search search = new P02_Search();
    @Given("User searches with {string}")
    public void Search(String box) {
        search.Search().sendKeys(box);

    }

    @And("Search Show The Result For")
    public void ClickSearch() {
        search.ClickSearch().click();

    }

    @Then("User See The Products {string}")
    public void TheProducts(String search_word) {
        for (int t = 0; t < search.product_found().size(); t++) {
            SoftAssert assertt = new SoftAssert();
            assertt.assertTrue(search.product_found().get(t).getText().toLowerCase().contains(search_word));
            assertt.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
            assertt.assertAll();
        }

    }

    @When("user searches with SerialNumber {string}")
    public void Searchers(String serial) {
        search.Search().sendKeys(serial);
    }

    @Then("User See The Products For SerialNumber {string}")
    public void TheProducts2(String Serial_number) {
        search.ProductClick().get(0).click();
        boolean Serial = search.Serial_NumberList().getText().contains(Serial_number);
        Assert.assertTrue(Serial);
}
}