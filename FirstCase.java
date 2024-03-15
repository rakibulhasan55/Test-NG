package firstTestCase;

import org.testng.annotations.Test;

public class FirstCase {
    @Test
    void setup(){

        System.out.println("Opening The Browser");
    }
    @Test
    void login(){
        System.out.println("This is Login Test Case");
    }
    @Test
    void teardown(){
        System.out.println("Closing  Browser");
    }
}
