package org.example.Pages;

import org.example.stepDefintion.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

import static org.example.stepDefintion.Hooks.driver;

public class P00_Register {

    public WebElement register_page() {

        return driver.findElement(By.className("ico-register"));
    }

    public WebElement Firstname() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement LastName() {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement EnterEmail (){
        return driver.findElement(By.id("Email"));
    }
    public WebElement fieldsPassword () {
        return driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword () {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterButton () {
        return driver.findElement(By.id("register-button"));
    }
    public WebElement SuccessMessage() {
        return driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result"));
    }
}
