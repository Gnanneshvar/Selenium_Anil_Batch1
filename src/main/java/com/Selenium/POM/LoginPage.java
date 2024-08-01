package com.Selenium.POM;

import com.Selenium.Setup.Resusables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Setup {
    // WebDriver driver = new ChromeDriver();
    // driver.findElement(By.id(""))
    public static By userName = By.name("email");
    public static By password = By.name("pass");
    public static By loginButton = By.id("loginbutton");

//    public static WebElement getUerName()
//    {
//        return driver.findElement(userName);
//    }
//    public static WebElement getPassword()
//    {
//        return driver.findElement(password);
//    }
//    public static WebElement getLoginButton()
//    {
//        return driver.findElement(loginButton);
//    }

    /**
     * The function is used to enter username and  then password in login screen
     * Pass parameters as username and password
     * @param username
     * @param Password
     */

    public static void fnLogin(String username, String Password)
    {
//        Resusables.type(userName,username);
//        Resusables.type(password,Password);
        Resusables.enterText(Resusables.getWebElement(userName),username);
        Resusables.enterText(Resusables.getWebElement(password),Password);
        Resusables.click(Resusables.getWebElement(loginButton));
//        Resusables.getWebElement(userName).sendKeys(username);
//        Resusables.getWebElement(password).sendKeys(Password);
//        Resusables.getWebElement(loginButton).click();
    }
}
