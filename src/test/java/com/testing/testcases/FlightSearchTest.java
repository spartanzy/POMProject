package com.testing.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.Expedia.Pages.FlightReservePage;
import com.testing.Expedia.Pages.FlightResultsPage;
import com.testing.Expedia.Pages.LaunchPage;
import com.testing.Expedia.Pages.LoginPage;
import com.testing.testcases.Base.BaseTest;
import com.testing.util.ExtentManager;

public class FlightSearchTest  extends BaseTest {

	
	
	@Test
	public void testLogin(){
		ExtentReports extend = ExtentManager.getInstance();
		ExtentTest test =extend.startTest("Login Test", "Login test has started ");
		
		init("mozilla");
		try{
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		FlightReservePage flightPage=launchPage.gotoFlightPage();
		test.log(LogStatus.INFO, "going to flight page");
		FlightResultsPage Flightresults = flightPage.flightResultOneway("12/03/2018", "BLR", "GOI");
		}finally{	
			extend.endTest(test);
			extend.flush();
		}
	
	}
}
