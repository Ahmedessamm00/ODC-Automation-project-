package org.example.Pages;

import org.example.stepDefintion.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePage {

    public WebElement ChangeCurrency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> CheckProducts() {
        List<WebElement> Product = Hooks.driver.findElements(By.cssSelector("[class=\"price actual-price\"]"));
        return Product;
}
}