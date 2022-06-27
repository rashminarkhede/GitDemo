package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	public WebDriver driver;
	public ForgotPassword(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


@FindBy(id="user_email")
WebElement emailField;

@FindBy(xpath="//input[@name='commit']")
WebElement sendButton;

public ForgotPassword getEmail()
{
	//return emailField;
	emailField.sendKeys("rashmi123@gmail.com");
	return this;
}

public ForgotPassword clickButton()
{
	sendButton.click();
	return this;
}
}
