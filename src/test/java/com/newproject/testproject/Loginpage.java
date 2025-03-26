package com.newproject.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.saucedemo.com/v1/inventory.html
public class Loginpage {
   

    public Loginpage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement inputLoginButton;
    
    
    
}