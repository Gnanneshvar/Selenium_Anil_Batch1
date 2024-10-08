
import com.Selenium.Setup.Setup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClaimsAndObjectives extends Setup {

    @BeforeTest
    public void urlInitialize()
    {
        url="https://ceotserms2.telangana.gov.in/claimsobjections/claims_objections.aspx";
    }

    @Test
    public void claimsTest1() throws InterruptedException {
        test = extent.createTest("Validating Claims and Objectives");
        businessReuse.fnClaimsAndObjections("6-Kamareddy","15-Yellareddy","Form11B");
        Thread.sleep(3000);
        driver.quit();
    }
}