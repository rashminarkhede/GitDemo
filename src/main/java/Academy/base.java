package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\selenium-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	else if(browserName.equals("firefox"))
	{

	}
	

	
	return driver;
	}
}
