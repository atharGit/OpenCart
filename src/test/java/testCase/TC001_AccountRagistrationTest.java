package testCase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRagistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRagistrationTest extends BaseClass{

@Test(groups={"Sanity","Master"})
public void verifyAccountRagistration() {
	logger.info("***Starting TC001_AccountRagistrationTest***");
	try {
	HomePage hp=new HomePage(driver);
	hp.clickMyaccount();
	logger.info("Clicked on My Account Link");
	hp.clickRagister();
	logger.info("Clicked on Registar Page");
	AccountRagistrationPage arp=new AccountRagistrationPage(driver);
	
	logger.info("Providing Customer Details");
	arp.setFirstName(randomString());
	arp.setLastName(randomString());
	arp.setEmail(randomString()+"@mail.com");
	arp.setTelePhone(randomNumber());
	String password=randomAlphaNumeric();
	arp.setPassword(password);
	arp.setCnfrmPassword(password);
	arp.setNewsLetter();
	arp.setAgrrement();
	arp.clickContinue();
	logger.info("Validating Expecting Message");
	String confMasg= arp.getConfirmationmsg();
	
	if(confMasg.equals("Your Account Has Been Created!")) {
		Assert.assertTrue(true);
	}
	else {
		logger.error("Test Failed..");
		logger.debug("Debug Log..");
		Assert.assertTrue(false);
	}
	}
	catch(Exception e){
		Assert.fail();
	}
	
	logger.info("Finished TC001_AccountRagistrationTest");
	//Assert.assertEquals(confMasg,"Your Account Has Been Created!");
}
	
}

