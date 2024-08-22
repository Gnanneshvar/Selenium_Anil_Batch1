package Tests;

import com.Selenium.Setup.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormFilling extends Setup {

    @BeforeTest
    public void urlInitilization() {
        url="https://demoqa.com/automation-practice-form";
    }

    @Test
    public void objectives() throws InterruptedException {
        test = extent.createTest("Form Filling in Objecrtives");
        driver.findElement(By.xpath("//div[text()='Select State']")).click();
        try {
            System.out.println("Inside Try block::"+driver.findElement(By.xpath("//div[text()='Haryana']")).getTagName());
            driver.findElement(By.xpath("//div[text()='Haryana']")).click();
        }
        catch (Exception e) {
        }
        Thread.sleep(5000);
    }

}
