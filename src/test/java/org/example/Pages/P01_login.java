package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefintion.Hooks.driver;

public class P01_login {
    public WebElement loginBtn(){
        return driver.findElement(By.className("ico-login"));
    }
    public WebElement email(){
        return driver.findElement(By.cssSelector("#Email"));
    }
    public WebElement password() {
        return driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement myaccount(){
        return driver.findElement(By.className("ico-account"));
    }
    public WebElement LoginButton(){
        return driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));
    }

}


