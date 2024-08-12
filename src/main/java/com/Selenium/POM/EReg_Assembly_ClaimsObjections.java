package com.Selenium.POM;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EReg_Assembly_ClaimsObjections extends Setup {
    @FindBy(id="ctl00_ContentPlaceHolder1_ddlDist")
    public WebElement webSel_districtName;

    @FindBy(id="ctl00_ContentPlaceHolder1_ddlAC")
    public WebElement webSel_assemblyConstituency;

    @FindBy(id="ctl00_ContentPlaceHolder1_ddlformtype")
    public WebElement webSel_FormType;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'E-registration')]")
    public WebElement webBt_Date;

    public EReg_Assembly_ClaimsObjections(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
