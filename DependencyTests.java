package firstTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {

    @Test
    void startCar(){
        Assert.fail(); // For fail the Test Methods 
        System.out.println("Car Started");
    }

    //Single Dependency
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driving");
    }

    //Single Dependency
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car stopped");
    }

    // Multiple Dependency and Always Run Property
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("Car parked");
    }
}
