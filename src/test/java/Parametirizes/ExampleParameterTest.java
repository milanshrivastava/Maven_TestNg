package Parametirizes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleParameterTest {
    @Parameters({"courseName", "cityName"})
    @Test
    public void VerifyGooglePage(String courseName, String cityName) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox= driver.findElement(By.name("q"));
        searchbox.sendKeys(courseName + " " + cityName);
        searchbox.sendKeys(Keys.ENTER);


        driver.quit();
    }
}
