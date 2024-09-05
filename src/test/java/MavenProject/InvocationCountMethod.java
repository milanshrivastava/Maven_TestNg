package MavenProject;

import org.testng.annotations.Test;

public class InvocationCountMethod {
    /**
     * if you want to run single testcase in multiple time then use invocation count
     * invocation timeout method is used run the testase is particular time frame (2 minit ki limit )
     */
    @Test(invocationCount = 5)
    public  void VerifyInvocationCountMethod()
    {
        System.out.println(" verify  the method");
    }
    @Test(invocationCount = 2,invocationTimeOut = 2)
    public  void VerifyInvocationCountMethod1()
    {
        System.out.println(" verify  the method1");
    }
}
