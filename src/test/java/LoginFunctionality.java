import com.Selenium.POM.LoginPage;
import com.Selenium.Setup.Setup;


public class LoginFunctionality extends Setup {
    public static void main(String[] args)  {
        browser = "Chrome";
        launchBrowser("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        LoginPage.fnLogin("username","Password");

//        LoginPage.getUerName().sendKeys("username");
//        LoginPage.getPassword().sendKeys("password");
//        LoginPage.getLoginButton().click();
    }
}
