package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement submit;
	
	@FindBy(linkText="Forgot Password?")
	WebElement Link;
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public ForgotPassword clickLink()
	{
		 Link.click();
		 ForgotPassword fp=new ForgotPassword(driver);
		 return fp;
	}
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement clickSubmit()
	{
		return submit;
	}
}
