package com.Selenium.POM;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class THomePage extends Setup {
    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]")
    public WebElement pdfElectoral;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]/following-sibling::ul//a[contains(text(),'Assembly')]")
    public WebElement assemblyConstituency;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'pdf electoral rolls')]/following-sibling::ul//a[text()='Electoral Rolls']")
    public WebElement electoralRolls;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'E-registration')]")
    public WebElement eRegistration;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'E-registration')]/following-sibling::ul//a[contains(text(),'Assembly')]")
    public WebElement eReg_assemblyConstituency;

    @FindBy(xpath="//ul[@id='menu-primary-menu']//a[contains(text(),'E-registration')]/following-sibling::ul//a[contains(text(),'Assembly')]/following-sibling::ul//a[contains(text(),'Claims')]")
    public WebElement eReg_ClaimsAndObjections;

    public THomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
