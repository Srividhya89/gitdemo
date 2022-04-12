package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException
	
	{
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\kriss\\eclipse-workspace\\project\\src\\main\\java\\resources\\data.properties");
	
    prop.load(fis);
    String browserName = prop.getProperty("browser");
    		if(browserName.equals("chrome"))
    		{
    			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
    			driver = new ChromeDriver();
    			
    		}
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		  return driver;
 
    
    
    
    		
	}

}