package firstTestCase;

import org.testng.annotations.Test;
public class PrioritizingDisabling {
    @Test (priority=3)
    void TestOne(){
        System.out.println("This is Test One");
    }
    @Test (priority=2)
    void TestTwo(){
        System.out.println("This is Test Two");
    }
    @Test (priority=1)
    void TestThree(){
        System.out.println("This is Test Three");
    }
    @Test (priority=0, enabled=false)
    void TestFour(){
        System.out.println("This is Test Four");
    }
}
