package MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsGroupOfMethod {
    /**
     * if child depend on parent  if parent is not executed then child execution is fails
     */
    @Test(groups = {"smoke"})
    public void VerifyLoginPage()
    {
       Assert.assertTrue(false);
        System.out.println("verify login ");
    }
    @Test(dependsOnMethods ={"smoke"})
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
