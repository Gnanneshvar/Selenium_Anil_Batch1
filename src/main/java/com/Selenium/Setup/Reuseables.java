package com.Selenium.Setup;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Reuseables extends Setup {

    /**
     * This is a private Costructor making not to create an object for this class
     */
    private Reuseables()
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
        try
        {
            web = driver.findElement(byVariable);
            wait.until(ExpectedConditions.visibilityOf(web));
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Element is not found");
        }
        return web;
    }

    /**
     * This method is used to enter the text for a webElement
     * @param webElement
     * @param textToEnter
     */
    public static void enterText(WebElement webElement,String textToEnter,String webElementName)
    {
        try {
            wait.until(ExpectedConditions.visibilityOf(webElement));
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
            wait.until(ExpectedConditions.elementToBeClickable(element));
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

    public static void selectByVisibleText(WebElement element, String webElementName,String selectValue) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            if(element.isDisplayed())
            {
                if(element.isEnabled())
                {
                    select = new Select(element);
                    select.selectByVisibleText(selectValue);
                    test.log(Status.INFO,"Selected value for "+webElementName+" as::"+selectValue);
                }
            }
        }
        catch(NoSuchElementException e) {
            test.log(Status.FAIL,"Not able to Select value for "+webElementName+" as::"+selectValue +"Error as::"+e.getMessage());
            //System.out.println("No such Element Exception");
        }
        catch(StaleElementReferenceException s)
        {
            System.out.println("Stale Element Reference Exception");
        }
    }

    public static void selectByValue(WebElement element, String selectValue) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
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
            wait.until(ExpectedConditions.visibilityOf(element));
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
        try
        {
            wait.until(ExpectedConditions.elementToBeClickable(mouseOver1));
            actions.moveToElement(mouseOver1).moveToElement(mouseOver2).moveToElement(toClick).click().build().perform();
        }
        catch(Exception e)
        {
            System.out.println("Could not able to perform mouse over");
        }


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

    public static boolean fnValidateStringInTable(WebElement webElement,String validate)
    {
        boolean status = false;
        List<WebElement> rowList = webElement.findElements(By.tagName("tr"));
        List<WebElement> colmList;
        for(WebElement rowWebElement:rowList)
        {
            colmList = rowWebElement.findElements(By.tagName("td"));
            webElementIterator = colmList.iterator();
            while(webElementIterator.hasNext())
            {
                web = webElementIterator.next();
                try {
                    if (web.getText().equals(validate)) {
                        status = true;
                        break;
                    }
                }
                catch(Exception e)
                {

                }
            }
            if(status)
                break;
        }
        return status;
    }


    public static boolean fnValidateStringInTableWithFixedColumn(WebElement webElement,String validate,int column)
    {
        boolean status = false;
        int value=0;
        List<WebElement> rowList = webElement.findElements(By.tagName("tr"));
        String xpath = "//table[@id='ctl00_ContentPlaceHolder1_GridView3']//tr["+value+"]//td["+column+"]";
        for(int i = 0;i<rowList.size();i++)
        {
            value = i;
            if(getWebElement(By.xpath(xpath)).getText().equals(validate))
            {
                status = true;
                break;
            }
        }
        return status;
    }

    public static void alertAccept()
    {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }
        catch(NoAlertPresentException e)
        {
            System.out.println("Alert is not prompeted::"+e.getMessage());
        }
    }

    public static void alertDismiss()
    {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().dismiss();
        }
        catch(NoAlertPresentException e)
        {
            System.out.println("Alert is not prompeted::"+e.getMessage());
        }
    }

    /**
     * The method is to take the screenshot
     * @param driver
     * @param ScreenshotName
     * @return
     * @throws IOException
     */
    public static String getScreenshot(WebDriver driver,String ScreenshotName) throws IOException
    {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"/FailedScreenshots/"+ScreenshotName+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source,finalDestination);
        System.out.println("Destination File of Screenshot::"+destination);
        return destination;
    }


}
