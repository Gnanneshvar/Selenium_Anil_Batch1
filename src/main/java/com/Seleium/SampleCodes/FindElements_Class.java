package com.Seleium.SampleCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class FindElements_Class {
    public static void main(String[] args) throws InterruptedException {
        Iterator<WebElement> iterator;
//        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chromedriver.setup","/Users/gnaneshwargujala/Downloads/chromedriver-mac-x64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // WebDriver driver1 = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        Thread.sleep(3000);
        List<WebElement> webElementList= driver.findElements(By.tagName("a"));
        System.out.println("List of Links in the page::"+webElementList.size());
        iterator = webElementList.iterator();
        WebElement web;
        while (iterator.hasNext()) {
            try
            {
                web = iterator.next();
                if(web.getText().equalsIgnoreCase("Sign up for Facebook"))
                {
                    web.click();
                }
                //System.out.println("Text::"+iterator.next().getText());
            }
            catch(Exception e)
            {

            }
        }
        Thread.sleep(3000);
        Select sel = new Select(driver.findElement(By.id("day")));
        List<WebElement> dayList= sel.getOptions();
        System.out.println("Size of the days is::"+dayList.size());
        iterator = dayList.listIterator();
        while(iterator.hasNext())
        {
            web = iterator.next();
            if(web.getText().equalsIgnoreCase("27")) {
                System.out.println("Day::" + web.getText());
                web.click();
            }
            else
                System.out.println("Day::"+web.getText());
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
