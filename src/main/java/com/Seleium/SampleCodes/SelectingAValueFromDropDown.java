package com.Seleium.SampleCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAValueFromDropDown {
    public static Select selectDay;
    public static Select selectMonth;
    public static Select selectYear;
    public static void main(final String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign up for Facebook")).click();
        Thread.sleep(3000);
        WebElement date = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        selectDay = new Select(date);
        selectDay.selectByIndex(10);
        selectMonth = new Select(month);
        selectMonth.selectByValue("12");
        if(selectMonth.getFirstSelectedOption().getText().equals("Dec"))
            System.out.println("The entered month is December::");
        selectYear = new Select(year);
        selectYear.selectByVisibleText("2023");
        Thread.sleep(3000);
        driver.quit();
    }
}
