package com.Selenium.Setup;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;

public class ExcelOperations extends Setup{

    /**
     * getFieleValue is used to get Credentials details stored in the User_Details.xlsx based on the environment that was present in the Config.properties file
     * @param Field
     * @return Fieldvalue
     * @throws FilloException
     */

    public static String fnGetFieldValue(String Field) throws FilloException {
        fillo = new Fillo();
        connection = fillo.getConnection(System.getProperty("user.dir")+"/TestData/UserDetails.xlsx");
        strQuery="select * from "+props.getProperty("Environment");
        recordset = connection.executeQuery(strQuery);
        while(recordset.next()){
            getdetails = recordset.getField(Field).toString();
            System.out.println("Records as::"+getdetails);
        }
        recordset.close();
        connection.close();
        return getdetails;
    }

    public static void fnUpdateValue(String FieldName,String FieldValue) throws FilloException {
       // updateStatus = false;
        fillo = new Fillo();
        connection = fillo.getConnection(System.getProperty("user.dir")+"/TestData/UserDetails.xlsx");
        strQuery="Update "+props.getProperty("Environment")+" Set "+FieldName+"='"+FieldValue+"'";
//        strQuery="Update "+props.getProperty("Environment")+" Set "+FieldName+"='"+FieldValue+"'where Designation='Sales Manager'";
        System.out.println("Query to be Executed::"+strQuery);
        try
        {
            connection.executeUpdate(strQuery);
            //updateStatus = true;
        }
        catch (Exception E)
        {
           // updateStatus=false;
        }
        connection.close();
       // return updateStatus;
    }

}
