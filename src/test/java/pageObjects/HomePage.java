package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
   WebDriver driver;
   //Constracter
   public HomePage(WebDriver driver) {
	   super(driver);
   }
   //Locators
   @FindBy(xpath="//span[text()='My Account']")
   WebElement lnkMyaccount;
   
   @FindBy(xpath="//a[text()='Register']")
   WebElement lnkRagister;
   
   @FindBy(xpath="//a[text()='Login']")
   WebElement lnkLogin;
   
   //ActionMethod
   public void clickMyaccount() {
	   lnkMyaccount.click();
   }
   
   public void clickRagister() {
	   lnkRagister.click();
   }
   
   public void clickLogin() {
	   lnkLogin.click();
   }
   
}
