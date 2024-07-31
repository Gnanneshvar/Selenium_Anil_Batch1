package com.Seleium.SampleCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Setup {
    public static void launchBrowser() {
        WebDriver driver = new ChromeDriver();
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
