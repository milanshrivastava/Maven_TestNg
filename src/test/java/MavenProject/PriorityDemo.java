package MavenProject;

import org.testng.annotations.Test;

public class PriorityDemo {
    /**
     *  testng follow Alphabetical order
     */
    @Test
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
    @Test
    public void TestCaseC()
    {
        System.out.println("testcase c");
    }

}
