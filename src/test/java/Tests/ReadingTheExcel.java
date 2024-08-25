package Tests;

import com.Selenium.Setup.ExcelOperations;
import com.Selenium.Setup.Setup;
import com.codoid.products.exception.FilloException;
import org.testng.annotations.Test;

public class ReadingTheExcel extends Setup {

    @Test
    public void readExcel() throws FilloException {
        //strQuery = "select EmployeeName from Sheet1 where Designation='HR Manager'";
        ExcelOperations.fnGetFieldValue("EmployeeName");
        ExcelOperations.fnUpdateValue("EmployeeName", "G K Gnaneshwar");
    }
}
