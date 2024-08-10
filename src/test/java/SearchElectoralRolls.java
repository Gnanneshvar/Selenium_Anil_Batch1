import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.Setup.Resusables;
import com.Selenium.Setup.Setup;

public class SearchElectoralRolls extends Setup {
    public static void main(String[] args) throws InterruptedException {
        browser = "chrome";
        launchBrowser("https://ceotelangana.nic.in/");
        businessReuse = new BusinessReuse();
        businessReuse.fnNavigateToElectoralPage();
        Resusables.switchToNewWindow();
        Thread.sleep(3000);
        businessReuse.fnSearchElectoralRolls("6-Kamareddy","13-Jukkal(SC)");
        Thread.sleep(3000);
        driver.quit();
    }
}
