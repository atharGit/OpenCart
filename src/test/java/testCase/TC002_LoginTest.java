package testCase;

import org.openqa.selenium.devtools.v129.log.Log;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
    @Test(groups= {"Regression","Master"})
	public void verifyLogin() {
    	logger.info("***Starting_TC002_LoginTest***");
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on My Account Link");
		hp.clickLogin();
		logger.info("Providing Customer Details");
		LoginPage lp=new LoginPage(driver);
		logger.info("Providing Crendentials");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		logger.info("Clicked on Login button");
		lp.clickLogin();
		logger.info("Validating Expecting Message");
		MyAccountPage macc=new MyAccountPage(driver);
		boolean msg=macc.isMyAccountPageExist();
		Assert.assertEquals(msg, true);
		//Assert.assertTrue(msg);
		logger.info("***Finished_TC002_LoginTest***");
		
	}
   
}
