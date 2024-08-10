package com.Selenium.BusinessReusables;

import com.Selenium.POM.LoginPage_PageFactory;
import com.Selenium.POM.TElectoralRolls;
import com.Selenium.POM.THomePage;
import com.Selenium.Setup.Resusables;
import com.Selenium.Setup.Setup;

public class BusinessReuse extends Setup {

    public BusinessReuse()
    {
        thomePage= new THomePage(driver);
        telectoralRolls = new TElectoralRolls(driver);
    }

    public void fnNavigateToElectoralPage() throws InterruptedException {
        Thread.sleep(4000);
        Resusables.mouseOverMouseOverAndClick(thomePage.pdfElectoral,thomePage.assemblyConstituency,thomePage.electoralRolls);
    }

    public void fnSearchElectoralRolls(String districtNam,String assemblyConstituency) {

        Resusables.selectByVisibleText(telectoralRolls.distName,districtNam);
        Resusables.selectByVisibleText(telectoralRolls.assembly,assemblyConstituency);
        Resusables.click(telectoralRolls.poolingStatus);
    }
}
