package academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {

	@Test
	public void basepageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("abc@qa.com");
		lp.getPassword().sendKeys("123456");
		lp.getLogin().click();
		
		
		
		
		
	}
	
}
