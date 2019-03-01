package com.testing.testcases.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testing.util.ExpConstants;

public class BaseTest {

	
	public WebDriver driver; 
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	public void init(String btype){
		
		
		if(btype.equals("mozilla")){
			driver = new FirefoxDriver();
		}
		else if (btype.equals("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", ExpConstants.CHROME_DRIVER_EXE);
			driver = new ChromeDriver();
			
	} else if(btype.equals("IE")){
		
		System.setProperty("Webdriver.ie.driver", ExpConstants.IE_DRIVER_EXE);
		driver =new InternetExplorerDriver();
	}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	}
	
}
