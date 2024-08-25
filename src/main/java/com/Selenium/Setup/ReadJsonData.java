package com.Selenium.Setup;

import java.io.File;
import java.io.IOException;

public class ReadJsonData extends Setup{

    /**
     * This method would return Value for the corresponding key
     *
     * @param Key
     * @return Value Associated to that Key
     * @throws IOException
     */

//    public static String get(String Key) throws IOException {
//        String value = "";
//        try {
//            value = JsonPath.read(JsonReader, "$." + Key);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return value;
//    }

    /**
     * This method would read the Json file and store it in Reader variable
     * @param Filename Json File name
     */

    public static void ReadJsonFile(String Filename)
    {
        JsonReader = new File(System.getProperty("user.dir")+
                "/TestData/"+  Filename + ".json");
    }
}
