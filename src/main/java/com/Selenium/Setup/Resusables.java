package com.Selenium.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Resusables extends Setup {

    public static WebElement web;
    /**
     *
     */
    private Resusables()
    {

    }

    /**
     * Pass parameter as By class variable to generate a webelement
     * @param byVariable
     * @return
     */
    public static WebElement getWebElement(By byVariable)
    {
        return driver.findElement(byVariable);
    }

    /**
     * This method is used to enter the text for a webElement
     * @param webElement
     * @param textToEnter
     */
    public static void enterText(WebElement webElement,String textToEnter)
    {
        webElement.click();
        webElement.clear();
        webElement.sendKeys(textToEnter);
    }

    public static void type(By byvVaribale,String textToType)
    {
        web = driver.findElement(byvVaribale);
        web.click();
        web.clear();
        web.sendKeys(textToType);
    }

    public static void click(WebElement webElement)
    {
        webElement.click();
    }


}
