package Tests;

import com.Selenium.Setup.ReadJsonData;
import com.Selenium.Setup.Setup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ClaimsAndObjectivesV2 extends Setup {

    @BeforeTest
    public void urlInitilization() {
        url="https://ceotserms2.telangana.gov.in/claimsobjections/claims_objections.aspx";
        ReadJsonData.ReadJsonFile("ClaimsAndObjectivesV2");
    }

    @Test
    public void objectives() throws Exception {
        test = extent.createTest("Validating Claims and Objectives");
        System.out.println(ReadJsonData.get("distictName"));
        System.out.println(ReadJsonData.get("ERegistration.AssemblyConstituency.ClaimsAndObjectives.assemblyConstituencety"));
        System.out.println(ReadJsonData.get("ERegistration.AssemblyConstituency.ClaimsAndObjectives.formType"));
        businessReuse.fnClaimsAndObjections(ReadJsonData.get("distictName"),ReadJsonData.get("ERegistration.AssemblyConstituency.ClaimsAndObjectives.assemblyConstituencety"),ReadJsonData.get("ERegistration.AssemblyConstituency.ClaimsAndObjectives.formType"));
        Thread.sleep(3000);
        driver.quit();
    }
}
