package Parametirizes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleMethod {

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodForClass(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriver driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriver driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriver driver = new EdgeDriver();
        } else {
            throw new RuntimeException("please correct username: " + browserName);
        }
    }



    }



