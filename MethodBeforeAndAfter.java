package MavenProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodBeforeAndAfter {
    @BeforeMethod
    public void beforeMethodDemo()
    {
        System.out.println("before method demo");
    }
    @AfterMethod
    public void afterMethodDemo()
    {
        System.out.println("After method demo");
    }

    @Test
    public void verifyMethod1()
    {
        System.out.println("verify method 1");
    }
    @Test
    public void verifyMethod2()
    {
        System.out.println("verify method 2");
    }
    @Test
    public void verifyMethod3()
    {
        System.out.println("verify method 3");
    }
}
