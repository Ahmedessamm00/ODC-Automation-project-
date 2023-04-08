package org.example.stepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_login;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.stepDefintion.Hooks.driver;

public class TC01_login {
    P01_login login = new P01_login();

    @Given("navigate to url website")
    public void urlWebsite(){
        // 4- Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("go to login page")

    public void loginBtn(){
       login.loginBtn().click();
    }
    @When("enter valid email and password")
    public void validData(){
        login.email().sendKeys("ahmed0@hotmail.com");
        login.password().sendKeys("123456");

    }
    @And("click on login button")
    public void LoginButton(){
        login.LoginButton().click();
    }
    @Then("verify that user logged in successfully")
    public void successLogin() {
        Assert.assertTrue(login.myaccount().isDisplayed());
    }
    @When("enter invalid email and password")
      public void invalid(){
        login.email().sendKeys("ahmed0@hotmail.com");
        login.password().sendKeys("65656456");
}

    @Then("verify that user didn't logged in successfully")
    public  void invalidData(){
        driver.findElement(By.className("validation-summary-errors")).isDisplayed();
    }
    @When("Don't enter email and password")
     public void EmptyPage(){
        login.email().sendKeys("");
        login.password().sendKeys("");
    }
    @Then("Unsuccessfully login")
    public  void Unsuccessfullylogin(){
        driver.findElement(By.cssSelector("#Email-error")).isDisplayed();
    }
}



