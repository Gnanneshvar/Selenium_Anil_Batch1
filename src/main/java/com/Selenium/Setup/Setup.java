package com.Selenium.Setup;

import com.Selenium.BusinessReusables.BusinessReuse;
import com.Selenium.POM.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Setup {

    public static WebDriver driver;
    public static String browser="";
    public static Select select;
    public static Actions actions;
    public static WebElement web;
    public static String parentWindow;
    public static String childWindow;
    public static Set<String> multipleWindows;
    public static Iterator<String> windowIterator;
    public static Iterator<WebElement> webElementIterator;
    public LoginPage_PageFactory loginPage;
    public SignUp signUp;
    public static List<WebElement> webElementList;
    public static String temp;
    public static WebDriverWait wait;

    public static BusinessReuse businessReuse;

    public TElectoralRolls telectoralRolls;
    public THomePage thomePage;
    public EReg_Assembly_ClaimsObjections eReg_Assembly_ClaimsObjections;
    public static String url;
    public static ExtentSparkReporter spark;
    public static ExtentReports extent;
    public static ExtentTest test;
    public static String reportFileName;


    @BeforeSuite(alwaysRun = true)
    public static void reporting() throws IOException
    {
        // FileReader reader=new FileReader(UTILS_FILE_PATH);
        //props.load(reader);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        extent = new ExtentReports();
        reportFileName = System.getProperty("user.dir")+"/Extent_Reporting/"+timestamp.getTime()+".html";
        spark = new ExtentSparkReporter(reportFileName);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Selenium Anil Batch Automation");
        extent.attachReporter(spark);
        extent.setSystemInfo("HostName", "Local Host");
        extent.setSystemInfo("Os", "Windows");
        extent.setSystemInfo("Testing Company", "Selenium with Java");
        //extent.setSystemInfo("Browser", props.getProperty("Browser"));
        //extent.setSystemInfo("Execution Environment", props.getProperty("Environment"));
    }

    @AfterSuite(alwaysRun = true)
    public static void closeReport()
    {
        extent.flush();
    }

    @BeforeClass(alwaysRun = true)
    public void preCondition()
    {
        browser = "chrome";
        launchBrowser(url);
        businessReuse = new BusinessReuse();
    }

    @AfterClass
    public void endSession()
    {
        driver.quit();
    }

    public static void launchBrowser(String url) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new SafariDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
