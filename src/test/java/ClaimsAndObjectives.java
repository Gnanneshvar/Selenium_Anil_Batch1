import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.Setup.Setup;

public class ClaimsAndObjectives extends Setup {
    public static void main(String[] args) throws InterruptedException {
        browser = "chrome";
        launchBrowser("https://ceotserms2.telangana.gov.in/claimsobjections/claims_objections.aspx");
        businessReuse = new BusinessReuse();
        businessReuse.fnClaimsAndObjections("6-Kamareddy","15-Yellareddy","Form11B");
        Thread.sleep(3000);
        driver.quit();
    }
}
