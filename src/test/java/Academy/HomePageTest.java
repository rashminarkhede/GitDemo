package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePageTest extends base {

	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException, InterruptedException
	{
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getFeaturedText().isDisplayed());
		//lp.clickLoginButton().click();
		
		LoginPage l=lp.clickLoginButton();
		Thread.sleep(4000);
		
		//LoginPage l=new LoginPage(driver);
		l.getEmail().sendKeys(userName);
		l.getPassword().sendKeys(password);
		Thread.sleep(4000);
		//l.clickSubmit().click();
		//l.clickLink().click();
		
		ForgotPassword fp=l.clickLink();
		
		//ForgotPassword fp=new ForgotPassword(driver);
		Thread.sleep(4000);
		fp.getEmail();
		System.out.println("email entered");
		fp.clickButton();
		System.out.println("Clicked on set insteuction button");
		
	}

@DataProvider
public Object getData()
{
	Object [][] data=new Object[1][2];
	data[0][0]="dddg@gmail.com";
	data[0][1]="dggdh";
	
	
	
	return data;
}



}
