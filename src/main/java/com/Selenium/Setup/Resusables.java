package com.Selenium.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Resusables extends Setup {

    /**
     *
     */
    private Resusables()
    {

    }

    public static void type(By byvVaribale,String textToType)
    {
        web = driver.findElement(byvVaribale);
        web.click();
        web.clear();
        web.sendKeys(textToType);
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
    public static void enterText(WebElement webElement,String textToEnter,String webElementName)
    {
        try {
            if (webElement.isDisplayed()){
                if (webElement.isEnabled()){
                    webElement.click();
                    webElement.clear();
                    webElement.sendKeys(textToEnter);
                }
            }
        }catch(NoSuchElementException e) {
            System.out.println("Not able to enter the text for WebElement "+webElementName + " Error as::"+e.getMessage());
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Not able to enter the text for WebElement "+webElementName + " Error as::"+s.getMessage());
        }
    }


    public static void click(WebElement element) {
        try {
            if (element.isDisplayed()){
                if (element.isEnabled()){
                    element.click();
                }
            }
        }catch(NoSuchElementException e) {
            System.out.println("No such Element Exception for Click");
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Stale Element Reference Exception for Click");
        }
    }

    public static void selectByVisibleText(WebElement element, String selectValue) {
        try {
            if(element.isDisplayed())
            {
                if(element.isEnabled())
                {
                    select = new Select(element);
                    select.selectByVisibleText(selectValue);
                }
            }
        }
        catch(NoSuchElementException e) {
            System.out.println("No such Element Exception");
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Stale Element Reference Exception");
        }
    }

    public static void selectByValue(WebElement element, String selectValue) {
        try {
            if(element.isDisplayed())
            {
                if(element.isEnabled())
                {
                    select = new Select(element);
                    select.selectByValue(selectValue);
                }
            }
        }
        catch(NoSuchElementException e) {
            System.out.println("No such Element Exception");
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Stale Element Reference Exception");
        }
    }

    public static void selectByValue(WebElement element, int index) {
        try {
            if(element.isDisplayed())
            {
                if(element.isEnabled())
                {
                    select = new Select(element);
                    select.selectByIndex(index);
                }
            }
        }
        catch(NoSuchElementException e) {
            System.out.println("No such Element Exception");
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Stale Element Reference Exception");
        }
    }

    public static void mouseOverMouseOverAndClick(WebElement mouseOver1, WebElement mouseOver2, WebElement toClick) {
        actions = new Actions(driver);
        actions.moveToElement(mouseOver1).moveToElement(mouseOver2).moveToElement(toClick).click().build().perform();
    }

    /**
     * Method to switch to the New window
     */
    public static void switchToNewWindow() {
        multipleWindows = driver.getWindowHandles();
        parentWindow = driver.getWindowHandle();
        windowIterator = multipleWindows.iterator();
        while(windowIterator.hasNext())
        {
            childWindow = windowIterator.next();
            if(!childWindow.equals(parentWindow))
                driver.switchTo().window(childWindow);
        }
    }

    /**
     * Method to switch to the parent window
     */

    public static void switchToMainWindow() {
        driver.switchTo().window(parentWindow);
    }

}
