package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.magento.Home;
import com.abc.magento.Login;
import com.abc.magento.Logout;

public class MagentoTest {
	WebDriver driver;
	@Test
	public  void magento() {
		String url="http://www.magento.com";
		
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get(url);
	      
	      Home h=new Home(driver);
	      h.clickOnMyacc();
	      
	      Login l1=new Login(driver);
	      l1.typeEmail("nitinmanjunath1991@gmail.com");
	      l1.typePassword("Welcome123");
	      l1.clickOnLogin();
	      
	      Logout l2=new Logout(driver);
	      l2.clickOnLogout();
	      driver.quit();
	}


}
