package com.Selenium.POM;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends Setup {

    @FindBy(id="day")
    private WebElement webSel_Day;

    @FindBy(id="month")
    private WebElement webSel_Month;

    @FindBy(id="year")
    private WebElement weSelect_Year;

    public SignUp(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



}

