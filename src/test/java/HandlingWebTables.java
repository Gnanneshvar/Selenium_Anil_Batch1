import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.Setup.Setup;

public class HandlingWebTables extends Setup {
    public static void main(String[] args) throws InterruptedException {
        browser = "Chrome";
        launchBrowser("https://demoqa.com/webtables");
        BusinessReuse businessReuse = new BusinessReuse();
        businessReuse.fnCreateNewRecord("GK","Gujala","gkGujla@gmail.com","34","50000","Software");
        Thread.sleep(3000);
        businessReuse.fnValidateAndDeleteRecord("GK");
        driver.quit();
    }
}
