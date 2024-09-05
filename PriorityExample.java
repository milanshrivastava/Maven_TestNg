package MavenProject;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void TestCaseZ()
    {
        System.out.println("testcase z");
    }
    @Test(priority = 2)
    public void TestCaseM()
    {
        System.out.println("testcase m");

    }
    @Test(priority = 3)
    public void TestCaseH()
    {
        System.out.println("testcase h");
    }
    @Test(priority = 4)
    public void TestCaseY()
    {
        System.out.println("testcase y");
    }
    @Test(priority = 5)
    public void TestCaseF()
    {
        System.out.println("testcase f");
    }
    @Test(priority = 6)
    public void TestCaseC()
    {
        System.out.println("testcase c");
        @Test(priority = 1)
    public void TestCased()
    {
        System.out.println("testcase d");
    }
    }
}
