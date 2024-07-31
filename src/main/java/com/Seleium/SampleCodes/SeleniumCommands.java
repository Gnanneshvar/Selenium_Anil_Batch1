package com.Seleium.SampleCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chromedriver.setup","/Users/gnaneshwargujala/Downloads/chromedriver-mac-x64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // WebDriver driver1 = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        //navigation
//        driver.navigate().to("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");


//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // name =username
        // name = username
        // //button[text()=' Login ']

        Thread.sleep(3000);

//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        // Synchronization

        // Facebook:

//        System.out.println("Is displayed::"+driver.findElement(By.name("email")).isDisplayed()); //boolean
//        System.out.println("Is Enabled::"+driver.findElement(By.name("email")).isEnabled()); // boolean

//        driver.findElement(By.linkText("Sign up for Facebook")).click();
        driver.findElement(By.name("email")).sendKeys("GKGnaneshwar");
        Thread.sleep(3000);
        System.out.println("Get Attribute::"+driver.findElement(By.name("email")).getAttribute("value"));
        System.out.println("Get Text::"+driver.findElement(By.linkText("Sign up for Facebook")).getText());

        WebElement username = driver.findElement(By.name("email"));
        System.out.println("URL::"+driver.getCurrentUrl());
        System.out.println("Title::"+driver.getTitle());
        System.out.println("Page Source::"+driver.getPageSource());
        driver.quit();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//        driver.navigate().forward();

        //driver.findElement(By.partialLinkText("Sign up")).click();


        // quit the browser
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
