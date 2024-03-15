package firstTestCase;

import org.testng.annotations.Test;

public class SecondTestCase {
    @Test (priority = 1)
    void setup(){

        System.out.println("Opening The Browser");
    }
    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("This is the Search Customer Test");
    }
    @Test(priority = 3)
    void addCustomer(){
        System.out.println("This is Add Customer Test");
    }
    @Test(priority = 4 )
    void teardown(){
        System.out.println("Closing Browser");
    }
}
