package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
WebDriver driver;
public LoginPage(WebDriver driver){
	super (driver);
}

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmailAddress;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@type='submit']")
WebElement btnLogin;

//@FindBy(xpath="//h2[text()='My Account']")
//WebElement msgConfirmation1;

@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
WebElement msgConfirmation2;


public void setEmail(String email){
	txtEmailAddress.sendKeys(email);
}

public void setPassword(String passwrd){
	txtPassword.sendKeys(passwrd);
}

public void clickLogin(){
	btnLogin.click();
}

//public String getConfirmationmsg1() {
//	return(msgConfirmation1.getText());
//}

public String getConfirmationmsg2() {         //negative case
	return(msgConfirmation2.getText());
}
}
