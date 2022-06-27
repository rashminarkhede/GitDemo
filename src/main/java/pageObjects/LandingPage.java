package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginButton;
	
	@FindBy(css="div.text-center")
	WebElement featuredText;
	
	/*
	 * public WebElement clickLoginButton() { return loginButton;
	 * 
	 * }
	 */
	
	public LoginPage clickLoginButton()
	{
		loginButton.click();
		LoginPage l=new LoginPage(driver);
		return l;
	}
	
	public WebElement getFeaturedText() {
		return featuredText;
	}
}
