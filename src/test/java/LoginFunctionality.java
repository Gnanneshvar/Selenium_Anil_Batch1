import com.Selenium.POM.LoginPage;
import com.Selenium.Setup.Setup;

public class LoginFunctionality extends Setup {
    public static void main(String[] args) throws InterruptedException {
        //browser = "Firefox";
        launchBrowser("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
        Thread.sleep(4000);
        LoginPage.fnLogin("username","Password");
//        LoginPage.getUerName().sendKeys("username");
//        LoginPage.getPassword().sendKeys("password");
//        LoginPage.getLoginButton().click();
    }
}
