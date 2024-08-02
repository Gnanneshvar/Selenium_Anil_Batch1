package com.Selenium.POM;

import com.Selenium.Setup.Resusables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory extends Setup {

    @FindBy(name="email")
    private WebElement userName;
    // WebElement web = driver.findElement(By.name(""))

    @FindBy(name="pass")
    private WebElement password;

    @FindBy(id="loginbutton")
    private WebElement loginButton;

    public LoginPage_PageFactory(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void fnLogin(String email, String Password) {
        Resusables.enterText(userName,email);
        Resusables.enterText(password,Password);
        Resusables.click(loginButton);
    }
}
