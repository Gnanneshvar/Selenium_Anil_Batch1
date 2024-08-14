package com.Selenium.POM;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage extends Setup {
    @FindBy(id="addNewRecordButton")
    public WebElement webbt_AddNewRecordButton;

    @FindBy(id="firstName")
    public WebElement webedt_FirstName;

    @FindBy(id="lastName")
    public WebElement webedt_LastName;

    @FindBy(id="userEmail")
    public WebElement webedt_Email;

    @FindBy(id="age")
    public WebElement webedt_Age;

    @FindBy(id="salary")
    public WebElement webedt_Salary;

    @FindBy(id="department")
    public WebElement webedt_Department;

    @FindBy(id="submit")
    public WebElement webbt_Submit;

    public WebElement getDeleteButton(String value)
    {
        return driver.findElement(By.xpath("//div[text()='"+value+"']/parent::div//span[contains(@id,'delete-record')]"));
    }

    public WebElement getTableValueValidation(String value)
    {
        return driver.findElement(By.xpath("//div[text()='"+value+"']"));
    }

    public WebTablePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
