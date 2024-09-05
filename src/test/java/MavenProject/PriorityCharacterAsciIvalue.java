package MavenProject;

import org.testng.annotations.Test;

public class PriorityCharacterAsciIvalue {
    /**
     *  Ascii value  ke aquirding  result ayega if define character here
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
    @Test(priority = 'A')
    public void TestCaseH()
    {
        System.out.println("testcase h");
    }
    @Test(priority = -40)
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
