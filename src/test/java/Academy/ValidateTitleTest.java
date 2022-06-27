package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class ValidateTitleTest extends base {
	@Test
	public void title() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getFeaturedText().getText(), "FEATURED COURSES");
	}
}
