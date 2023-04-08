package org.example.stepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P00_Register;

public class TC00_Register {
    P00_Register register = new P00_Register();

@When("click on register page")
public void register_page(){
   register.register_page().click();
}

    @And("enter first name and last name")
public void FirstAndLastname(){
    register.Firstname().sendKeys("ahmed");
    register.LastName().sendKeys("essam");
}
@And("enter email field")
    public void EnterEmail(){
register.EnterEmail().sendKeys("ahmed0@hotmail.com");
}
@And("enter Password field")
    public void fieldsPassword(){
register.fieldsPassword().sendKeys("123456");
}

@And("enter Confirmed password")
public void PasswordConfirmed(){
    register.ConfirmPassword().sendKeys("123456");
}
@And("clicks on register button")
    public void RegisterButton(){
register.RegisterButton().click();

}
@Then("success message")
    public void SuccessMessage(){
register.SuccessMessage().isDisplayed();
}

}
