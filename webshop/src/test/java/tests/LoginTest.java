package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;
import utilities.MyListener;
import utilities.ReadExcel;
import utilities.WriteExcel;


@Listeners(value=MyListener.class)
public class LoginTest extends TestBase {
	LoginPage logInPage;
	ReadExcel excelRead = new ReadExcel();
	WriteExcel w = new WriteExcel();
	static int rowNum=0;
	@DataProvider(name = "loginData")
	public Object[][] loginData() throws IOException{
		int LastRow = excelRead.getLastRow("D:\\Parameter Values\\TestData.xls", "Sheet1");
		Object[][] mydata = new Object[LastRow+1][2];
		for(int i=0; i<=LastRow; i++) {
			mydata[i][0] = excelRead.readExcel("D:\\Parameter Values\\TestData.xls", "Sheet1", i, 0);
			mydata[i][1] = excelRead.readExcel("D:\\Parameter Values\\TestData.xls", "Sheet1", i, 1);
		}
		return mydata;
	}
  @Test(dataProvider="loginData")
  public void loginApplication(String u, String p) throws IOException {
	 logInPage = new LoginPage(driver);
	 logInPage.clickLogin();
	 logInPage.logINDetails(u,p);
	 try {
		 logInPage.clickOnLogOut();
		 w.Excelwrite("D:\\Parameter Values\\TestData.xls", "Sheet1", rowNum, 2, "Pass");
	 }catch(Exception e) {
		 Assert.fail("Sign Out not Present");
		 w.Excelwrite("D:\\Parameter Values\\TestData.xls", "Sheet1", rowNum, 2, "Fail");
	 }
	 rowNum=rowNum+1;
  }
  
  
}
