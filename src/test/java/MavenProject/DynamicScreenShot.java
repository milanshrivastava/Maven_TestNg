package MavenProject;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver  =  new ChromeDriver();

        /*open the browser*/
        driver.get("https://www.flipkart.com");
        //maximize the window
        driver.manage().window().maximize();

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("/Users/atalshrivastava/Desktop/Screenshot 2024-08-27 at 10.42.13 PM" + timestamp() + ".png");
        FileUtils.copyFile(src,dest);


    }
    public static String timestamp(){
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss" ) .format( new Date());
    }
    }

