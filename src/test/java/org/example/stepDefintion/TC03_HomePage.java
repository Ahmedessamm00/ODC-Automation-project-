package org.example.stepDefintion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class TC03_HomePage  {
        P03_HomePage Currency = new P03_HomePage();

        @When("click on customer currency")
        public void ChangeCurrency() throws InterruptedException {
                WebElement dropdown = Currency.ChangeCurrency();
                Select select = new Select(dropdown);
                select.selectByVisibleText("Euro");
                Thread.sleep(2000);
        }
        @Then("choose euro currency")
        public void click_on_the_currency_box_and_choose_euro()
        {
                for (int i = 0; i< Currency.CheckProducts().size();i++)
                {
                        boolean Euro = Currency.CheckProducts().get(i).getText().contains("€");
                        Assert.assertTrue(Euro);
 }
        }
}