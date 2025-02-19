package testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC003_LoginNegativeTest extends BaseClass{
@Test(groups="Master")
public void verifyNegativeLogin(){
	HomePage hp= new HomePage(driver);
	hp.clickMyaccount();
	hp.clickLogin();
	
	LoginPage lp=new LoginPage(driver);
	lp.setEmail(p.getProperty("invalidEmail"));
	lp.setPassword(p.getProperty("invalidPassword"));
	lp.clickLogin();
	
//	String currentURL=driver.getCurrentUrl();
//	Assert.assertEquals(currentURL,"https://tutorialsninja.com/demo/index.php?route=account/login","Invalid Credential");
	
	String confMsg=lp.getConfirmationmsg2();
	Assert.assertEquals(confMsg,"Warning: No match for E-Mail Address and/or Password.");
}
}

//Warning: No match for E-Mail Address and/or Password.