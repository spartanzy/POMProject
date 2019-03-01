package com.testing.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.Expedia.Pages.LaunchPage;
import com.testing.Expedia.Pages.LoginPage;
import com.testing.Expedia.Pages.session.LandingPage;
import com.testing.Expedia.Pages.session.ProfilePage;
import com.testing.testcases.Base.BaseTest;
import com.testing.util.ExtentManager;

public class LoginTest  extends BaseTest {

	
	@Test
	public void testLogin(){
		ExtentReports extend = ExtentManager.getInstance();
		ExtentTest test =extend.startTest("Login Test", "Login test has started ");
		
		init("mozilla");
		try{
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginPage=launchPage.gotologinpage();
		test.log(LogStatus.INFO, "going to Login page");
		Object Page = loginPage.dologin("khan.tanz@gmail.com", "Mat83terial");
		
		if (Page instanceof LoginPage){
			Assert.fail("Login Failed");
		test.log(LogStatus.FAIL, "Login Failed");
		}else if (Page instanceof LandingPage){
		System.out.println("Login Successful");
		test.log(LogStatus.PASS, "Login Passed");
		}
			LandingPage	landingPage = (LandingPage)Page;
			landingPage.getMenu().Myaccount();
			landingPage.verifytitle("xxxxxxxx");
		}finally{	
			extend.endTest(test);
			extend.flush();
		}
	}
	

	
}
