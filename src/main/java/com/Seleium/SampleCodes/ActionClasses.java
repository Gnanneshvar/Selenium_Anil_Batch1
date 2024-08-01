package com.Seleium.SampleCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
//        Thread.sleep(5000);
//        Actions actions = new Actions(driver);
//        WebElement username = driver.findElement(By.name("email"));
//        actions.moveToElement(username).contextClick().build().perform();
//        Thread.sleep(2000);
//        actions.moveToElement(driver.findElement(By.name("email"))).click().sendKeys("Text").build().perform();
//        Thread.sleep(1000);
////        driver.findElement(By.name("email"));
//        actions.moveToElement(driver.findElement(By.xpath("//button[text()='Log in']"))).click().build().perform();
////        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//        Thread.sleep(2000);
//    }
    public static void main(String[] args) throws InterruptedException {
       // System.out.println(AnnotationXyz.a);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ceotelangana.nic.in/");
        Thread.sleep(6000);
        Actions action = new Actions(driver);
        WebElement searchYourname = driver.findElement(By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'Search your name')]"));
        WebElement assemblyConsi = driver.findElement(By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'Search your name')]/following-sibling::ul//a[contains(text(),'Assembly')]"));
        WebElement voters = driver.findElement(By.xpath("//ul[@id='menu-primary-menu']//a[contains(text(),'Search your name')]/following-sibling::ul//a[contains(text(),'VOTERS SERVICE PORTAL')]"));
        action.moveToElement(searchYourname).moveToElement(assemblyConsi).moveToElement(voters).click().build().perform();
        Thread.sleep(4000);
        driver.quit();
    }
}
