package MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTestcase {
    /**
     * whenever does not care about the parent result and we want to executed testcase any condition
     * then use allwaysrun
     */


    @Test
    public void VerifyLoginPage()
    {
       // Assert.assertTrue(false);
        System.out.println("verify login ");
    }
    @Test(dependsOnMethods ={"VerifyLoginPage"},alwaysRun = true)
    public void VerifyHomePage()
    {
        System.out.println("verify Homepage");
    }
    @Test
    public void VerifyLogoutPage()
    {
        System.out.println("verify logout");
    }
};



