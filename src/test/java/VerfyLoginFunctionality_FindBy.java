
import com.Selenium.POM.LoginPage_PageFactory;
import com.Selenium.Setup.Setup;

public class VerfyLoginFunctionality_FindBy extends Setup {
    public static void main(String[] args) throws InterruptedException {
        browser = "chrome";
        launchBrowser("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        Thread.sleep(4000);
        LoginPage_PageFactory loginPage = new LoginPage_PageFactory(driver);
        loginPage.fnLogin("username","Password");
    }
}
