package firstTestCase;

import org.testng.annotations.*;

public class TestAnnotations2 {

    @Test
    void test3(){
        System.out.println("This is test Three");
    }
    @Test
    void test4(){
        System.out.println("This is test Four");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute After every Method");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("This beforeClass execute single time before all @Test method");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This AfterClass execute the single time After all @Test method");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println(" 'Before suite' execute before 'actual Test is Started' ");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println(" 'After suite' execute After 'all Test is Ended' ");
    }




}
