package com.Selenium.Setup;

import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.POM.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Setup {

    public static WebDriver driver;
    public static String browser="";
    public static Select select;
    public static Actions actions;
    public static WebElement web;
    public static String parentWindow;
    public static String childWindow;
    public static Set<String> multipleWindows;
    public static Iterator<String> windowIterator;
    public static Iterator<WebElement> webElementIterator;
    public LoginPage_PageFactory loginPage;
    public SignUp signUp;
    public static List<WebElement> webElementList;
    public static String temp;

    public static BusinessReuse businessReuse;



    public TElectoralRolls telectoralRolls;
    public THomePage thomePage;
    public EReg_Assembly_ClaimsObjections eReg_Assembly_ClaimsObjections;

    public static void launchBrowser(String url) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new SafariDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        //driver.quit();
        // Locators in selenium
        // id
        // name
        // classname
        // css
        // linktext
        // partiallinktext
        // tagname
        // xpath

        // WebdriverMananger (3d party API)
        // Selenium Manager
        // 4.0.0
        // 4.10.0
        // driver is an object which holdes the reference type as Webdriver interface and object type as ChromeDriver class
    }
}
