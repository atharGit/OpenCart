package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC004_LoginDDT extends BaseClass{
    @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)  //getting data provider from different class
	public void verifyLoginDDT(String email,String pswd,String exp) {
    	
    	logger.info("***Starting_TC002_LoginDDT***");
		
    	try {
    	HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(email);
		lp.setPassword(pswd);
		
		lp.clickLogin();
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExist();
		
		if(exp.equalsIgnoreCase("Valid")) {
			
			if(targetPage==true) {
				
				macc.clickLogout();
				Assert.assertTrue(true);
				
			}
			else {
				
				Assert.assertTrue(false);
		       }
		}
		
		if(exp.equalsIgnoreCase("Invalid")) {
			if(targetPage==true) {
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
			
		}
    	}catch(Exception e) {
    		Assert.fail();
    	}
    
		logger.info("***Finished_TC004_LoginDDT***");
		
	}
   
}
	
	
	

