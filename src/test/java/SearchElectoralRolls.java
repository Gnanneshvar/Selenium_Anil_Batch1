import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.Setup.Reuseables;
import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SearchElectoralRolls extends Setup {
    public static void main(String[] args) throws InterruptedException {
        browser = "chrome";
        launchBrowser("https://ceotelangana.nic.in/");
        businessReuse = new BusinessReuse();
        businessReuse.fnNavigateToElectoralPage();
        Reuseables.switchToNewWindow();
        Thread.sleep(3000);
        businessReuse.fnSearchElectoralRolls("6-Kamareddy","13-Jukkal(SC)","Mandal Parishad Primary School Sonala");
        try {
            if (driver.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_GridView3']//td[text()='Mandal Parishad Primary School Sonala']")).isDisplayed())
                System.out.println("The text is present");
        }
        catch(NoSuchElementException E)
        {

        }
        driver.quit();
    }
}
