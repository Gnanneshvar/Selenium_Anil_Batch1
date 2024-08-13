package com.Selenium.POM;

import com.Selenium.Setup.Reuseables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertVerificationClass extends Setup {

    @FindBy(id="alertButton")
    private WebElement webBt_alertButton;

    @FindBy(id="timerAlertButton")
    private WebElement webBt_TimerAlert;

    @FindBy(id="confirmButton")
    private WebElement webBt_confirmButton;

    @FindBy(id="promtButton")
    private WebElement webBt_PromptButton;

    public AlertVerificationClass(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnalertButton() throws InterruptedException {
        Reuseables.click(webBt_alertButton);
        Thread.sleep(3000);
        Reuseables.alertAccept();
        Thread.sleep(2000);
    }

    public void clickOnTimerAlertButton() throws InterruptedException {
        Reuseables.click(webBt_TimerAlert);
        Thread.sleep(7000);
        Reuseables.alertAccept();
    }

    public void clickOnConfirmButton() throws InterruptedException {
        Reuseables.click(webBt_confirmButton);
        Thread.sleep(2000);
        Reuseables.alertAccept();
    }

    public void clickOnPromptButton() throws InterruptedException {
        Reuseables.click(webBt_PromptButton);
        Thread.sleep(2000);
        System.out.println("Text::"+driver.switchTo().alert().getText() );
        Reuseables.alertAccept();
    }
}
