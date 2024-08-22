package Tests;

import org.testng.annotations.*;

public class TestNGAnnotations1 {

    @Test(priority = 0)
    public void ab()
    {
        System.out.println("Inside Test");
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {

        }
    }

    @Test(priority = 1,enabled = false)
    public void abb()
    {
        System.out.println("Inside Test1");
    }

    @Test(priority = 2,dependsOnMethods = {"ab"})
    public void abba()
    {
        System.out.println("Inside Testing");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Inside beforeSuite");
    }
    @AfterSuite
    public void aftersuite()
    {
        System.out.println("Inside aftersuite");
    }

    @BeforeSuite
    public void beforeSuite1()
    {
        System.out.println("Inside beforeSuite 1");
    }
    @AfterSuite
    public void aftersuite1()
    {
        System.out.println("Inside aftersuite 1");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Inside beforeTest");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("Inside afterTest");
    }

    @BeforeTest
    public void beforeTest1()
    {
        System.out.println("Inside beforeTest 1");
    }
    @AfterTest
    public void afterTest1()
    {
        System.out.println("Inside afterTest 1");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Inside beforeClass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("Inside afterClass");
    }

    @BeforeClass
    public void beforeClass1()
    {
        System.out.println("Inside beforeClass 1");
    }
    @AfterClass
    public void afterClass1()
    {
        System.out.println("Inside afterClass 1");
    }
    @BeforeMethod
    public void beforeMethod1()
    {
        System.out.println("Inside beforeMethod 1");
    }
    @AfterMethod
    public void afterMethod1()
    {
        System.out.println("Inside afterMethod 1");
    }

    @BeforeMethod
    public void beforeMethod2()
    {
        System.out.println("Inside beforeMethod 2");
    }
    @AfterMethod
    public void afterMethod2()
    {
        System.out.println("Inside afterMethod 2");
    }

    @BeforeMethod
    public void beforeMethod3()
    {
        System.out.println("Inside beforeMethod 3");
    }
    @AfterMethod
    public void afterMethod3()
    {
        System.out.println("Inside afterMethod 3");
    }
}
