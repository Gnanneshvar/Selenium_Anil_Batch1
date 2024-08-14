package com.Selenium.BusinessReusables;

import com.Selenium.POM.EReg_Assembly_ClaimsObjections;
import com.Selenium.POM.TElectoralRolls;
import com.Selenium.POM.THomePage;
import com.Selenium.POM.WebTablePage;
import com.Selenium.Setup.Reuseables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.NoSuchElementException;

public class BusinessReuse extends Setup {

    public WebTablePage webTablePage;
    public BusinessReuse()
    {
        thomePage= new THomePage(driver);
        telectoralRolls = new TElectoralRolls(driver);
        eReg_Assembly_ClaimsObjections = new EReg_Assembly_ClaimsObjections(driver);
        webTablePage = new WebTablePage(driver);
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

    public void fnCreateNewRecord(String fName,String lName,String emailAddress,String age,String salary,String department)
    {
        Reuseables.click(webTablePage.webbt_AddNewRecordButton);
        Reuseables.enterText(webTablePage.webedt_FirstName,fName,"First Name");
        Reuseables.enterText(webTablePage.webedt_LastName,lName,"Last Name");
        Reuseables.enterText(webTablePage.webedt_Email,emailAddress,"Email Address");
        Reuseables.enterText(webTablePage.webedt_Age,age,"Age");
        Reuseables.enterText(webTablePage.webedt_Salary,salary,"Salary");
        Reuseables.enterText(webTablePage.webedt_Department,department,"Department");
        Reuseables.click(webTablePage.webbt_Submit);
    }

    public void fnValidateAndDeleteRecord(String name) throws InterruptedException {
        try
        {
            if(webTablePage.getTableValueValidation(name).isDisplayed())
                System.out.println("The Text is present in the Table::"+name);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("The Text is not present in the Table::"+name);
        }
        Thread.sleep(3000);
        Reuseables.click(webTablePage.getDeleteButton(name));
        try
        {
            if(webTablePage.getTableValueValidation(name).isDisplayed())
                System.out.println("The Record is not deleted in the Table::"+name);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("The Record which got created is now deleted int the Table::");
        }
        Thread.sleep(2000);
    }
}
