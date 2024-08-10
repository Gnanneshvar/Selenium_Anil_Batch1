package com.Seleium.SampleCodes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class HandlingMultipleWindows {
    public static WebDriver driver;
    public static By pdfElectoral = By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]");
    public static By assemblyConstituency = By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]/following-sibling::ul//a[contains(text(),'Assembly')]");
    public static By electoralRolls = By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]/following-sibling::ul//a[text()='Electoral Rolls']");
    public static By distName = By.name("ctl00$ContentPlaceHolder1$ddlDist");
    public static By assembly = By.name("ctl00$ContentPlaceHolder1$ddlAC");
    public static By poolingStatus = By.name("ctl00$ContentPlaceHolder1$btnlogin");
    public static Select select;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ceotelangana.nic.in/");
        Thread.sleep(5000);
        mouseOverMouseOverAndClick(getWebElement(pdfElectoral),getWebElement(assemblyConstituency),getWebElement(electoralRolls));
        Thread.sleep(5000);
        String mainWindow = driver.getWindowHandle();
        String otherWindow;
        Set<String> windows = driver.getWindowHandles();
        System.out.println("No of Windows opened is ::"+windows.size());
        Iterator<String> it= windows.iterator();
        System.out.println("Windows Names");
        while(it.hasNext()){
            otherWindow = it.next();
            if(!otherWindow.equals(mainWindow)){
                driver.switchTo().window(otherWindow);
            }
            //System.out.println(it.next());
        }
        //driver.close();
        selectByVisibleText(getWebElement(distName),"6-Kamareddy");
        selectByVisibleText(getWebElement(assembly),"13-Jukkal(SC)");
        click(getWebElement(poolingStatus));
        Thread.sleep(3000);
//        driver.switchTo().defaultContent();
        //driver.switchTo().window(mainWindow);
        //mouseOverMouseOverAndClick(getWebElement(pdfElectoral),getWebElement(assemblyConstituency),getWebElement(electoralRolls));
        //Thread.sleep(5000);
        //driver.quit();
    }

    public static void mouseOverMouseOverAndClick(WebElement mouseOver1, WebElement mouseOver2, WebElement toClick) {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOver1).moveToElement(mouseOver2).moveToElement(toClick).click().build().perform();
    }

    public static WebElement getWebElement(By byClass)
    {
        return driver.findElement(byClass);
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
}
