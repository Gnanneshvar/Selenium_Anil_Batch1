package com.Selenium.BusinessReusables;

import com.Selenium.POM.EReg_Assembly_ClaimsObjections;
import com.Selenium.POM.TElectoralRolls;
import com.Selenium.POM.THomePage;
import com.Selenium.Setup.Reuseables;
import com.Selenium.Setup.Setup;

public class BusinessReuse extends Setup {

    public BusinessReuse()
    {
        thomePage= new THomePage(driver);
        telectoralRolls = new TElectoralRolls(driver);
        eReg_Assembly_ClaimsObjections = new EReg_Assembly_ClaimsObjections(driver);
    }

    public void fnNavigateToElectoralPage() throws InterruptedException {
        Thread.sleep(4000);
        Reuseables.mouseOverMouseOverAndClick(thomePage.pdfElectoral,thomePage.assemblyConstituency,thomePage.electoralRolls);
    }

    public void fnSearchElectoralRolls(String districtNam,String assemblyConstituency,String textToValidate) {
        Reuseables.selectByVisibleText(telectoralRolls.distName,districtNam);
        Reuseables.selectByVisibleText(telectoralRolls.assembly,assemblyConstituency);
        Reuseables.click(telectoralRolls.poolingStatus);
        if(Reuseables.fnValidateStringInTable(telectoralRolls.webPoolingTable,textToValidate))
        {
            System.out.println("The Text is present in the Table");
        }
        else {
            System.out.println("The Text is not present in the Table");
        }
    }

    public void fnClaimsAndObjections(String districtName,String assemblyConstituency,String formType) {
        Reuseables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_districtName,districtName);
        Reuseables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_assemblyConstituency,assemblyConstituency);
        Reuseables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_FormType,formType);
    }
}
