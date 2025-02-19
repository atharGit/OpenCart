package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRagistrationPage extends BasePage{
	WebDriver driver;
  public AccountRagistrationPage(WebDriver driver) {
	  super(driver);
  }
  
  @FindBy(xpath="//input[@id='input-firstname']")
  WebElement txtFirstName;
  
  @FindBy(xpath="//input[@id='input-lastname']")
  WebElement txtLastName;
  
  @FindBy(xpath="//input[@id='input-email']")
  WebElement txtEmail;
  
  @FindBy(xpath="//input[@id='input-telephone']")
  WebElement txtTelePhone;
  
  @FindBy(xpath="//input[@id='input-password']")
  WebElement txtPassword;
  
  @FindBy(xpath="//input[@id='input-confirm']")
  WebElement txtConfirmPassword;
  
  @FindBy(xpath="//input[@value='0']")
  WebElement ckbNewsletter;
  
  @FindBy(xpath="//input[@name='agree']")
  WebElement ckbAgree;
  
  @FindBy(xpath="//input[@value='Continue']")
  WebElement btnContinue;
  
  @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
  WebElement msgConfirmation;
  
  
  public void setFirstName(String fName) {
	  txtFirstName.sendKeys(fName);
  }
  
  public void setLastName(String lName) {
	  txtLastName.sendKeys(lName);
  }
  
  public void setEmail(String email) {
	  txtEmail.sendKeys(email);
  }
  
  public void setTelePhone(String tel) {
	  txtTelePhone.sendKeys(tel);
  }
  
  public void setPassword(String pas) {
	  txtPassword.sendKeys(pas);
  }
  
  public void setCnfrmPassword(String cnPas) {
	  txtConfirmPassword.sendKeys(cnPas);
  }
  
  public void setNewsLetter() {
	  ckbNewsletter.click();
  }
  
  public void setAgrrement() {
	  ckbAgree.click();
  }
  
  public void clickContinue() {
	  //sol 1
	  btnContinue.click();
	  //sol 2
	  //btnContinue.submit();
	  //sol 3
	  //Actions ac=new Actions(driver);
	  //ac.moveToElement(btnContinue).click().perform();
	  //sol 4
	  //JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("argument[0].click", btnContinue);
	  //sol 5
	  //btnContinue.sendKeys(Keys.RETURN);
	  //sol 6
	  //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	  //wait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	  
  }
  
  public String getConfirmationmsg() {
	  try {
	  return (msgConfirmation.getText());
	  } catch(Exception e) {
		  return(e.getMessage());
	  }
  }
  
  
  }
  
 
  

