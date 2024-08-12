package com.Selenium.BusinessReusables;

import com.Selenium.POM.EReg_Assembly_ClaimsObjections;
import com.Selenium.POM.TElectoralRolls;
import com.Selenium.POM.THomePage;
import com.Selenium.Setup.Resusables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusinessReuse extends Setup {

    public BusinessReuse()
    {
        thomePage= new THomePage(driver);
        telectoralRolls = new TElectoralRolls(driver);
        eReg_Assembly_ClaimsObjections = new EReg_Assembly_ClaimsObjections(driver);
    }

    public void fnNavigateToElectoralPage() throws InterruptedException {
        Thread.sleep(4000);
        Resusables.mouseOverMouseOverAndClick(thomePage.pdfElectoral,thomePage.assemblyConstituency,thomePage.electoralRolls);
    }

    public void fnSearchElectoralRolls(String districtNam,String assemblyConstituency,String textToValidate) {
        Resusables.selectByVisibleText(telectoralRolls.distName,districtNam);
        Resusables.selectByVisibleText(telectoralRolls.assembly,assemblyConstituency);
        Resusables.click(telectoralRolls.poolingStatus);
        if(Resusables.fnValidateStringInTable(telectoralRolls.webPoolingTable,textToValidate))
        {
            System.out.println("The Text is present in the Table");
        }
        else {
            System.out.println("The Text is not present in the Table");
        }
    }

    public void fnClaimsAndObjections(String districtName,String assemblyConstituency,String formType) {
        Resusables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_districtName,districtName);
        Resusables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_assemblyConstituency,assemblyConstituency);
        Resusables.selectByVisibleText(eReg_Assembly_ClaimsObjections.webSel_FormType,formType);
    }
}
