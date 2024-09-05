package MavenProject;

import org.testng.annotations.Test;

public class PriorityDefineDuplicate {
    /**
     * duplicate priority define  karte hai bah alphabetical order mai aayega
     */
    @Test(priority = 1)
    public void TestCaseZ()
    {
        System.out.println("testcase z");
    }
    @Test(priority = 1)
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
}
