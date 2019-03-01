package com.testing.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.Expedia.Pages.LaunchPage;
import com.testing.Expedia.Pages.LoginPage;
import com.testing.Expedia.Pages.session.LandingPage;
import com.testing.Expedia.Pages.session.ProfilePage;
import com.testing.testcases.Base.BaseTest;

public class ProfileTest  extends BaseTest {
	
	@Test
	public void testProfile(){
		
		init("mozilla");
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginPage=launchPage.gotologinpage();
		Object Page = loginPage.dologin("khan.tanz@gmail.com", "***********");
		
		if (Page instanceof LoginPage)
			Assert.fail("Login Failed");
		
		else if (Page instanceof LandingPage)
		System.out.println("Login Successful");
			LandingPage	landingPage = (LandingPage)Page;
			landingPage.getMenu().Myaccount();
			landingPage.verifytitle("xxxxxxxx");
		ProfilePage profilePage = landingPage.gotoprofilepage();
		profilePage.verifytitle("My Travel Details");
	}

}
