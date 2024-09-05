package Parametirizes;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.Keys;

public class ExampleMethodDataTest {
    @DataProvider(name = "test-Data")
    public Object[][] dataProviderFun() throws IOException {
        return getExcelData("/Users/atalshrivastava/Documents/dataprovider.xlsx", "Testcase");
    }
    public String[][] getExcelData(String filepath, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noofrow = sheet.getPhysicalNumberOfRows();
        int noofcolumn = sheet.getRow(0).getLastCellNum();
        Cell cell;
        String[][] data = new String[noofrow - 1][noofcolumn];
        for (int i = 1; i < noofrow; i++) {
            for (int j = 0; j < noofcolumn; j++) {
                row= sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }}
        return data;
    }@Test(dataProvider = "test-Data")
    public void verifyDataProviderWithExcel(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(courseName + " " + cityName);
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.quit(); // Close the browser after the test
    }
}

