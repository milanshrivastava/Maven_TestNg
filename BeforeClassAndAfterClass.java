package MavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClass {
    @BeforeClass
    public void BeforeClassMethod()
    {
        System.out.println("before class");
    }
    @AfterClass
    public void AfterClassMethod()

    {
        System.out.println("after class");
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
