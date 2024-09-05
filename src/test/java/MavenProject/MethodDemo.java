package MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodDemo {
    public WebDriver driver;
    @BeforeMethod
    public void BeforeMethod()
    {
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void AfterMethod()
    {
        driver.close();
    }


    @Test
    public void VerifyOpenFlipkart() {

        // driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void VerifyOpenAmazon() {

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }


}
