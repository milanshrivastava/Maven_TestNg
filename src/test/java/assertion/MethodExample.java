package assertion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class MethodExample {

    @Test
    public void VerifyAssertSoft()
    {
        SoftAssert  softassert =new SoftAssert();
        WebDriver driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //click on it create account link
        driver.findElement(By.xpath(" //u[text()='Create a new account']")).click();
        String text = driver.findElement(By.xpath(" //td[text()='Create a Rediffmail account']")).getText();
       softassert.assertEquals(text,"Create a Rediffmail account","text should be match");
        WebElement hi = driver.findElement(By.xpath("(//input[starts-with(@name,'gender')])[2]"));
       softassert.assertFalse( hi.isSelected(),"radio buttoin should be cickable");
       softassert.assertAll();



    }

}
