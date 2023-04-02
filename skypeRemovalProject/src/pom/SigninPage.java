package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ganeric.WorkLib;

public class SigninPage {
	
	@FindBy(name = "loginfmt") private WebElement usnTB;
	@FindBy(id = "idSIButton9") private WebElement nextButton;
	@FindBy(name = "passwd") private WebElement passwordTB;
	@FindBy(xpath = "//input[@id='idSIButton9']") private WebElement signinButton;
	@FindBy(id ="idBtn_Back") private WebElement noButton;
	@FindBy(xpath = "//div[@data-text-as-pseudo-element='Got it!']") private WebElement gotitButtElement;
	
	public SigninPage(WebDriver driver) 
	{
	     PageFactory.initElements(driver,this);
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}
	
	
	public WebElement getNoButton() {
		return noButton;
	}
	
	public WebElement getGotitButtElement() {
		return gotitButtElement;
	}


	public void loginOp(String usn,String pass) throws InterruptedException
	{
	    WorkLib wb = new WorkLib();
		usnTB.sendKeys(usn);
		Thread.sleep(1000);
		nextButton.click();
		Thread.sleep(1000);
		passwordTB.sendKeys(pass);
		signinButton.click();
		Thread.sleep(1000);
		noButton.click();
		Thread.sleep(10000);
		wb.doubleClick(gotitButtElement);
		
		
		
	}
	
	
	

}
