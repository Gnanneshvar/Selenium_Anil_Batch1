import com.Selenium.POM.AlertVerificationClass;
import com.Selenium.Setup.Setup;

public class Handling_Alerts extends Setup {

    public static void main(String[] args) throws InterruptedException {
        browser = "Chrome";
        launchBrowser("https://demoqa.com/alerts");
        AlertVerificationClass obj = new AlertVerificationClass(driver);
        obj.clickOnalertButton();
        obj.clickOnTimerAlertButton();
        obj.clickOnConfirmButton();
        obj.clickOnPromptButton();
        driver.quit();
    }
}
