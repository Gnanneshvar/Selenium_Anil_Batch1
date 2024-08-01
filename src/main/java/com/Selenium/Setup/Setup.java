package com.Selenium.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    public static WebDriver driver;
    public static void launchBrowser(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

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
