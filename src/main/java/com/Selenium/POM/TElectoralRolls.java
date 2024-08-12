package com.Selenium.POM;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TElectoralRolls extends Setup {

    @FindBy(name="ctl00$ContentPlaceHolder1$ddlDist")
    public WebElement distName;

    @FindBy(name="ctl00$ContentPlaceHolder1$ddlAC")
    public WebElement assembly;

    @FindBy(name="ctl00$ContentPlaceHolder1$btnlogin")
    public WebElement poolingStatus;

    @FindBy(id="ctl00_ContentPlaceHolder1_GridView3")
    public WebElement webPoolingTable;

    public WebElement getSchoolEnglishLink(String str)
    {
        return driver.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_GridView3']//td[text()='"+str+"']/parent::tr//a[@id='ctl00_ContentPlaceHolder1_GridView3_ctl06_lnkEnglish']"));
    }

    public TElectoralRolls(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
