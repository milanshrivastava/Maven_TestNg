package MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepandsOfMethod {
    /**
     * we can  not use depends of method because  in testng we can excute testcase in parallel
     */
    @Test
    public void VerifyLoginPage()
    {
      //  Assert.assertTrue(false);
        System.out.println("verify login ");
    }
    @Test(dependsOnMethods ={"VerifyLoginPage"})
    public void VerifyHomePage()
    {
        System.out.println("verify Homepage");
    }
    @Test
    public void VerifyLogoutPage()
    {
        System.out.println("verify logout");
    }
}
