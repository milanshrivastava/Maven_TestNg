package MavenProject;

import org.testng.annotations.Test;

public class PriorityDefault {
    /**
     * priority is default  agar kuch denine nhi kiya hai
     * alphabetical mai print hoga then priority wise
     */
    @Test
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
    @Test
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
