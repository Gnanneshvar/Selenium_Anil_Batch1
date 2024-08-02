package com.Selenium.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Setup {

    public static WebDriver driver;
    public static String browser="";
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
