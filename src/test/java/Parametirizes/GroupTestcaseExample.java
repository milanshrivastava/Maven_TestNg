package Parametirizes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTestcaseExample {
    @Test(groups={"smoke"})
    public void VerifyLoginPage()
    {
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        System.out.println("verify login ");
    }
    @Test(groups={" sanity"})
    public void VerifyLoginPageSanity()
    {
        System.out.println("verify  sanity login ");
    }
}
