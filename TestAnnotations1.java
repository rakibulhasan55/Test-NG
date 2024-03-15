package firstTestCase;

import org.testng.annotations.*;

public class TestAnnotations1 {


    @Test
    void test1(){
        System.out.println("This is test One");
    }
    @Test
    void test2(){
        System.out.println("This is test Two");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method ");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute After every Method ");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("This beforeClass execute the single time before all @Test method");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This AfterClass execute single time After all @Test method");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute single Time Before '@BeforeClass'");
    }
    @AfterTest
    void afterTest(){
        System.out.println("This will execute single Time After '@AfterClass'");
    }


}
