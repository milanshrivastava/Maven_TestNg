package MavenProject;

import org.testng.annotations.Test;

public class DisableTestcase {
    /**
     * if you want to disable the testcase  mujhe testcase run nhi karna hai
     */
    @Test(enabled = false)
    public void TestCaseZ()
    {
        System.out.println("testcase z");
    }
    @Test
    public void TestCaseM()
    {
        System.out.println("testcase m");

    }
    @Test
    public void TestCaseH()
    {
        System.out.println("testcase h");
    }
}
