package MavenProject;

import org.testng.annotations.Test;

public class PriorityIsNegative {
    /**
     * negative priority mai pahle 30 aayega the 20 then alphabetical order
     */
    @Test(priority = 1)
    public void TestCaseZ()
    {
        System.out.println("testcase z");
    }
    @Test(priority = -20)
    public void TestCaseM()
    {
        System.out.println("testcase m");

    }
    @Test(priority = -30)
    public void TestCaseH()
    {
        System.out.println("testcase h");
    }
    @Test(priority = 4)
    public void TestCaseY()
    {
        System.out.println("testcase y");
    }
    @Test
    public void TestCaseF()
    {
        System.out.println("testcase f");
    }
}
