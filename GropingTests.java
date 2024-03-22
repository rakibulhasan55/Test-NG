package firstTestCase;

import org.testng.annotations.Test;

public class GropingTests {

    @Test
    void test1(){
        System.out.println("This is Test 1");
    }
    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is Test 2");
    }
    @Test(groups = {"regression"})
    void test3(){
        System.out.println("This is Test 3");
    }
    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is Test 4");
    }
    
    // "sanity","regression" both in one test
    @Test(groups = {"sanity","regression"})
     void test5(){
        System.out.println("This is Test 5");
    }
}
