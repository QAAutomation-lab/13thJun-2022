package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class ActitimeLogin extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	String result;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			boolean validationRes=getPageTitle("actiTIME - Enter Time-Track").equals("actiTIME - Enter Time-Track");
			if(validationRes) {
				result="Passed";
			}else {
				result="Failed";
			}
			Assert.assertTrue(validationRes, "Login page validation failed");	
	}
	@AfterTest
	public void cleanUp() {
		ExcelUtility.updateCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 3,result);
		tearDown();
	}
}
